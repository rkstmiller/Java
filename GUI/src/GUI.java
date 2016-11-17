import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{




JLabel player1Store, player2Store;
JButton bin1, bin2, bin3, bin4, bin5, bin6, bin7, bin8, bin9, bin10, bin11, bin12;
JMenuBar menuBar;
JMenu file;
JMenuItem reset, exit;


public GUI()
{
    event e = new event();

    setLayout(new GridLayout(2, 6));

    menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    file = new JMenu("File");
    menuBar.add(file);

    reset = new JMenu("Reset");
    file.add(reset);

    exit = new JMenu("Exit");
    file.add(exit);

    quitGame s = new quitGame();
    exit.addActionListener(s);

    restartGame r = new restartGame();
    exit.addActionListener(s);

    Container pane = this.getContentPane();


    JPanel top = new JPanel();
    top.setLayout(new GridLayout(1, 4));

    bin1 = new JButton("4");
    bin1.setSize(100, 100);
    top.add(bin1);

    bin2 = new JButton("4");
    top.add(bin2);
    bin3 = new JButton("4");
    top.add(bin3);
    bin4 = new JButton("4");
    top.add(bin4);
    bin5 = new JButton("4");
    top.add(bin5);
    bin6 = new JButton("4");
    top.add(bin6);

    pane.add(top);

}





public class event implements ActionListener{
    public void actionPerformed(ActionEvent e){
        String option = e.getActionCommand();
    }
}

//METHOD TO QUIT
public class quitGame implements ActionListener {
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}

//METHOD TO RESTART
public class restartGame implements ActionListener {
    public void actionPerformed(ActionEvent e){
        // RESTART CODE////////////
        ///////////////////////////
        ///////////////////////////
        ///////////////////////////
    }
}


public static void main(String args[]){
    GUI gui = new GUI();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setVisible(true);
    gui.setSize(400, 400);
    gui.setTitle("M A N C A L A");
    gui.setResizable(false);



}
}