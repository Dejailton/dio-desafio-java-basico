import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta:");
        int numero = entrada.nextInt();
        
        System.out.println("Por favor, digite a agência da conta:");
        String agencia = entrada.next();

        System.out.println("Por favor, digite seu saldo bancário:");
        float saldo = entrada.nextFloat();

        entrada.nextLine();

        System.out.println("Por favor, digite seu nome:");
        String nomecliente = entrada.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.", nomecliente, agencia, numero, saldo);
    }
}
