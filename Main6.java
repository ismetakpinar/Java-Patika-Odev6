import java.util.Locale;
import java.util.Scanner;


public class Main6 {
    public static void main(String[] args){
        double vki,boy;
        int agirlik;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuz Metre Cinsinden Giriniz :");
        boy = scanner.nextDouble();

        Scanner kilo = new Scanner(System.in);
        System.out.print("Kilonuzu  Giriniz :");
        agirlik = kilo.nextInt();

        vki= agirlik/(boy*boy);

        System.out.print("Vki'niz : " + vki);
    }
}