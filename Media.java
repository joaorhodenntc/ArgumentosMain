import java.util.Scanner;

public class Media {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int count = 0;

        while(sc.hasNext()) {
            int num = sc.nextInt();
            System.err.println("Li o numero " + num);
            soma += num;
            count++;
        }

        System.out.println("Media: " + soma/(double)count);
    }
}
