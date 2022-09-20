package fundamentos;

public class Aula04TiposPrimitivos {
    public static void main(String[] args) {
        var dia = 21;
        var mes = 04;
        var ano = 2021;
        System.out.println(dia+"/"+mes+"/"+ano);

        // Informação do funcionario

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 32767;
        int id = 567789;
        long pontosAcumulados = 1_234_845_223;
        long pontosAcumulado = 3_234_845_223L;

        // Tipos númericos reais

        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano

        boolean estaDeFerias = false;// true

        //Tipo caractere
        //char status = 'AT'; //ativo
        char status = 'A'; //ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número dde viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha ->: " + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
