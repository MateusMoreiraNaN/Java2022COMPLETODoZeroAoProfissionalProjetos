package OrientaçãoAObjetos.Herença;

public class Jogo {
    public static void main(String[] args) {

        Jogador play1 = new Jogador();
        play1.x = 10;
        play1.y = 10;

        play1.andar(Direção.NORTE);
        play1.andar(Direção.SUL);
        play1.andar(Direção.NORTE);
        play1.andar(Direção.OESTE);

        System.out.println(play1.y);
    }
}
