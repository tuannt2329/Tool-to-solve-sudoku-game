package java1;

import javax.swing.*;
import java.awt.*;

public class MatrixTextField extends JTextField {
    public static MatrixTextField[][] jt;
    public MatrixTextField(){
        super("",CENTER);
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        setFont(new Font(Font.DIALOG,Font.PLAIN,25));
        this.setHorizontalAlignment(CENTER);
        setOpaque(true);
    }
    public static JTextField[][] setMatrixTextField(){
        jt = new MatrixTextField[9][9];
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                jt[i][j] = new MatrixTextField();
            }
        }
        return jt;
    }
    public static String[][] getMatrixTextField(){
        String[][] matrix = new String[9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                matrix[i][j]=jt[i][j].getText();
                if(!jt[i][j].getText().isEmpty()){
                    jt[i][j].setForeground(Color.RED);
                }
                else {
                    jt[i][j].setForeground(Color.BLACK);
                }
            }
        }
        return matrix;
    }




}
