package ArraysECollections.Collections;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("teste");
        System.out.println("Tamanho é " + conjunto.size());
        conjunto.add("teste");
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove('x'));
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove(1.2));
        System.out.println("Tamanho é " + conjunto.size());

        //conjunto.remove(1);
        boolean tem = conjunto.contains(1);

        if(tem == true){
            System.out.println("---------------------------");
            System.out.println("O número 1 está no cojunto");
            System.out.println("---------------------------");
        }else if(tem == false){
            System.out.println("---------------------------");
            System.out.println("Dado não encontrado");
            System.out.println("---------------------------");
        }

        conjunto.add("Mateus");

        boolean ana = conjunto.add("gata");

        System.out.println(ana);

        System.out.println(conjunto.contains("teste"));

        //System.out.println("O número existe no cojunto? " + conjunto.contains(1));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(conjunto);
        System.out.println(nums);

        //conjunto.addAll(nums); // União entre duas Collections
        System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

        System.out.println("----------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        HashSet DB = new HashSet();

        DB.add("mateusgodoi007@gmail.com");
        DB.add("mateus007");
        DB.add("Teste457@email.com");
        DB.add("JuliaTesteMortal95");
        DB.add(14578);
        DB.add(48786);
        DB.add("mariamoreira4571@gmail.com");
        DB.add("kdjdfggdpogjfdgopgjgpofjgopdgjgofjgfogjgofpjg");
        DB.add("kdjdfggdpogjfdgopgjgpofjgopdgjgofjgfogjgofpjg");
        DB.add("kdjdfggdpogjfdgopgjgpofjgopdgjgofjgfogjgofpjg");
        DB.add("kdjdfggdpogjfdgopgjgpofjgopdgjgofjgfogjgofpjg");
        DB.add("kdjdfggdpogjfdgopgjgpofjgopdgjgofjgfogjgofpjg");
        DB.add("kdjdfggdpogjfdgopgjgpofjgopdgjgofjgfogjgofpjg");
        DB.add("kdjdfggdpogjfdgopgjgpofjgopdgjgofjgfogjgofpjg");
        DB.add("kdjdfggdpogjfdgopgjgpofjgopdgjgofjgfogjgofpjg");
        DB.add("kdjdfggdpogjfdgopgjgpofjgopdgjgofjgfogjgofpjg");
        DB.add("kdjdfggdpogjfdgopgjgpofjgopdgjgofjgfogjgofpjg");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add("Teste457@email.com");
        DB.add(25072000);
        DB.add(17111945);
        DB.add(ana);
        DB.add("testeMortal");

        int passwordDB = 123456;
        int passwordDigitado = 123456;
        boolean Hacker = true;

        System.out.println(DB);
        System.out.println("----------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        if(passwordDB == passwordDigitado && Hacker == true){
            System.out.println("Banco de dados HACKEADO");
            DB.clear();
            System.out.println(DB);
        }else if(passwordDB != passwordDigitado && Hacker == false){
            System.out.println(DB);
        }



    }
}
