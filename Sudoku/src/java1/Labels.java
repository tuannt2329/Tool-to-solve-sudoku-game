package java1;

import javax.swing.*;
import java.awt.*;

public class Labels extends JLabel {
    static Labels label;
    public Labels(ImageIcon icon, int center){
        super(icon,center);
        setFont(new Font(Font.DIALOG,Font.PLAIN,10));
        setOpaque(true);
    }

    public static JLabel createLabel(){
        ImageIcon icon = new ImageIcon("images/Untitled2.png");
        label = new Labels(icon,JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.RED);
        return label;
    }
}
