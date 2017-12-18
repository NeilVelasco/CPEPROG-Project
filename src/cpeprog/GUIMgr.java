/*
 *  © 2017 by Patrick Matthew Chan
 *  File: GUIMgr.java
 *  Package: cpeprog
 *  Description: The GUIMgr class.
 */
package cpeprog;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class GUIMgr{
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Main Class ~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        data=new HashMap<>();
        
        //open Start Menu
        StartMenu startMenuHandle=(StartMenu)getOrGenerateKV("startMenuHandle", new StartMenu(data));
        openGUI(startMenuHandle, new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                closeGUI();
                System.exit(0);
            }
        });
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~ Global Variables ~~~~~~~~~~~~~~~~~~~~~~~~~//
    static HashMap<String, Object> data;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Methods ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //somewhat backend
    static void moveToGUIStackTop(JFrame window){//adds, or moves to top of GUI class "call stack"
        //this takes advantage of the fact that there is only one instance of a static object (data)
        Stack<JFrame> guiStack=(Stack<JFrame>)data.get("guiStack");
        if(guiStack==null){
            guiStack=new Stack<>();
            guiStack.push(window);
            data.put("guiStack", guiStack);
        } else {
            while(guiStack.contains(window)){
                guiStack.remove(window);
            }
            guiStack.push(window);
        }
    }
    static Stack<JFrame> guiStack(){
        Stack<JFrame> guiStack=(Stack<JFrame>)data.get("guiStack");
        if(guiStack==null){
            guiStack=new Stack<>();
            data.put("guiStack", guiStack);
        }
        return guiStack;
    }
    
    
    //default generate if not yet generated for data hashmap
    /**
     * default generate if not yet generated for data hashmap
     *      oh, and don't forget to cast to your type, if needed
     * @param key
     * @param newObject object placed in generated KV pair
     * @return 
     */
    static Object getOrGenerateKV(String key,Object newObject){
        Object obj=data.get(key);
        if(obj==null){
            obj=newObject;
            data.put(key, obj);
        }
        return obj;
    }
    //opening GUIs
        /**open  GUI windows
         * Default behavior:
         *      current window set invisible
         *      next window put to top of stack
         *      default close operation==dispose
         *      next window set visible
         * @param GUI 
         */
    static void openGUI(JFrame GUI,WindowListener windowListener){
        if(!guiStack().isEmpty()){
            guiStack().peek().setVisible(false);
        }
        moveToGUIStackTop(GUI);
        GUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //remove other window listeners
        for (WindowListener wl : GUI.getWindowListeners()) {
            GUI.removeWindowListener(wl);
        }
        //set new windowlistener
        GUI.addWindowListener(windowListener);
        GUI.setVisible(true);
    }
    //add to windowlistener's windowclosed/windowclosing for closing GUIs
    static void closeGUI(){
        try {
            Thread.sleep(150);//just for effects
        } catch (InterruptedException ex) {}
        guiStack().pop();
        if(!guiStack().isEmpty()){
            guiStack().peek().setVisible(true);
        }
    }
    static void replaceStackTopGUI(JFrame GUI,WindowListener windowListener){
//        if(!guiStack().isEmpty()){
//            JFrame curGUI=guiStack().peek();
//            //remove window listeners to not activate next in stack's visibility
//            for (WindowListener wl : curGUI.getWindowListeners()) {
//                GUI.removeWindowListener(wl);
//            }
//            //to close current window
//            curGUI.dispatchEvent(new WindowEvent(curGUI,WindowEvent.WINDOW_CLOSING));
//            try {
//                Thread.sleep(150);//just for effects
//            } catch (InterruptedException ex) {}
//            //finally pop from GUI stack
//            guiStack().pop();
//        }
//        openGUI(GUI, windowListener);
        openGUI(GUI, windowListener);
        JFrame temp=guiStack().pop();
        guiStack().pop();//pop off the gui to be replaced
        guiStack().push(temp);
    }
    
    
    
    //Note: you can put random static methods here, and simply call it anywhere under this class
    
}