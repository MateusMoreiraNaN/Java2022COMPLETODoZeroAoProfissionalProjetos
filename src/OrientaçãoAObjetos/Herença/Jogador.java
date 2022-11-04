package OrientaçãoAObjetos.Herença;

public class Jogador {

    int x;
    int y;

    boolean andar(Direção direcao){
        switch (direcao){
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;

        }

        if(direcao == Direção.NORTE){
            y++;
        }

        return true;
    }


}
