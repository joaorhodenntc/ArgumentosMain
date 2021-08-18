import java.util.Random;

public class Gerador {
    public static void main(String args[]) throws InterruptedException {
        if (args.length < 3) {
            System.out.println("Usage: java Gerador <min> <max> <quantidade>");
            return;
        }

        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int quantidade = Integer.parseInt(args[2]);

        for (int i = 0; i < quantidade; i++) {
            //int num = min + (int)(Math.random()*max);            
            Random rand = new Random();
            int num = min + rand.nextInt(max);
            System.out.print(num + " ");
            System.err.println("Gerou o numero " + num);
            Thread.sleep(2000);
        }
    }
}
