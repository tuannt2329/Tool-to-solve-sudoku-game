package java1;

import javax.swing.*;

public class DataProcessing {
    private int[][] matrixInt;
    private static int ROW = 9;
    private static int COL = 9;
    public DataProcessing(int[][] matrix){
        matrixInt = matrix;
    }
    public int CheckRowCol(int i, int j, int x){
        for (int k = 0; k < ROW; k++)
            if (matrixInt[i][k] == x)
                return 0;
        for (int k = 0; k < COL; k++)
            if (matrixInt[k][j] == x)
                return 0;
        int crow = i % 3;
        int ccol = j % 3;
        for (int k = i - crow; k <= i - crow + 2; k++ )
            for (int h = j - ccol; h <= j - ccol + 2; h++)
                if(matrixInt[k][h] == x)
                    return 0;
        return 1;
    }

    public boolean CkeckCoincideNumber(int x,int a,int b){
        for (int i = 0; i < ROW; i++){
            for (int j = 0; j < COL; j++) {
             
                if ( i==a && j==b) {
                  
                }else
                {
                	  for (int k = 0; k < ROW; k++)
                          if (matrixInt[i][k] == x && k != j&&k!=b)
                              return true;
                      for (int k = 0; k < COL; k++)
                          if (matrixInt[k][j] == x && k != i &&k!=a)
                              return true;
                      int crow = i % 3;
                      int ccol = j % 3;
                      for (int k = i - crow; k <= i - crow + 2; k++ )
                          for (int h = j - ccol; h <= j - ccol + 2; h++)
                              if(matrixInt[k][h] == x && k != i && h != j && k!=1 && h!=b)
                                  return true;
                }
            }
        }
        return false;
    }

    public int findCell0(int[] cell){
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (matrixInt[i][j] == 0) {
                    cell[0] = i;
                    cell[1] = j;
                    return 1;
                }
            }
        }
        cell[0] = -1;
        cell[1] = -1;
        return 0;
    }

    public int Solve(){
        int[] cell = new int[2];
        cell[0] = 0;
        cell[1] = 0;
        findCell0(cell);
        int x = cell[0];
        int y = cell[1];
        if(x == -1)
            return 1;
        for (int i = 1; i <= ROW; i++){
            if(CheckRowCol(x,y,i) == 1){
                matrixInt[x][y] = i;
                if(Solve() == 1){
                    return 1;
                }
            }
            matrixInt[x][y] = 0;
        }
        return 0;
    }

    public int[][] getMatrixInt(){
        return matrixInt;
    }
}
