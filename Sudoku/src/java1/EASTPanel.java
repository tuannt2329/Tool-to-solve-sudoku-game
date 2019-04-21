package java1;

import javax.swing.*;
import java.awt.*;

public class EASTPanel extends JPanel{
    JPanel pbc,pb;
    JPanel plc,pl;

    public EASTPanel(){
        super(new BorderLayout());
        pl = new JPanel();
        pl.setLayout(new BoxLayout(pl,BoxLayout.PAGE_AXIS));
        this.add(pl,BorderLayout.CENTER);
        plc = new JPanel(new FlowLayout(FlowLayout.LEADING));

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

    public void addLabel(JLabel label){
        plc.add(label);
    }

    public void addplc(){
        pl.add(plc);
    }

}
