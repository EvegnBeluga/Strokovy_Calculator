public class Subtraction {
    public static String subtraction(String first, String second) {
        if (first.length() > 10 | second.length() > 10) {
            System.out.println("Ошибка:  колличество символов операнда не должно привышать 10ти!!!");
            System.exit(22);
        }
        String[] arr = new String[second.length()];
        String[] ass = new String[first.length()];
        String sub = "";
        if (first.contains(second)) {
            int fir = first.indexOf(second);
            int k = fir + arr.length;
            sub = first.substring(0, fir) + first.substring(k, ass.length);
        }
        return sub;
    }
}
