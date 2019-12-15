package java2_lesson2.ExpectionHomeWork;

public class _Main_TaskExpection {
    public static void main(String[] args) {
        // корректный массив
        String[][] arr1 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        //  массив с не корректным размером
        String[][] arr2 = {{"1", "1", "1", "1"}, {"1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        // массив с не корректным символом
        String[][] arr3 = {{"1", "1", "1", "1"}, {"1", "", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};

        try {
            System.out.println(Convertacion.strConvertacion(arr1));
        } catch (HeirExpection e) {
            e.getMessage();
        }

        try {
            System.out.println(Convertacion.strConvertacion(arr2));
        } catch (HeirExpection e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Convertacion.strConvertacion(arr3));
        } catch (HeirExpection e) {
            System.err.println(e.getMessage());
        }
    }
}
