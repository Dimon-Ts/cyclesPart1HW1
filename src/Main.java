public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("  Итерация +");
        for( int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        // Задание 2
        System.out.println("  Итерация -");
        for( int f = 10; f >= 0; f--) {
            System.out.println("Итерация цикла " + f);
        }
        // Задание 3
        System.out.println("  Чётные числа");
        for( int a = 1; a <= 17; a++)
        if(a % 2 == 0){
            System.out.println("Чётное число " + a);
        }
        // Задание 4
        System.out.println("  Итерация +10 -10");
        for( int f = 10; f >= -10; f--) {
            System.out.println("Итерация цикла " + f);
        }



    }
}