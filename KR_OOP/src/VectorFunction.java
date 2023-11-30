import java.util.*;
import java.util.Arrays;

public class VectorFunction {
    Scanner scanner = new Scanner(System.in);
    private int[][] pointVectorAB = {{0, 0}, {1, 1}};
    private int[][] pointVectorCD = new int[2][2];
    private int[] coordinateAB = new int[2];
    private int[] coordinateCD = new int[2];
    private int data;

    //Конструктор класса VectorFunction,где реализована инициализация через метод
    public VectorFunction(int data) {
        this.data = data;
        InitializationData(data);
    }

    //Метод инициализации,где переменные ил вводятся с клавиатуры
    //или рандомно генирируются каждый раз
    public void InitializationData(int data) {
        switch (data) {
            case 1:
                System.out.println("Точки вектора AB X0 Y0 ={0,0} .Введите точки X1 Y1 ");
                pointVectorAB = OutputCoordinateAB(pointVectorAB);
                System.out.println("точки вектора AB");
                Output(pointVectorAB);
                System.out.println("Введите точки X0 Y0 и X1 Y1 для вектоар CD");
                pointVectorCD = OutputCoordinateCD(pointVectorCD);
                System.out.println("точки вектора CD");
                Output(pointVectorCD);
                break;
            case 2:
                pointVectorAB = OutputCoordinateRandomAB(pointVectorAB);
                System.out.println("точки вектора AB");
                Output(pointVectorAB);
                pointVectorCD = OutputCoordinateRandomCD(pointVectorCD);
                System.out.println("точки вектора CD");
                Output(pointVectorCD);
                break;
        }
    }

    //Функция которая выводит точки вектора в консоль
    public void Output(int[][] pointVector) {
        for (int i = 0; i < pointVector.length; i++) {
            for (int u = 0; u < pointVector.length; u++) {
                System.out.print(pointVector[i][u] + " ");
            }
            System.out.println(":X" + i + " Y" + i);
        }
    }

    //Заполнение с клавиатуры точек вектора AB
    public int[][] OutputCoordinateAB(int[][] pointVector) {
        for (int u = 0; u < pointVector.length; u++)
            pointVector[1][u] = scanner.nextInt();
        return pointVector;
    }

    //Заполнение с клавиатуры точек вектора CD
    public int[][] OutputCoordinateCD(int[][] pointVector) {
        for (int i = 0; i < pointVector.length; i++) {

            for (int u = 0; u < pointVector.length; u++) {

                pointVector[i][u] = scanner.nextInt();
            }
        }
        return pointVector;
    }

    //Заполнение рандомно точек вектора  AB
    public int[][] OutputCoordinateRandomAB(int[][] pointVector) {
        Random random = new Random();//функция рандом
        for (int u = 0; u < pointVector.length; u++) {
            pointVector[1][u] = random.nextInt(100);//заполнение рандомными числами до 100
        }
        return pointVector;
    }

    //Заполнение рандомно точек вектора СD
    public int[][] OutputCoordinateRandomCD(int[][] pointVector) {
        Random random = new Random();//функция рандом
        for (int i = 0; i < pointVector.length; i++) {
            for (int u = 0; u < pointVector.length; u++)
                pointVector[i][u] = random.nextInt(100);//заполнение рандомными числами до 100
        }
        return pointVector;
    }

    ////ФУНКЦИИ

    //метод в котором через switch-case вызываются функции
    public void function(int function) {
        switch (function) {
            case 1:
                System.out.println("Присвоить данные вектора АВ вектору CD:");
                pointVectorCD=assignmentPoints(pointVectorAB);
                System.out.println("Вектор AВ:");
                Output(pointVectorAB);
                System.out.println("Вектор СD:");
                Output(pointVectorCD);
                break;
            case 2:
                System.out.println("Присвоить данные вектора  CD в AB:");
                pointVectorAB = assignmentPoints(pointVectorCD);
                System.out.println("Вектор AВ:");
                Output(pointVectorAB);
                System.out.println("Вектор СD:");
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

    //Функция присваивания
    public int[][] assignmentPoints(int vector1[][]) {

        int vector[][] = vector1;
        return vector;
    }

    //высчет модуля вектора
    public double moduleVector(int vector[][]) {
        double modul = (double) Math.sqrt((int) Math.pow((vector[0][0] - vector[1][0]), 2) + (int) Math.pow((vector[0][1] - vector[1][1]), 2));
        return modul;
    }

    //Высчет скалярного произведения векторов
    public int scalarProduct(int vector1[][], int vector2[][]) {
        int[] coordinate1 = vectorCoordinates(vector1);
        int[] coordinate2 = vectorCoordinates(vector2);
        int scalar = coordinate1[0] * coordinate2[0] + coordinate1[1] * coordinate2[1];
        return scalar;
    }

    //Высчет координат по точкам
    public int[] vectorCoordinates(int vector[][]) {
        int[] coordinate = new int[2];
        coordinate[0] = vector[1][0] - vector[0][0];
        coordinate[1] = vector[1][1] - vector[0][1];
        return coordinate;
    }
}
