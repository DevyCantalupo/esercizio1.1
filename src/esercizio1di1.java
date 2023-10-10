import java.util.Scanner;

public class esercizio1di1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("inserire la base del triangolo");
        double base = sc.nextDouble();
        System.out.println("inserire l'altezza del triangolo");
        double altezza = sc.nextDouble();


        double area = (base * altezza) / 2;
        System.out.println("L'area del triangolo è " + area);
    }
}
