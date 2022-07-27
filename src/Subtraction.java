public class Subtraction {
    public static String subtraction(String first, String second) {
        if (first.length() > 10 | second.length() > 10) {
            System.out.println("Ошибка:  колличество символов операнда не должно привышать 10ти!!!");
            System.exit(22);
        }
        String sub;
        if (first.contains(second)) {
            int difference = first.length() - second.length();
            sub = first.substring(0, difference);
        } else {
            sub = first;
        }
        return sub;
    }
}
