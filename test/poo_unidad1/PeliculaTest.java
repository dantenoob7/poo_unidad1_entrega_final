package poo_unidad1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uni1a.Pelicula;

public class PeliculaTest {

    @Test
    public void testTituloPelicula() {

        Pelicula pelicula = new Pelicula(
                "Avatar",
                125,
                "Accion",
                "20th Century Studios"
        );

        assertEquals(
                "Avatar",
                pelicula.getTitulo()
        );
    }
}


