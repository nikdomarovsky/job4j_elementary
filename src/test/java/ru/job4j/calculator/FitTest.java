package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void vwhenMan180Then92() {
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
    public void test_manWeightWithGivenHeight() {
        // Arrange
        short height = 180;
        double expected = 92;

        // Act
        double result = Fit.manWeight(height);

        // Assert
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void test_womanWeightWithGivenHeight() {
        // Arrange
        short height = 170;
        double expected = 69;

        // Act
        double result = Fit.womanWeight(height);

        // Assert
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void test_manWeightWithNonDivisibleHeight() {
        // Arrange
        short height = 185;
        double expected = (height - 100) * 1.15;

        // Act
        double result = Fit.manWeight(height);

        // Assert
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void test_manWeightWithMinimumHeight() {
        // Arrange
        short height = 0;
        double expected = -100 * 1.15;

        // Act
        double result = Fit.manWeight(height);

        // Assert
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void test_womanWeightWithMinimumHeight() {
        // Arrange
        short height = 0;
        double expected = -110 * 1.15;

        // Act
        double result = Fit.womanWeight(height);

        // Assert
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void test_manWeightWithMaximumHeight() {
        // Arrange
        short height = 32767;
        double expected = 32667 * 1.15;

        // Act
        double result = Fit.manWeight(height);

        // Assert
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void test_womanWeightWithNonDivisibleHeight() {
        // Arrange
        short height = 175;
        double expected = (height - 110) * 1.15;

        // Act
        double result = Fit.womanWeight(height);

        // Assert
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void test_manWeightWithHeightLessThan100() {
        // Arrange
        short height = 99;
        double expected = (height - 100) * 1.15;

        // Act
        double result = Fit.manWeight(height);

        // Assert
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}