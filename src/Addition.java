public class Addition {
    public static String addition(String first, String second) {
        String summa = "";
        if (first.length() > 10 | second.length() > 10) {
            System.out.println("Ошибка:  колличество символов операнда не должно привышать 10ти!!!");
            System.exit(22);
        } else {
            summa = first + second;
        }
        return summa;
    }
}
