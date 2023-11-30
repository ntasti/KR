import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String textBeg = """
                Заполнить точки вектора с клавитуры или рандомно?");
                1.C клавиатуры
                2.Рандомно
                """;
        System.out.println(textBeg);

        VectorFunction vectorAB = new VectorFunction(scanner.nextInt());
        char input;
        //Цикл do-while ,который гоняет участоккода
        //и повторяет его до тех пор,пока я жму 1
        do {
            System.out.println("Ввведите номер функции,которую вы хотите выполнить:");
            String text = """
                    1.Присвоить данные вектора АВ вектору CD
                    2.Присвоить данные вектора CD вектору АВ
                    3.Модуль вектора AB и СВ
                    4.Скалярное произведение векторов AB b CD
                    5.Высчет кооринат по точкам вектора AB и СD
                    6.Все
                    """;
            System.out.println(text);
            //Вызов функции,в которой реализованы все методы
            vectorAB.function(scanner.nextInt());
            System.out.println("Нажмите 0 для повторения ");
            System.out.println("Нажмите любую кнопку,чтоб завершить программу ");
            //Cчитывание символа с клавиатуры
            input = scanner.next().charAt(0);
        } while (input == '0');
    }
}

