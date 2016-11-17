/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**Creates user interface that allows user to enter 64 bit signed binary string
 * that is then converted to decimal. 
 * signed values must be preceded by '-'
 * Processing occurs in parseBinary()method
 * @author Ron Miller SER216 10/25/2016
 */
public class Assignment2 extends JFrame {
    // initialize string used for input output
    private String inStr ="";
    private String outString="";
    // create new panel
    private final JPanel jp = new JPanel();
    // create new label
    private JLabel jl = new JLabel();
    //Text field for user input
    private final JLabel binStr = new JLabel("Binary String");
    private JTextField input = new JTextField(30);
    //text field to display output
    private final JLabel decStr = new JLabel("Decimal String");
    private JTextField output = new JTextField(30);
    //submit button
    private final JButton submit = new JButton("Convert to Decimal");

    
  
    
    
    
  /**
 * Constructor
 */
        public Assignment2(){
            // set title of the popup window
            setTitle("Lab 4: Convert Binary to Decimal");
            // make it visible
            setVisible(true);
            //set intital size of box
            setSize(800,160);
            //set what operation occurs on close
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            jp.setLayout(null);
            //add a label to the input field
            jp.add(binStr);
            binStr.setLocation(10,10);
            binStr.setSize(380,25);            
            // add the input text field
            jp.add(input);
            input.setLocation(400,10);
            input.setSize(380,25);
            // provide an action listener for the input field
            input.addActionListener(new ActionListener(){
                // have the method get text in prompt and add to string
                //the string will be processed and the result will be displayed
                //in the output textbox
                // this event allows the "enter" key to be used in lieu of the submit button
                public void actionPerformed(ActionEvent e)
                {
                    inStr = input.getText();
                   output.setText(parseBinary(inStr));
                }
            });
            
            jp.add(jl);
            // add output text box
            //add a label to the input field
            jp.add(decStr);
            decStr.setLocation(10,45);
            decStr.setSize(380,25);                
            jp.add(output);
            output.setLocation(400,45);
            output.setSize(380,25);            
            // cont allow mods to output field from user
            output.setEditable(false);
            // add submit button to the popup
            jp.add(submit);
            submit.setLocation(10,80);
            submit.setSize(770,25);
            // have the method get text in prompt and add to string
            //the string will be processed and the result will be displayed
            //in the output textbox            
            // Allow submit button to submit
            submit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    inStr = input.getText();
                   output.setText(parseBinary(inStr));                    
                }
            });
            add(jp);
        }
        
       /**
       * Accepts string argument and converts from binary string to decimal string
       * catches any characters that are not 0 or 1 and provides error output to user in
       * the "Decimal String" text box
       * 
     * @param binaryString String entered by user through GUI
     * @return outString String return to user GUI after processing
       */       
        public String parseBinary(String binaryString){
            
            // creates string to store error
            String error="";
            // System limited to 63 binary characters. This provides feedback
            //to user if they exceed the number of possible binary digits
            if(binaryString.length()>63){
                error="Maximum 63 binary characters";
            }else if(binaryString.length()<1){
                error="No characters entered";
            }else{
            
            // iterate through input string ssearching for non 0 or 1 characters
            // if non matching characters are found, character(as string) is stored in error String
            // to be used in error message to user
            for( int i=0;i<binaryString.length();i++){
                //checking for match of 1 or 0
                if(!("0".equals(binaryString.substring(i,i+1)) || "1".equals(binaryString.substring(i,i+1)))){
                    //storing character as string
                    error = binaryString.substring(i,i+1);
                    //breaks out so if multiple incorrect characters are stored
                    //user only sees first bad character
                    break;
                    
                }
            }
            }
            try{
            // parsing Long to string
            //used Long to give user more flexibility but cannot go to infinity
            Long i=Long.parseLong(binaryString,2);
            // add output to string 
            outString = Long.toString(i);
            }
            // catch exception if unable to parse due to string length or bad character
            catch(NumberFormatException exc){
        
                
                //provide feedback string to user with errors
                outString= "Invalid Format for Binary String - Illegal Character: "+ error;
                
            }
            //return string for use in listeners
            return outString;
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // open the popup window by creating new Binary object
        Assignment2 test= new Assignment2();
    }
    
}
