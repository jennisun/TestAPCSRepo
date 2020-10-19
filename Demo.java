public class Demo {

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
}
