public class Main {
    public static void main(String[] args) {
        String[][] starArr=new String[7][4];

        for (int i=0;i<starArr.length;i++){
            for (int j=0;j<starArr[i].length;j++){
                if (i == 0 || i == 3 || i == 6){
                    starArr[i][j]=" * ";
                }else if (j == 0 || j == 3){
                    starArr[i][j]=" * ";
                }else{
                    starArr[i][j]="   ";
                }
            }
        }

        for(String[] row : starArr){
            for (String col :row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}