package ArraysECollections.Collections;


import java.util.Objects;

public class usuario {
    String nome;

    usuario(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        usuario usuario = (usuario) o;
        return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}