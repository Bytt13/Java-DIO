package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    //parametros utilizados no codigo
    static int numero;
    static String agencia, nome;
    static double saldo;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //criacao do scanner
        System.out.println("Por favor, digite o numero da conta: ");
        numero = sc.nextInt();
        System.out.println("Por favor, digite a agencia: ");
        agencia = sc.next();
        System.out.println("Agora digite seu nome: ");
        nome = sc.next();
        System.out.println("Por fim, insira o saldo que voce deseja depositar: ");
        saldo = sc.nextDouble();
        //leitura dos dados
        sc.close();
        //finalizacao do scanner

        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

}
