package OrientaçãoAObjetos.Composicao.RelacionamentoMuitosPramuitos;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");
        Aluno aluno4 = new Aluno("Mateus");
        Aluno aluno5 = new Aluno("José");
        Aluno aluno6 = new Aluno("Louise");
        Aluno aluno7 = new Aluno("Elias");
        Aluno aluno8 = new Aluno("Cauê");
        Aluno aluno9 = new Aluno("Tiago");
        Aluno aluno10 = new Aluno("Miguel");
        Aluno aluno11 = new Aluno("Marcos");
        Aluno aluno12 = new Aluno("Fábio");
        Aluno aluno13 = new Aluno("Rafaela");
        Aluno aluno14 = new Aluno("Luís");
        Aluno aluno15 = new Aluno("Fernanda");
        Aluno aluno16 = new Aluno("Brenda Hadassa Dias");
        Aluno aluno17 = new Aluno("Fábio Levi Fernandes");
        Aluno aluno18 = new Aluno("Luzia Mariah da Cruz");
        Aluno aluno19 = new Aluno("Elisa Esther Teixeira");
        Aluno aluno20 = new Aluno("Betina Elisa Antônia Lopes");

        Curso curso1 = new Curso("Java Completo 2019");
        Curso curso2 = new Curso("Full Stack 2023");
        Curso curso3 = new Curso("Spring Boot 2022");
        Curso curso4 = new Curso("Java Back End - Rest Api 2023");
        Curso curso5 = new Curso("Ciencia de Dados com R 2022");
        Curso curso6 = new Curso("Analista de Banco de Dados em SQL 2018");

        curso1.adicionarAluno(aluno11);
        curso1.adicionarAluno(aluno4);
        curso1.adicionarAluno(aluno6);

        curso2.adicionarAluno(aluno10);
        curso2.adicionarAluno(aluno8);
        curso2.adicionarAluno(aluno9);

        curso3.adicionarAluno(aluno16);
        curso3.adicionarAluno(aluno20);
        curso3.adicionarAluno(aluno14);

        curso4.adicionarAluno(aluno11);
        curso4.adicionarAluno(aluno17);
        curso4.adicionarAluno(aluno13);

        curso5.adicionarAluno(aluno2);
        curso5.adicionarAluno(aluno1);
        curso5.adicionarAluno(aluno19);

        curso6.adicionarAluno(aluno3);
        curso6.adicionarAluno(aluno5);
        curso6.adicionarAluno(aluno18);

        for(Aluno aluno: curso1.alunos){
            System.out.println(" ");
            System.out.println("----------------------------------");
            System.out.println("Estou matriculado no curso " + curso1.nome);
            System.out.println("e meu nome é " + aluno.nome);
            System.out.println("----------------------------------");
            System.out.println(" ");
        }

        for(Aluno aluno: curso2.alunos){

            System.out.println("----------------------------------");
            System.out.println("Estou matriculado no curso " + curso2.nome);
            System.out.println("e meu nome é " + aluno.nome);
            System.out.println("----------------------------------");

        }

        for(Aluno aluno: curso3.alunos){

            System.out.println("----------------------------------");
            System.out.println("Estou matriculado no curso " + curso3.nome);
            System.out.println("e meu nome é " + aluno.nome);
            System.out.println("----------------------------------");

        }

        for(Aluno aluno: curso4.alunos){
            System.out.println(" ");
            System.out.println("----------------------------------");
            System.out.println("Estou matriculado no curso " + curso4.nome);
            System.out.println("e meu nome é " + aluno.nome);
            System.out.println("----------------------------------");
            System.out.println(" ");
        }

        for(Aluno aluno: curso5.alunos){
            System.out.println(" ");
            System.out.println("----------------------------------");
            System.out.println("Estou matriculado no curso " + curso5.nome);
            System.out.println("e meu nome é " + aluno.nome);
            System.out.println("----------------------------------");
            System.out.println(" ");
        }

        for(Aluno aluno: curso6.alunos){
            System.out.println(" ");
            System.out.println("----------------------------------");
            System.out.println("Estou matriculado no curso " + curso6.nome);
            System.out.println("e meu nome é " + aluno.nome);
            System.out.println("----------------------------------");
            System.out.println(" ");
        }

        Curso cursoEncontrado = (aluno4.obterCursoPorNome("Java Completo 2019"));

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }
}
