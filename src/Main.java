public class Main {
    public static void main(String[] args) {

        Integer[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        Character[][] array2 = {
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'o'},
                {'q', 'w', 'e', 'r', 't'},
                {'z', 'x', 'c', 'v', 'b'},
                {'n', 'm', 'l', 'k', 'j'},

        };

        System.out.println("--- Initial array: ");

        PrintTwoDimensionalArray(array2);

        System.out.println("--- Modified array: ");

        SwapDiagonalsOfTwoDimensionalArray(array2);

        PrintTwoDimensionalArray(array2);
    }

    public static <T> void SwapDiagonalsOfTwoDimensionalArray(T[][] array){
        if (IsArrayNull(array)) throw new NullPointerException();

        int columnNumber = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j){
                    T temp = array[i][j];
                    array[i][j] = array[i][columnNumber];
                    array[i][columnNumber] = temp;
                    columnNumber--;
                    break;
                }
            }
        }
    }

    public static <T> void PrintTwoDimensionalArray(T[][] array){
        if(IsArrayNull(array)) throw new NullPointerException();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static <T> boolean IsArrayNull(T[][] array){
        return array == null;
    }
}