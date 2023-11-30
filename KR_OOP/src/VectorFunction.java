import java.util.*;
import java.util.Arrays;

public class VectorFunction {
    Scanner scanner = new Scanner(System.in);
    public int[][] pointVectorAB = {{0, 0}, {1, 1}};
    public int[][] pointVectorCD = new int[2][2];
    public int[] coordinateAB = new int[2];
    public int[] coordinateCD = new int[2];
    private int data;

    //Конструктор
    public VectorFunction(int data) {
        this.data = data;
        InitializationData(data);
    }

    //Инициализация
    public void InitializationData(int data) {
        switch (data) {
            case 1:
                System.out.println("Координаты вектора AB X0 Y0 ={0,0} .Введите координаты X1 Y1 ");
                pointVectorAB = OutputCoordinateAB(pointVectorAB);
                System.out.println("координаты вектора AB");
                Output(pointVectorAB);
                System.out.println("Введите координаты X0 Y0 и X1 Y1 для вектоар CD");
                pointVectorCD = OutputCoordinateCD(pointVectorCD);
                System.out.println("координаты вектора CD");
                Output(pointVectorCD);

                break;
            case 2:
                pointVectorAB = OutputCoordinateRandomAB(pointVectorAB);
                System.out.println("координаты вектора AB");
                Output(pointVectorAB);
                pointVectorCD = OutputCoordinateRandomCD(pointVectorCD);
                System.out.println("координаты вектора CD");
                Output(pointVectorCD);
                break;
        }
    }

    //Вывод точек вектора
    public void Output(int[][] pointVector) {
        for (int i = 0; i < pointVector.length; i++) {
            for (int u = 0; u < pointVector.length; u++) {
                System.out.print(pointVector[i][u] + " ");
            }
            System.out.println(":X" + i + " Y" + i);
        }
    }

    //Заполнение с клавиатуры AB
    public int[][] OutputCoordinateAB(int[][] pointVector) {
        for (int u = 0; u < pointVector.length; u++) {

            pointVector[1][u] = scanner.nextInt();
        }
        return pointVector;
    }

    //Заполнение с клавиатуры CD
    public int[][] OutputCoordinateCD(int[][] pointVector) {
        for (int i = 0; i < pointVector.length; i++) {

            for (int u = 0; u < pointVector.length; u++) {

                pointVector[i][u] = scanner.nextInt();
            }
        }
        return pointVector;
    }

    //Заполнение рандом AB
    public int[][] OutputCoordinateRandomAB(int[][] pointVector) {
        Random random = new Random();//функция рандом
        for (int u = 0; u < pointVector.length; u++) {
            pointVector[1][u] = random.nextInt(100);//заполнение рандомными числами до 100
        }
        return pointVector;
    }

    //Заполнение рандом СD
    public int[][] OutputCoordinateRandomCD(int[][] pointVector) {
        Random random = new Random();//функция рандом
        for (int i = 0; i < pointVector.length; i++) {
            for (int u = 0; u < pointVector.length; u++)
                pointVector[i][u] = random.nextInt(100);//заполнение рандомными числами до 100
        }
        return pointVector;
    }

    ////ФУНКЦИИ
    public void function(int function) {
        switch (function) {
            case 1:
                System.out.println("Присвоить данные вектора AB вектору CD:");
                assignmentPoints(pointVectorAB);
                Output(pointVectorAB);
                break;
            case 2:
                System.out.println("Присвоить данные вектора  CD в AB:");
                pointVectorCD = assignmentPoints(pointVectorAB);
                Output(pointVectorCD);
                break;
            case 3:
                System.out.println("Модуль вектора AB и СD:");
                pointVectorAB = assignmentPoints(pointVectorCD);
                System.out.println("Модуль АВ: " + moduleVector(pointVectorAB));
                System.out.println("Модуль СD: " + moduleVector(pointVectorCD));
                break;
            case 4:
                System.out.println("Скалярное произведение векторов AB в CD:");
                System.out.println(scalarProduct(pointVectorAB, pointVectorCD));
                break;
            case 5:
                System.out.println("Высчет кооринат по точкам вектора AB и СD:");
                coordinateAB = vectorCoordinates(pointVectorAB);
                coordinateCD = vectorCoordinates(pointVectorCD);
                System.out.println("Координаты AB:" + Arrays.toString(coordinateAB));
                System.out.println("Координаты СD:" + Arrays.toString(coordinateCD));
                break;
            case 6:
                System.out.println("Все,кроме присвоить:");
                System.out.println("Модуль АВ: " + moduleVector(pointVectorAB));
                System.out.println("Модуль СD: " + moduleVector(pointVectorCD));
                System.out.println("Скалярное произведение векторов AB в CD:" + scalarProduct(pointVectorAB, pointVectorCD));
                coordinateAB = vectorCoordinates(pointVectorAB);
                coordinateCD = vectorCoordinates(pointVectorCD);
                System.out.println("Координаты АВ:" + Arrays.toString(coordinateAB));
                System.out.println("Координаты СD:" + Arrays.toString(coordinateCD));
                break;
        }
    }

    //Присваивание
    public int[][] assignmentPoints(int vector1[][]) {

        int vector[][] = vector1;
        return vector;
    }

    //высчет модуля вектора 2 пункт
    public double moduleVector(int vector[][]) {
        double modul = (double) Math.sqrt((int) Math.pow((vector[0][0] - vector[1][0]), 2) + (int) Math.pow((vector[0][1] - vector[1][1]), 2));
        return modul;
    }

    //Высчет скалярного произведения векторов 3 пункт
    public int scalarProduct(int vector1[][], int vector2[][]) {
        int[] coordinate1 = vectorCoordinates(vector1);
        int[] coordinate2 = vectorCoordinates(vector2);
        int scalar = coordinate1[0] * coordinate2[0] + coordinate1[1] * coordinate2[1];
        return scalar;
    }

    //Высчет координат по точкам  4 пункт
    public int[] vectorCoordinates(int vector[][]) {
        int[] coordinate = new int[2];
        coordinate[0] = vector[1][0] - vector[0][0];
        coordinate[1] = vector[1][1] - vector[0][1];
        return coordinate;
    }
}
