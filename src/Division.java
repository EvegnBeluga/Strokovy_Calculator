public class Division {
    public static String division(String first, String second) {

        if (first.length() > 10 | first.length() < 1) {
            System.out.println("Ошибка:  колличество символов операнда не должно привышать 10ти!!!");
            System.exit(22);
        }
        StringBuilder result = new StringBuilder();
        int divider = Integer.parseInt(second);
        if (divider < 1 || divider > 10) {
            System.out.println("Введеное число меньше 1 либо больше 10");
            System.exit(1);
        } else {
            for (int j = 0; j < first.length(); j++) {
                if (j < first.length() / divider) {
                    result.append(first.charAt(j));
                }
            }
        }
        return result.toString();
    }
}
