/*
 *  © 2017 by Patrick Matthew Chan
 *  File: GUIManager.java
 *  Package: cpeprog
 *  Description: The GUIManager class.
 */
package cpeprog;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import javax.swing.JFrame;
/* @author Patrick Matthew J. Chan [LBYCP24-EQ1]*/
public class GUIManager{
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Main Class ~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        data=new HashMap<>();
        //start menu
        StartMenu sm=new StartMenu(data);
        data.put("StartMenuHandle", sm);//data label convention: CamelCase
        sm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });//close when start exits
        sm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sm.setVisible(true);
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~ Global Variables ~~~~~~~~~~~~~~~~~~~~~~~~~//
    static HashMap<String, Object> data;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Methods ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
    
}