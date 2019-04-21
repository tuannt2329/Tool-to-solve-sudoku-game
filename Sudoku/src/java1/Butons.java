package java1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Butons extends JButton{
	JButton btnClose,btnSolve,btnReset;
	int[][] matrixint;

	public Butons(){

		btnClose = new JButton("Close");
		btnReset = new JButton("Reset");
		btnSolve = new JButton("Solve");
		matrixint = new int[9][9];
	}

	public void actionButtonClick(){
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnSolve.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				setTextfieldColor();

				MatrixData data = new MatrixData(MatrixTextField.getMatrixTextField());

				DataProcessing dp = new DataProcessing(data.getMatrix());

				if (dp.Solve() == 1) {
					for (int i = 0; i < 9; i++) {
						for (int j = 0; j < 9; j++) {
							MatrixTextField.jt[i][j].setText(data.convertInt2String(dp.getMatrixInt())[i][j]);
						}
					}
				}
			}
		});

		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ResetMatrix(MatrixTextField.jt);
				for (int i = 0; i < 9; i ++){
					for (int j = 0; j < 9; j++){
						MatrixTextField.jt[i][j].setBackground(Color.WHITE);
						MatrixTextField.jt[i][j].setForeground(Color.BLACK);

					}
				}
			}
		});
	}

	private void ResetMatrix(MatrixTextField[][] mtf){
		for (int i = 0; i < 9; i ++){
			for (int j = 0; j < 9; j++){
				mtf[i][j].setText("");
			}
		}
	}

	private void setTextfieldColor(){
		for (int i = 0; i < 9; i ++){
			for (int j = 0; j < 9; j++){
				try {
					Integer.parseInt(MatrixTextField.jt[i][j].getText());
				}catch (Exception ex){
					MatrixTextField.jt[i][j].setBackground(Color.getColor(""));

				}
			}
		}
	}
}
