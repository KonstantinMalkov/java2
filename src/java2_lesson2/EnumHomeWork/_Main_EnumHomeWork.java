package java2_lesson2.EnumHomeWork;

public class _Main_EnumHomeWork {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }

    /**
     * функция для подсчета оставшихся часов работы текущей недели
     * @param day - день от которого считаем количество часов,
     *              в т.ч. в расчет берем и этот день
     * @return workHours - возвращаем количество оставшихся часов работы в текущей неделе
     */
    public static String getWorkingHours(DayOfWeek day){
        Integer workHours = 0;
        boolean dayFound = false;

        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY){
            return "Сегодня выходной";
        }

        for (DayOfWeek d: DayOfWeek.values()){
            if (d == day){
                dayFound = true;
            }

            if (dayFound){
                workHours = workHours + d.getWorkHour();
            }
        }

        return workHours.toString();

    }

}