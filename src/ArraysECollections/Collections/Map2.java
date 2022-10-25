package ArraysECollections.Collections;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<String, Integer> usuarioSenha  = new HashMap<>();

        //var usario2 = usuarioSenha.put("Mateus2000", 458742154);
        usuarioSenha.put("Mateus2000", 458742154);
        usuarioSenha.put("brutalpofjghophjfg", 24121745);
        //var usuario1 = usuarioSenha.put("brutalpofjghophjfg", 24121745);
        usuarioSenha.put("mariaGG", 457815456);
        usuarioSenha.put("rafaeladelta", 123456);
        usuarioSenha.put("Pop", 9876);



        boolean logado = false;
        boolean tem = usuarioSenha.containsKey("Mateus200");
        boolean tem1 = usuarioSenha.containsValue(45874215);

        if(tem == true && tem1 == true && logado == true){
            System.out.println("Você está logado");
        }else if(tem != usuarioSenha.containsKey("Mateus2000") && tem1 != usuarioSenha.containsValue(458742154) && logado == false){
            System.out.println("Você está deslogado");
        }

    }


}

