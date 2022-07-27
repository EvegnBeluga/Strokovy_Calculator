
import java.util.Scanner;

public class Main {

    public static String quotes(String str) {
        String value = str;

        int fir = str.indexOf('\"');
        int last = str.lastIndexOf('\"');
        int length = str.length();
        if (fir == 0 && last == length - 1) {
            value = str.substring(1, length - 1);
        } else {
            System.out.println("Строка должна быть в кавычках: \"String\"");
            System.exit(11);
        }
        return value;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String first;
        String op;
        String second;
        String str = sc.nextLine();

        if (str.contains("-") | str.contains("+")) {
            String[] subs = str.trim().split("\"");
// удаляем нулевой элемент массива
            String[] newArr = new String[subs.length - 1];

            int j = 0;
            while (j < subs.length - 1) {
                newArr[j] = subs[j + 1];
                j++;
            }
            first = newArr[0].trim();
            op = newArr[1].trim();
            second = newArr[2].trim();

            System.out.println(Calculator.calc(first, second, op));

        }else if (str.contains("*") || str.contains("/")) {
                String[] arr = str.trim().split("\\s");

                String firsts = arr[0].trim();
                first = quotes(firsts);

                op = arr[1].trim();
                second = arr[2].trim();
            System.out.println(Calculator.calc(first, second, op));
        } else {
            System.out.println("Проверьте правильность написания оператора: [+,-,/,*]");
        }
    }
}

