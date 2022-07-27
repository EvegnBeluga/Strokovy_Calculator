

public class MultString {
    // класс умножение
    public static void mult(String first, String second) {

        if (first.length() > 10 | first.length() < 1) {
            System.out.println("Ошибка:  колличество символов операнда не должно привышать 10ти!!!");
            System.exit(22);
        }
        String s = "";
        int n = Integer.parseInt(second);
        int i = 0;
        if (n < 1 || n > 10) {
            System.out.println("Введеное число меньше 1 либо больше 10\"");
            System.exit(2);
        } else {
            while (i < n) {

                s += first;
                i++;
            }
        }

        if (s.length() > 40) {
            System.out.println("\"" + s.substring(0, 40) + "..." + "\"");
        } else {
            System.out.println("\"" + s + "\"");
        }
    }
}
