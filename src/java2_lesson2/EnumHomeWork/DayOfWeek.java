package java2_lesson2.EnumHomeWork;

public enum DayOfWeek {
    MONDAY(8),
    TUESDAY(8),
    WEDNESDAY(8),
    THURSDAY(8),
    FRIDAY(8),
    SATURDAY(0),
    SUNDAY(0);

    private int workHour;

    DayOfWeek(int workHour) {
        this.workHour = workHour;
    }

    public int getWorkHour() {
        return workHour;
    }
}
