package fundamentos.operadores;

public class Aula19Ternário {
    public static void main(String[] args) {
        double media = 3.6;
        //String resuldadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
        String resuldadoFinal = media >= 7.0 ?
                "Aprovaddo." : "Em recuperação.";

        System.out.println("O aluno está " + resuldadoFinal);

        double nota = 8.3;
        boolean bomComportamento = true;

        boolean passouPorMeida = nota >= 7;
        boolean temDesconto = bomComportamento && nota >= 7;
        String resuldaddo = temDesconto ? "sim." : "não.";

        System.out.println("Tem desconto? " + resuldaddo);
    }
}
