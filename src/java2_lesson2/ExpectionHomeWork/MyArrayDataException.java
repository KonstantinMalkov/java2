package java2_lesson2.ExpectionHomeWork;

public class MyArrayDataException extends HeirExpection {
    public MyArrayDataException(int row, int col) {
        super(String.format("Проверьте символ в строке / колонке [%d, %d]", row, col));
    }
}
