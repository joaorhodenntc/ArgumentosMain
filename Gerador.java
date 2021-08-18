import java.util.Random;

public class Gerador {
    public static void main(String args[]) {
        int min = 1;
        int max = 100;
        for (int i = 0; i < 5000; i++) {
            //int num = min + (int)(Math.random()*max);            
            Random rand = new Random();
            int num = min + rand.nextInt(max);
            System.out.print(num + " ");
        }
    }
}
