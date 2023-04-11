package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {
    MovieManager manager = new MovieManager(6);

    @BeforeEach
    public void setup() {
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
    }

    @Test
    public void shouldAddFilm() {
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}
