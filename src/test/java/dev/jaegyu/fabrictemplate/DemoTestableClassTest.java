package dev.jaegyu.fabrictemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTestableClassTest {

    @Test
    void addTwoNegativeNumbers() {
        var DemoTestableClass = new DemoTestableClass();
        assertEquals(-30, DemoTestableClass.add(-10, -20));
    }
}