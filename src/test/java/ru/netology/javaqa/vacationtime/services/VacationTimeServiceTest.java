package ru.netology.javaqa.vacationtime.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationTimeServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void testIfEarnsTenThousandDollars(int expected, int income, int expense, int threshold) {
        VacationTimeService service = new VacationTimeService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
