package OrientaçãoAObjetos.Composicao;

public class Carro {

    //Motor motor = new Motor();

    final Motor motor;

    Carro(){
        this.motor = new Motor(this);
    }

    void acelerar(){
       if(motor.fatorInjecao < 2.5){
           motor.fatorInjecao += 0.4;
       }
    }

    void frear(){
        if(motor.fatorInjecao > 0.5){
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }

    boolean portas(){
        boolean portas = true;
        if(portas == false){
            motor.ligado = false;
            motor.fatorInjecao = 3000;
            System.out.println("Tem uma porta aberta");
        }else if(portas == true){
            motor.ligado = true;
            System.out.println("Portas fechadas");
        }
        return portas;
    }
}
