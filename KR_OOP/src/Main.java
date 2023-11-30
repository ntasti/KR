import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Заполнить точки вектора  клавитуры или рандомно?");
        System.out.println("1.C клавиатуры");
        System.out.println("2.Рандомно");
        int data = scanner.nextInt();
        VectorFunction vectorAB = new VectorFunction(data);


        System.out.println("Ввведите номер функции,которую вы хотите выполнить:");
        String text = """
                1.Перенести данные из AB в CD
                2.Перенести данные из  CD в AB
                3.Модуль вектора AB и СВ
                4.Скалярное произведение векторов AB в CD
                5.Высчет кооринат по точкам вектора AB и СD
                6.Все
                """;
        System.out.println(text);
        int functionNumber = scanner.nextInt();
        vectorAB.function(functionNumber);
    }
}

