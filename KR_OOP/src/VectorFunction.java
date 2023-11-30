public class VectorFunction {

    public int[][] pointVectorAB;
    public int[][] pointVectorCD;
    public int[] coordinateAB = new int[2];
    public int[] coordinateCD = new int[2];

    public void setValues(int[][] pointVectorAB, int[][] pointVectorCD) {
        pointVectorAB = this.pointVectorAB;
        pointVectorCD = this.pointVectorCD;

    }

//    public String getValues() {
//        return "";
//    }

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
