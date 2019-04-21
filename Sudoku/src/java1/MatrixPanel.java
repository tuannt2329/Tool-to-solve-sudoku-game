package java1;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MatrixPanel extends JPanel {
	JPanel[][] mp;

	public MatrixPanel(){
		this.setLayout(new GridLayout(3,3));
		mp = new JPanel[3][3];
	}

	public void CreateMatrixPanel(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				mp[i][j] = new JPanel(new GridLayout(3,3));
				mp[i][j].setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
				this.add(mp[i][j]);
			}
		}
	}
	static int x,y;
	public void addTextField(JTextField[][] jl){
		for (int i = 0; i < 9; i++){
			for (int j = 0; j < 9; j++){
				int	k=i;
				int l=j;

				mp[i/3][j/3].add(jl[i][j]);

				jl[i][j].addKeyListener(new KeyListener() {

					@Override
					public void keyTyped(KeyEvent e) {


					}

					@Override
					public void keyReleased(KeyEvent e) {
						if(ktdulieuvao()==false && jl[x][y].getText().toString().isEmpty()==false)
						{
							JOptionPane.showMessageDialog(null, "Nhập dữ liệu là số từ 1 đến 9 ");
							jl[x][y].setText("");

						}else
						{
							if(kiemtratrungso()==true)
							{
								JOptionPane.showMessageDialog(null, "Trùng số");
								jl[x][y].setText("");
							}
						}
				}

					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub



					}
					public Boolean ktdulieuvao() {
						try {
							int temp=Integer.parseInt(jl[k][l].getText().toString());

							if(temp<1 || temp>9)
							{	x=k;
							y=l;
							return false;

							}

						} catch (Exception e) {
							{	x=k;
							y=l;
							return false;
							}

						}
						return true;
					}
					private Boolean kiemtratrungso() {
						x=k;
						y=l;
						int temp=Integer.parseInt(jl[k][l].getText().toString());
						MatrixData data = new MatrixData(MatrixTextField.getMatrixTextField());
						DataProcessing dp = new DataProcessing(data.getMatrix());
						return dp.CkeckCoincideNumber(temp,x,y);
					}
				});

			}
		}
	}

}
