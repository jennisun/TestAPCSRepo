public class Demo {

    /* HOMEWORK 9*/

    public static void main(String[] args) {

      int a = 0;

      if (args.length == 0) a = 5;
      else a = Integer.parseInt(args[0]);

      for (int i = 1; i <= a; i ++) {
        for (int k = 1; k <= a - i + 1; k ++) {
          System.out.print(i);
        }
        System.out.println();
      }

    }

  /* HOMEWORK 10*/

  public static String arrToString (int[] arr) {
    String ans = "{";

    if (arr.length == 0) return "{}";

    for (int i = 0; i < arr.length - 1; i ++) {
      ans += "" + arr[i] + ", ";
    }
    return ans + arr[arr.length - 1] + "}";
  }


  public static String arrayDeepToString(int[][] arr){
        if(arr.length == 0)return "{}";

        String s = "{";

        for (int i = 0; i < arr.length - 1; i ++) {
                s += arrToString(arr[i]) + ", ";
        }
        s += arrToString(arr[arr.length-1]) + "}";
        return s;
    }

    public static int[][] create2DArray(int rows, int cols, int maxValue) {
      int arr [][] = new int [rows][cols];
      for (int i = 0; i < rows; i ++) {
        for (int h = 0; h < cols; h ++) {
          arr[i][h] = (int) (Math.random() * (maxValue + 1));
        }
      }
      return arr;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
      int [][] arr = new int [rows][];
      for (int i = 0; i < rows; i ++) {
        int c = (int) (Math.random() * (cols + 1));
        arr[i] = new int[c];

        for (int h = 0; h < c; h ++) {
          arr[i][h] = (int) (Math.random() * (maxValue + 1));
        }
      }

      return arr;
    }

}

