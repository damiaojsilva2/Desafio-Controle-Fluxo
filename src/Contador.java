import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Preencha com nextInt() para ler um número inteiro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Preencha com nextInt() para ler um número inteiro

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        while (contagem <= parametroDois) {
            System.out.println(contagem);
            contagem++;
        }
    }
}

class ParametrosInvalidosException extends Exception {
    // Classe para representar a exceção de negócio no sistema
}
