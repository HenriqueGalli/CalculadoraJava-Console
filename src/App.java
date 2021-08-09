import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------Minha primeira calculadora em Java--------------");

        Scanner entrada = new Scanner (System.in);

        double valor1;
        double valor2;
        String resposta;

        System.out.println("Digite o valor: ");
        valor1 = entrada.nextDouble();
        System.out.println("Digite o próximo valor: ");
        valor2 = entrada.nextDouble();

        System.out.println("Digite a opção desejada: ");
        System.out.println("Somar");
        System.out.println("Subtrair");
        System.out.println("Dividir");
        System.out.println("Multiplicar");

        resposta = entrada.next();
        switch(resposta){
            
            case "somar":
            System.out.println("Resultado da soma de " +Double.toString(valor1)+ " + "+Double.toString(valor2) +" = "+Double.toString(valor1+valor2));
            case "subtrair":
            System.out.println("Resultado da subtração de " +Double.toString(valor1)+ " - "+Double.toString(valor2) +" = "+Double.toString(valor1-valor2));
            case "dividir":
            System.out.println("Resultado da divisao de " +Double.toString(valor1)+ " / "+Double.toString(valor2) +" = "+Double.toString(valor1/valor2));
            case "multiplicar":
            System.out.println("Resultado da multiplicação de " +Double.toString(valor1)+ " * "+Double.toString(valor2) +" = "+Double.toString(valor1*valor2));
        }
        entrada.close();
    }
}
