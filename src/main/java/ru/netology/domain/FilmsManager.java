package ru.netology.domain;

import java.util.Arrays;

public class FilmsManager {
    private Film[] films = new Film[0];
    private final int limitForFindLast;

    public FilmsManager() {
        this.limitForFindLast = 5;
    }

    public FilmsManager(int limitForFindLast) {
        this.limitForFindLast = limitForFindLast;
    }

    public void addFilm(Film newFilm) {
        Film[] newFilmsArray = Arrays.copyOf(films, films.length+1);
        newFilmsArray[films.length] = newFilm;
        films = newFilmsArray;
    }

    public Film[] findAll() {
        return Arrays.copyOf(films, films.length);
    }

    public Film[] findLast() {
        int resultLength = limitForFindLast;
        if (resultLength > films.length) {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; ++i) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}