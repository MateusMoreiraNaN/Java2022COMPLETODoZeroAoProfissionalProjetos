package ClassesEMétodos.ProjetoDoModulo;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida){
        if(comida != null){
            this.peso += comida.pesoDaComida;
        }
    }

    String apresentar(){
        return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
    }




}
