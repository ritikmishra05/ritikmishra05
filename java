import java.util.Scanner;

public class button {
   public button() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      switch (var2) {
         case 1:
            System.out.println("Hello");
            break;
         case 2:
            System.out.println("Namaste");
            break;
         case 3:
            System.out.println("Bonjour");
            break;
         default:
            System.out.println("Invalid Buttom");
      }

   }
}
