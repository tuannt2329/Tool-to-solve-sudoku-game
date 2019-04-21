package java1;

import javax.swing.*;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        JTextField[][] jt= MatrixTextField.setMatrixTextField();

        MatrixPanel mp = new MatrixPanel();
        mp.CreateMatrixPanel();
        mp.addTextField(jt);

        EASTPanel bp = new EASTPanel();
        Butons btn = new Butons();
        bp.addButon(btn.btnReset);
        bp.addButon(btn.btnSolve);
        bp.addButon(btn.btnClose);


        bp.addLabel(Labels.createLabel());
        bp.addplc();
        bp.addpbc();

        JframeSudoku jf = new JframeSudoku();
        jf.addPanelCENTER(mp);
        jf.addPanelEAST(bp);

        btn.actionButtonClick();

    }
}
