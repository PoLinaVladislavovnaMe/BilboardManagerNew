package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FilmsManagerTest {
    @Test
    void checkFindAllArrayAndAddFilm() {
        FilmsManager fm = new FilmsManager();
        fm.addFilm(new Film("Nimona"));
        Film[] result = fm.findAll();
        Film[] expected = new Film[]{new Film("Nimona")};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void checkFindAllArrayGreaterThanLastLimit() {
        FilmsManager fm = new FilmsManager(1);
        fm.addFilm(new Film("Nimona"));
        fm.addFilm(new Film("Ralf"));
        Film[] result = fm.findAll();
        Film[] expected = new Film[]{
                new Film("Nimona"),
                new Film("Ralf")
        };
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void checkVoidFindAllArray() {
        FilmsManager fm = new FilmsManager();
        Film[] result = fm.findAll();
        int expected = 0;
        Assertions.assertEquals(expected, result.length);
    }

    @Test
    void checkFindLastArrayLessThanLimit() {
        FilmsManager fm = new FilmsManager();
        fm.addFilm(new Film("Nimona"));
        fm.addFilm(new Film("Ralf"));
        Film[] result = fm.findLast();
        Film[] expected = new Film[]{
                new Film("Ralf"),
                new Film("Nimona")
        };
        Assertions.assertArrayEquals(expected, result);
    }
    @Test
    void checkFindLastArrayEqualToLastLimit() {
        FilmsManager fm = new FilmsManager(3);
        fm.addFilm(new Film("Nimona"));
        fm.addFilm(new Film("Ralf"));
        fm.addFilm(new Film("Gentlemen"));
        Film[] result = fm.findLast();
        Film[] expected = new Film[]{
                new Film("Gentlemen"),
                new Film("Ralf"),
                new Film("Nimona")
        };
        Assertions.assertArrayEquals(expected, result);
    }
    @Test
    void checkFindLastArrayGreaterThanLastLimit() {
        FilmsManager fm = new FilmsManager(1);
        fm.addFilm(new Film("Nimona"));
        fm.addFilm(new Film("Ralf"));
        Film[] result = fm.findLast();
        Film[] expected = new Film[]{new Film("Ralf")};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void checkVoidFindLastArray() {
        FilmsManager fm = new FilmsManager();
        Film[] result = fm.findLast();
        int expected = 0;
        Assertions.assertEquals(expected, result.length);
    }
}