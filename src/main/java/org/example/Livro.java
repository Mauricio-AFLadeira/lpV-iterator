package org.example;

public class Livro {
    private String nome;
    private String genero;

    public Livro(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        if (this.genero.equals("Historia")){
            return "Historia";
        }
        if (this.genero.equals("Suspense")){
            return "Suspense";
        }
        if (this.genero.equals("Terror")){
            return "Terror";
        }
        return "";
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
