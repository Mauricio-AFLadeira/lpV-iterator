package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TematicaTest {
    @Test
    void deveContarLivrosHistoriaBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("A historia de um jumento", "Historia"),
                new Livro("Morrendo de medo", "Terror"),
                new Livro("Quem matou Joshua?", "Suspense"),
                new Livro("A vida de uma abelha", "Historia")
        );
        assertEquals(2, Tematica.contarLivrosHistoriaBiblioteca(biblioteca));
    }
    @Test
    void deveContarLivrosTerrorBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("A historia de um jumento", "Historia"),
                new Livro("Morrendo de medo", "Terror"),
                new Livro("Quem matou Joshua?", "Suspense"),
                new Livro("A vida de uma abelha", "Historia")
        );
        assertEquals(1, Tematica.contarLivrosTerrorBiblioteca(biblioteca));
    }
    @Test
    void deveContarLivrosSuspenseBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("A historia de um jumento", "Historia"),
                new Livro("Morrendo de medo", "Terror"),
                new Livro("Quem matou Joshua?", "Suspense"),
                new Livro("A vida de uma abelha", "Historia")
        );
        assertEquals(1, Tematica.contarLivrosSuspenseBiblioteca(biblioteca));
    }

    @Test
    void deveContarTotalLivrosBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("A historia de um jumento", "Historia"),
                new Livro("Morrendo de medo", "Terror"),
                new Livro("Quem matou Joshua?", "Suspense"),
                new Livro("A vida de uma abelha", "Historia")
        );
        assertEquals(4, Tematica.contarTotalLivrosBiblioteca(biblioteca));
    }

}