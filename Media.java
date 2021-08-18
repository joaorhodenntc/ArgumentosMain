import java.util.Scanner;

public class Media {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5000; i++) {
            int num = sc.nextInt();
            soma += num;
        }
        System.out.println("Media: " + soma/(double)5000);
    }
}
