public class Lambda_04 {
    /* 
    Obs.: notação
    @FunctionalInterface não é obrigatória,
    mas é uma boa prática a
    ser seguida quando se está criando
    interfaces funcionais em Java.
    Isso porque, caso seja adicionado
    mais um método abstrato na interface,
    a compatibilidade com as
    expressões lambda será comprometida.
    */

    @FunctionalInterface
    public interface Calculadora {
        int calcular(int a, int b);

        default void imprimirResultado(int resultado) {
            System.out.println("Resultado: " + resultado);
        }
    }

    public static void main(String[] args) {
        Calculadora soma = (a, b) -> a + b;
        int resultado = soma.calcular(10, 20);
        soma.imprimirResultado(resultado);

    }

}
