package pl.sdacademy.tdd.katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeCalculatorTest {

    @Test
    public void shouldCalculateTimeWithNoBreak() {
        TimeCalculator timeCalculator = new TimeCalculator();
        String startTime = "08:42";
        String endTime = "16:20";
        String breakTime = "00:00";

        String result = timeCalculator.calcWorkTime(startTime, endTime, breakTime);

        assertEquals("07:38", result);
    }

    @Test
    public void shouldCalculateTimeWithMinutesBreak() {
        TimeCalculator timeCalculator = new TimeCalculator();
        String startTime = "08:42";
        String endTime = "16:20";
        String breakTime = "00:30";

        String result = timeCalculator.calcWorkTime(startTime, endTime, breakTime);

        assertEquals("07:08", result);
    }

    @Test
    public void shouldCalculateTimeWithHoursBreak() {
        TimeCalculator timeCalculator = new TimeCalculator();
        String startTime = "08:42";
        String endTime = "16:20";
        String breakTime = "01:00";

        String result = timeCalculator.calcWorkTime(startTime, endTime, breakTime);

        assertEquals("06:38", result);
    }

    @Test
    public void shouldCalculateTimeWithHoursAndMinutesBreak() {
        TimeCalculator timeCalculator = new TimeCalculator();
        String startTime = "08:42";
        String endTime = "16:20";
        String breakTime = "01:30";

        String result = timeCalculator.calcWorkTime(startTime, endTime, breakTime);

        assertEquals("06:08", result);
    }

}