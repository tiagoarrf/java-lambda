public class Lambda_03 {
    
    interface OperacaoMatematica {
        int calcular(int a, int b);
    }

    public static void main(String[] args) {
        OperacaoMatematica soma = (a, b) -> a + b;
        OperacaoMatematica subtracao = (a, b) -> a - b;
        OperacaoMatematica multiplicacao = (a, b) -> a * b;

        System.out.println("Resultado da soma: " + operar(10, 5, soma));
        System.out.println("Resultado da subtração: " + operar(10, 5, subtracao));
        System.out.println("Resultado da multiplicação: " + operar(10, 5, multiplicacao));
    }

    public static int operar(int a, int b, OperacaoMatematica operacao) {
        return operacao.calcular(a, b);
    }

}
