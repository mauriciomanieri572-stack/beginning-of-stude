import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String senhaCorreta = "paivajdk2025";
        String senhaDigitada = "";

        int tentativas = 3;

        while (!senhaDigitada.equals(senhaCorreta) && tentativas > 0) {

            System.out.print("Digite a senha: ");
            senhaDigitada = entrada.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                tentativas--;
                System.out.println("Senha incorreta! Tentativas restantes: " + tentativas);

                for (int i = 0; i < 3; i++) {
                    System.out.print(".");
                    try { Thread.sleep (300); } catch (InterruptedException e) {}
                }
                System.out.println("\n");
            }
        }

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso bloqueado! Tentativas esgotadas.");
        }

        entrada.close();
    }
}
