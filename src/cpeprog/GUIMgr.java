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
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Properties;
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
    public static HashMap<String, Object> data;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Methods ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //somewhat backend
    public static void moveToGUIStackTop(JFrame window){//adds, or moves to top of GUI class "call stack"
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
    public static Stack<JFrame> guiStack(){
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
     * @param newVal object placed in generated KV pair
     * @return 
     */
    public static <V> V getOrGenerateKV(String key,V newVal){
        V obj=(V)data.get(key);
        if(obj==null){
            obj=newVal;
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
    public static void openGUI(JFrame GUI,WindowListener windowListener){
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
    public static void closeGUI(){
        try {
            Thread.sleep(150);//just for effects
        } catch (InterruptedException ex) {}
        guiStack().pop();
        if(!guiStack().isEmpty()){
            guiStack().peek().setVisible(true);
        }
    }
    public static void replaceStackTopGUI(JFrame GUI,WindowListener windowListener){
        openGUI(GUI, windowListener);
        JFrame temp=guiStack().pop();
        guiStack().pop();//pop off the gui to be replaced
        guiStack().push(temp);
    }
    //=============================================================================================================//
    
    //calling the database (I noticed it was being too repetitive)
    public static Connection connectSQL(){
        Connection con=null;
//        if(con==null){
        String url = "jdbc:mysql://localhost:3306/recipes";
        Properties prop = new Properties();
        prop.setProperty("user", "root");
        prop.setProperty("password", "");
        Driver d;
        try {
            d = new com.mysql.jdbc.Driver();
            con = d.connect(url, prop);
            data.put("con", con);
        } catch (SQLException sqle){
            System.err.println("SQL Connect Error:\n"+sqle);
            sqle.printStackTrace();
        }
//        }
        return con;
    }
    public static boolean isSQLConnected(Connection con){
        try {
            if(con!=null && con.isValid(0)){
                System.out.println("SQL Connection Successful");
                return true;
            } else {
                System.out.println("SQL Connection Failed. Make sure MySQL is Started and con variable is properly initialized.");
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("SQL Connection Failed. Make sure MySQL is Started and con variable is properly initialized.");
            ex.printStackTrace();
            return false;
        }
    }    
    public static void closeSQLConnection(Connection con){
       if(con!=null){
           try {
               con.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       } 
    }
    
    
    
    //Note: you can put random static methods here, and simply call it anywhere under this class
    
}