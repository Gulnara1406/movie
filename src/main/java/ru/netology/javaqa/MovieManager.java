package ru.netology.javaqa;

public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resLength;
        if (movies.length < limit) {
            resLength = movies.length;
        } else {
            resLength = limit;
        }
        String[] res = new String[resLength];
        for (int i = 0; i < res.length; i++) {
            res[i] = movies[movies.length - 1 - i];
        }
        return res;
    }
}
