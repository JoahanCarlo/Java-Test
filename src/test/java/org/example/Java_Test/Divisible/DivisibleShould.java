package org.example.Java_Test.Divisible;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class DivisibleShould {
    @Test
    public void numero_divisible() {
        Divisible divisible = new Divisible();
        assertThat(divisible.fizzBuzz(10),is(10));
    }

    @Test
    public void romanos() {
        Divisible divisible = new Divisible();
        assertThat(divisible.arabicToRoman(10),is(10));
    }
}