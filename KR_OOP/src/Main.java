import java.sql.SQLOutput;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Создание  вектора AB черeз  двумерный масив, где vector[x1=0 y1=0] по умолчанию,точку [x2 y2] вводим с клавиатуры
        System.out.println("Координаты вектора CD X0 Y0 ={0,0} .Введите координаты X1 Y1 ");
        int[][] vectorAB = new int[2][2];
        vectorAB[0][0] = 0;
        vectorAB[0][1] = 0;

        for (int u = 0; u < vectorAB.length; u++) {
            vectorAB[1][u] = scanner.nextInt();
        }


//Создание произвольного вектора СD черз  двумерный масив, где vector[x1 y1][x2 y2]
        System.out.println("Введите координаты X0 Y0 и X1 Y1 для вектоар CD");
        int[][] vectorCD = new int[2][2];
        for (int i = 0; i < vectorCD.length; i++) {

            for (int u = 0; u < vectorCD.length; u++) {

                vectorCD[i][u] = scanner.nextInt();
            }

        }

        //координаты вектора AB
        System.out.println("координаты вектора AB");
        for (int i = 0; i < vectorAB.length; i++) {
            for (int u = 0; u < vectorAB.length; u++) {
                System.out.print(vectorAB[i][u] + " ");
            }
            System.out.println(":X" + i + " Y" + i);
        }

        //координаты вектора СD
        System.out.println("координаты вектора СD");
        for (int i = 0; i < vectorCD.length; i++) {
            for (int u = 0; u < vectorCD.length; u++) {
                System.out.print(vectorCD[i][u] + " ");
            }
            System.out.println(":X" + i + " Y" + i);
        }

//        double moduleNumbers = moduleVector(vectorCD);
//        System.out.println(moduleNumbers);
//        int[] coordinateCD=vectorCoordinates(vectorCD);
//        for(int i=0;i< coordinateCD.length;i++){
//            System.out.print(coordinateCD[i]+" ");
//        }

    }

    //Присваивание

    //высчет модуля вектора 2 пункт
    public static double moduleVector(int vector[][]) {
        double modul = (double) Math.sqrt((int) Math.pow((vector[0][0] - vector[1][0]), 2) + (int) Math.pow((vector[0][1] - vector[1][1]), 2));
        return modul;
    }
    //Высчет скалярного произведения векторов 3 пункт
    public static int scalarProduct (int vector1[][],int vector2[][]){
        int [] coordinate1=vectorCoordinates(vector1);
        int [] coordinate2=vectorCoordinates(vector2);
        int scalar=coordinate1[0]*coordinate2[0]+coordinate1[1]*coordinate2[1];
        return scalar;
    }
    //Высчет координат по точкам  4 пункт
    public static int[] vectorCoordinates(int vector[][]) {
        int[] coordinate = new int[2];
        coordinate[0] = vector[1][0] - vector[0][0];
        coordinate[1] = vector[1][1] - vector[0][1];

        return coordinate;
    }

}