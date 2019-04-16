package pl.sdacademy.tdd.katas;

public class TimeCalculator {

    public String calcWorkTime(String startTime, String endTime, String breakTime) {
        String startHours = startTime.split(":")[0];
        String startMinutes = startTime.split(":")[1];

        String endHours = endTime.split(":")[0];
        String endMinutes = endTime.split(":")[1];

        String breakHours = breakTime.split(":")[0];
        String breakMinutes = breakTime.split(":")[1];

        int startTimeInMinutes = Integer.valueOf(startHours) * 60 + Integer.valueOf(startMinutes);
        int endTimeInMinutes = Integer.valueOf(endHours) * 60 + Integer.valueOf(endMinutes);
        int breakTimeInMinutes = Integer.valueOf(breakHours) * 60 + Integer.valueOf(breakMinutes);

        int workTime = endTimeInMinutes - (startTimeInMinutes + breakTimeInMinutes);

        String workTimeHours = String.format("%02d", workTime / 60);
        String workTimeMinutes = String.format("%02d", workTime % 60);

        return workTimeHours + ":" + workTimeMinutes;
    }

}
