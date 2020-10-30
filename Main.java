import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JTextField nameInput;

  JLabel nameOutput;

  JButton sayHelloButton;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main JPanel
    mainPanel = new JPanel();
    // turn on the manual layouts
    mainPanel.setLayout(null);
    // add the panel to JFrame to see it
    frame.add(mainPanel);
 
    
    // initialize the JTextField
    nameInput = new JTextField();

    // set the location and size for the input field 
    nameInput.setBounds(200, 100, 400, 30);

    // add the input to the main panel 
    mainPanel.add(nameInput);


    // initialize the JButton
    sayHelloButton = new JButton("Say Hello");

    // add action listener to the buttons 
    sayHelloButton.addActionListener(this);

    // give thte button an action command 
    sayHelloButton.setActionCommand("say hello");

    // set the location and size of the button
    sayHelloButton.setBounds(340, 400, 120, 20);

    // add the button to the main panel 
    mainPanel.add(sayHelloButton);


    // the the label where the output text will appear
    nameOutput = new JLabel();

    // set the location and size of the label 
    nameOutput.setBounds(205, 200, 400, 30);

    // add the label to the main panel 
    mainPanel.add(nameOutput);


  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if ( command.equals("say hello")){
      // say hello button was pressed
      // get the input as a String
      String outputText = nameInput.getText();

      nameOutput.setText("Hello " + outputText);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
