package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieManagerTest2 {
    MovieManager manager = new MovieManager(3);

    @BeforeEach
    public void setup() {
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
    }

    @Test
    public void shouldFindLastIfLenOverLimit() {
        String[] expected = {"Film4", "Film3", "Film2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
