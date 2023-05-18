package org.example;

import java.util.Iterator;

public class Tematica {
    public static Integer contarLivrosHistoriaBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.getGenero().equals("Historia")) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarLivrosSuspenseBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.getGenero().equals("Suspense")) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarLivrosTerrorBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.getGenero().equals("Terror")) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivrosBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Iterator a = biblioteca.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
