
package nguyenthituyetmai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame {
    private JTextField display;
    private double result = 0;
    private String lastCommand = "=";
    private boolean start = true;
    private boolean isDarkMode = false;
    private JPanel buttonPanel;
    public Calculator(){
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial",Font.BOLD, 28));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display,BorderLayout.NORTH);
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4, 10, 10));
        String[] buttons = {
            "C", "X3", "%", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "=", "v",
            "Dark", "3.14", "e", "X!"
        };
    for (String text : buttons) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD,24));
        
        
            
        }
                
        
        
    }

   
    }
    

