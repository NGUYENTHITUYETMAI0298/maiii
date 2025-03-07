
package nttm;

import javax.swing.*;
public class InputDialogExample {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"What's yer name,pardner?");
        JOptionPane.showMessageDialog(null,"Yeehaw," + name);
        
        
    }
    
}
