import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int param1, param2;

        System.out.println("Digite o primeiro parametro: ");
        param1 = sc.nextInt();
        System.out.println("Digite o segundo parametro: ");
        param2 = sc.nextInt();
        sc.close();

        try{
            contar(param1, param2);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    public static void contar(int param1, int param2) throws Exception{
        int res;
        if(param1 > param2){
            throw new ParametrosInvalidosException();
        }
        res = param2 - param1;

        for(int i = 1; i <= res; i++)
        {
            System.out.println("Imprimindo o numero" + i);
        }
    }
}
