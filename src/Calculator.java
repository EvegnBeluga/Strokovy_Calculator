public class Calculator {
    public static String calc(String first, String second, String op) {
        String result = "";
        switch (op) {
            case "*" -> MultString.mult(first, second);
            case "/" -> System.out.println("\"" + Division.division(first, second) + "\"");
            case "-" -> System.out.println("\"" + Subtraction.subtraction(first, second) + "\"");
            case "+" -> System.out.println("\"" + Addition.addition(first, second) + "\"");
            default -> System.out.println("Ввели не правильный оператор!\n Проверьте [+,-,/,*] и попробуйте ещё раз");
        }
        return result;
    }
}
