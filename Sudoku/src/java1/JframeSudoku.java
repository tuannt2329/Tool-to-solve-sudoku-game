package java1;

import javax.swing.*;
import java.awt.*;

public class JframeSudoku {
    private JFrame jFrame;

    public JframeSudoku(){
        jFrame = new JFrame("Sudoku Result");
        jFrame.setSize(600,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setLayout(new BorderLayout());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    public void addPanelEAST(JPanel jp){
        jFrame.add(jp,BorderLayout.EAST);
    }
    public void addPanelCENTER(JPanel jp){
        jFrame.add(jp,BorderLayout.CENTER);
    }
}
