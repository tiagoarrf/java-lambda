public class Lambda_02 {

    // Definindo uma interface funcional
    interface Operacao {
        int executar(int a, int b);
    }

    public static void main(String[] args) {

        // Utilizando a função lambda para realizar a operação de soma
        Operacao soma = (a, b) -> a + b;

        // Utilizando a função lambda para realizar a operação de subtração
        Operacao subtracao = (a, b) -> a - b;

        // Utilizando as funções lambda para realizar operações
        int resultadoSoma = soma.executar(10, 5);
        int resultadoSubtracao = subtracao.executar(10, 5);

        // Imprimindo os resultados
        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
    }
}
