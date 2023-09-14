import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість n-перших чисел: ");
        int n = scanner.nextInt();

        LucasNumber lucasNumber = new LucasNumber(n);
        int sum = lucasNumber.SumofSquares();

        System.out.println("Сума = " + sum);
    }
}
