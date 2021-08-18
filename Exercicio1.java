import java.util.regex.Pattern;

public class Exercicio1 {
    public static void main(String args[]) {
        if (args.length < 3) {
            System.err.println("Argumentos insuficientes");
            System.out.println("Usage: java Exercicio1 <nome> <idade> <telefone>");
            return;
        }

        String nome = args[0];
        int idade = -1;
        try {
            idade = Integer.parseInt(args[1]);
        } catch(NumberFormatException e) {
            System.err.println("Idade informada não é um número");
            return;
        }

        if (idade < 0 || idade > 120) {
            System.err.println("Idade inválida");
            return;
        }

        String telefone = args[2];

        // Exemplos de padrões de telefone aceitos
        // 9999-9999
        // 99999999
        // 9999 9999
        if (!Pattern.matches("[0-9]{4}[- ]*[0-9]{4}", telefone)) {
            System.out.println("Telefone inválido");
            return;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
    }
}