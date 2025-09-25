public class PrintX {
    public static void main(String args[]){
        int xSize = 8;
        for(int i = 0; i < xSize; i++){
            for(int j = 0; j < xSize; j++){
                if(i == j){
                    System.out.print("x");
                }
                else if (j == (xSize - i)){
                    System.out.print("x");
                }
                else {
                    System.out.print(" ");
                    System.out.println();
                }
            }
        }
    }
}
