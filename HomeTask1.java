import java.util.logging.Logger;

/*
Задание 1
Напишите программу, записывающую 100 раз слово ”ТЕST” в файл. 
Слова должны чередоваться по формату – четная итерация большими буквами, нечетные – маленькими
Пример: TESTtestTESTtestTEST…
 */

public class HomeTask1 {
    public static void main(String[] args) {
        Logger l = Logger.getAnonymousLogger();
        String str = "TEST";
        int n = 100;
        l.warning(concat(str, n));

    }

    private static String concat(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                str = str.toLowerCase();
                sb.append(str);

            } else {
                str = str.toUpperCase();
                sb.append(str);
            }
        }
        return sb.toString();
    }

}
