public class Lambda_01 {

    // Definindo uma interface funcional
    interface FunctionGeneratePrefix {
        String generate(String value);
    }

    public static void main(String[] args) throws Exception {
        FunctionGeneratePrefix setPrefixName = value -> "Sr. " + value;
        System.out.println(setPrefixName.generate("Tiago"));
    }
}
