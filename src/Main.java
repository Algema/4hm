public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание 1
        int i=1;
        for (i=10; i>=1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        while (i<=10) {
           System.out.print(i + " ");
            i++;
        }
        // Задание 2
        System.out.println();
        int q= 1;
        for (q=1; q<=31;q=q+7) {
            System.out.println( "Сегодня пятница " + q + "-е число.Необходимо подготовить  отчет. ");
        }

        // Задание 3
        System.out.println();
      int a = 2022;
      int b = a - 200;
      int c = a + 100;
      int p = 0;
      for(; p < c;p =p +79 )  {
          if (p > b) {
              System.out.println( "комета пролетит в " + p + " году " );
          }
      }












    }
}