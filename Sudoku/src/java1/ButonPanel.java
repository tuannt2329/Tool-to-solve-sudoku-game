package java1;

import javax.swing.*;
import java.awt.*;

public class ButonPanel extends JPanel{
    JPanel pb,pbc;

    public ButonPanel(){
        super(new BorderLayout());
        pb = new JPanel();
        pb.setLayout(new BoxLayout(pb,BoxLayout.PAGE_AXIS));
        this.add(pb,BorderLayout.SOUTH);
        pbc = new JPanel(new FlowLayout(FlowLayout.LEADING));
    }
    public void addButon(JButton btn){
        pbc.add(btn);
    }
    public void addpbc(){
        pb.add(pbc);
    }

}
