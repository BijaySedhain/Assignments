package Fourth;



// Addition of a two dimensional Array.
public class ArrayAddition {

    public static void main(String[] args) {

      int [][]  firsArray = {{1,2,3},{4,5,6},{7,8,9}};
      int [][] secondArray = {{4,5,6},{2,7,8},{3,1,9}};
      int [][] sum = new int[3][3];
      for (int i = 0; i < firsArray.length; i++) {
          for (int j = 0; j < firsArray.length; j++) {
              sum [i][j] = firsArray[i][j] + secondArray[i] [j];
          }
      }


        for (int i = 0; i < firsArray.length; i++) {
            for (int j = 0; j < firsArray.length; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
