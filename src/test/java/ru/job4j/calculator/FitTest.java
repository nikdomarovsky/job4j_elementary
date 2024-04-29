package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void manWeightWithGivenHeight() {
        short height = 180;
        double expected = 92;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void womanWeightWithGivenHeight() {
        short height = 170;
        double expected = 69;
        double result = Fit.womanWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void manWeightWithNonDivisibleHeight() {
        short height = 185;
        double expected = (height - 100) * 1.15;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void manWeightWithMinimumHeight() {
        short height = 0;
        double expected = -100 * 1.15;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void womanWeightWithMinimumHeight() {
        short height = 0;
        double expected = -110 * 1.15;
        double result = Fit.womanWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void manWeightWithMaximumHeight() {
        short height = 32767;
        double expected = 32667 * 1.15;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void womanWeightWithNonDivisibleHeight() {
        short height = 175;
        double expected = (height - 110) * 1.15;
        double result = Fit.womanWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void manWeightWithHeightLessThan100() {
        short height = 99;
        double expected = (height - 100) * 1.15;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}