package fundamentos;

public class Aula07TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";

        //s = "oi";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toUpperCase().startsWith("boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        //nome.
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + " Salario: " + salario);

        System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f., \n", nome, sobrenome, idade, salario);

        String frase = String.format("Nome: %s %s tem %d anos e ganha R$%.2f. ", nome, sobrenome, idade, salario);

        System.out.println(frase);

        System.out.println("Frase Qualquer".contains("Qual"));
        System.out.println("Frase Qualquer".indexOf("Qual"));
        System.out.println("Frase Qualquer".substring(6));
        System.out.println("Frase Qualquer".substring(6, 8));
        System.out.println("Frase Qualquer".codePointAt(1));
        //System.out.println("Frase Qualquer".lines("Qu"));

    }
}
