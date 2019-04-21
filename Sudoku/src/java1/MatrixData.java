package java1;

public class MatrixData {
    private static int ROW = 9;
    private static int COL = 9;
    private int[][] matrix;

    public MatrixData(String[][] data) {
        matrix = convertString2Int(data);
    }

    private int[][] convertString2Int(String[][] strs) {
        int[][] tmp = new int[ROW][COL];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                try {
                    tmp[i][j] = Integer.parseInt(strs[i][j]);
                }catch (Exception ex){
                    tmp[i][j] = 0;
                }
            }
        }

        return tmp;
    }

    public String[][] convertInt2String(int[][] ints) {
        String[][] tmp = new String[ROW][COL];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                try {
                    tmp[i][j] = String.valueOf(ints[i][j]);
                }catch (Exception ex){
                }
            }
        }

        return tmp;
    }

    public int[][] getMatrix() {
        return matrix;
    }

}
