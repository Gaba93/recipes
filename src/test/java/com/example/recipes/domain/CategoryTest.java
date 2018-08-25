package com.example.recipes.domain;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CategoryTest {

    Category category;

    @Before
    public void startUp() {
        category = new Category();
    }

    @Test
    public void getId() {

        Long longId = 4L;
        category.setId(longId);

        assertEquals(longId,category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}