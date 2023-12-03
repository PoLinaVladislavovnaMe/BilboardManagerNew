package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {
    @Test
    void checkFilmGetter() {
        Film film = new Film("Nimona");
        String expected = "Nimona";
        Assertions.assertEquals(expected, film.getName());
    }

    @Test
    void checkFilmEqualsTrue() {
        Film film = new Film("Nimona");
        Film sameFilm = new Film("Nimona");
        Assertions.assertEquals(film, sameFilm);
    }

    @Test
    void checkFilmEqualsFalse() {
        Film film = new Film("Nimona");
        Film sameFilm = new Film("Nemona");
        Assertions.assertNotEquals(film, sameFilm);
    }

    @Test
    void checkFilmHashcodeEquals() {
        Film film = new Film("Nimona");
        Film sameFilm = new Film("Nimona");
        Assertions.assertEquals(film.hashCode(), sameFilm.hashCode());
    }
}