import java.util.Scanner;

/*Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120
 */
public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        sc.close();
        int tre =0;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            tre += i;
            fact *= i;
        }

        System.out.printf("Треугольное число %s", tre);
        System.out.printf("\nn!  %s", fact);
        // System.out.println(fact);
    }
}