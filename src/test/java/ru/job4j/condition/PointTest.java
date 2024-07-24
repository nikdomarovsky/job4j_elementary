package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when42to26then4Dot47() {
        double expected = 4.47;
        Point a = new Point(4, 2);
        Point b = new Point(2, 6);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus22to26then7Dot21() {
        double expected = 7.21;
        Point a = new Point(-2, 0);
        Point b = new Point(2, 6);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus24to24then4() {
        double expected = 4;
        Point a = new Point(-2, 4);
        Point b = new Point(2, 4);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to200then2() {
        double expected = 2;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 0);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when423to267then5Dot39() {
        double expected = 5.39;
        Point a = new Point(4, 3, 3);
        Point b = new Point(2, 6, 7);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}