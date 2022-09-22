package fundamentos;

public class Aula12ConversãoNúmeroParaString {
    public static void main(String[] args) {
        Integer num1 = 100000;
        System.out.println(num1.toString().length());
        System.out.println(num1.toString().concat("!!!!"));

        int num2 = 5000004;
        System.out.println(Integer.toString(num2).length());

        System.out.println(("" + num1).length());

    }
}
