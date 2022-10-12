package ArraysECollections;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    @Override
    public boolean equals(Object objeto) {


        if(objeto instanceof  Usuario){
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else{
            return false;

        }


    }

}
