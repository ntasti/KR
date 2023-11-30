import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Создание  вектора AB черeз  двумерный масив, где vector[x1=0 y1=0] по умолчанию,точку [x2 y2] вводим с клавиатуры
        System.out.println("Координаты вектора AB X0 Y0 ={0,0} .Введите координаты X1 Y1 ");
        VectorFunction vectorAB = new VectorFunction();
        vectorAB.pointVectorAB = new int[2][2];
        vectorAB.pointVectorAB[0][0] = 0;
        vectorAB.pointVectorAB[0][1] = 0;
        for (int u = 0; u < vectorAB.pointVectorAB.length; u++) {
            vectorAB.pointVectorAB[1][u] = scanner.nextInt();
        }
        //Вывод точек  вектора AB
        System.out.println("координаты вектора AB");
        for (int i = 0; i < vectorAB.pointVectorAB.length; i++) {
            for (int u = 0; u < vectorAB.pointVectorAB.length; u++) {
                System.out.print(vectorAB.pointVectorAB[i][u] + " ");
            }
            System.out.println(":X" + i + " Y" + i);
        }
        //Создание  вектора CD черeз  двумерный масив
        System.out.println("Введите координаты X0 Y0 и X1 Y1 для вектоар CD");
        VectorFunction vectorCD = new VectorFunction();
        vectorCD.pointVectorCD = new int[2][2];
        for (int i = 0; i < vectorCD.pointVectorCD.length; i++) {

            for (int u = 0; u < vectorCD.pointVectorCD.length; u++) {

                vectorCD.pointVectorCD[i][u] = scanner.nextInt();
            }
        }
        // Вывод точек  вектора СD
        System.out.println("координаты вектора СD");
        for (int i = 0; i < vectorCD.pointVectorCD.length; i++) {
            for (int u = 0; u < vectorCD.pointVectorCD.length; u++) {
                System.out.print(vectorCD.pointVectorCD[i][u] + " ");
            }
            System.out.println(":X" + i + " Y" + i);
        }

        //Переноc данных из одного веrтора во второй
        vectorAB.pointVectorAB = vectorAB.assignmentPoints(vectorCD.pointVectorCD);
        //Характеристи вектора AB
        // Модуль
        System.out.println("Модуль вектора AB " + vectorAB.moduleVector(vectorAB.pointVectorAB));
        //Скалярное произведение векторов
        System.out.println("Скалярное произведение " + vectorAB.scalarProduct(vectorAB.pointVectorAB, vectorCD.pointVectorCD));
        //Высчет и выввод координат   по точкам
        System.out.println("Координаты вектора " + Arrays.toString(vectorAB.vectorCoordinates(vectorCD.pointVectorCD)));
        //Вывод точек  вектора AB
        System.out.println("координаты вектора AB");
        for (int i = 0; i < vectorAB.pointVectorAB.length; i++) {
            for (int u = 0; u < vectorAB.pointVectorAB.length; u++) {
                System.out.print(vectorAB.pointVectorAB[i][u] + " ");
            }
            System.out.println(":X" + i + " Y" + i);
        }
    }
}