package Exceptions;

public class HW01 {
//    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void arithmeticException(){
        int d = 0;
        int a = 10 / d;

    }
    public static void arrayExceptions(){
        int[] myIntArray = new int[]{1, 2, 3};
        System.out.println(myIntArray[5]);

    }

    public static void castException(){
        Object i = Integer.valueOf(42);
        String s = (String)i;

    }

//    Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//    3 типа!
    public static int[] subtractArrays(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
        System.out.println("Длины массивов не равны!");
        return null;
    }
    int[] result = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
        result[i] = arr1[i] - arr2[i];
    }
    return result;
}
    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль!");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }

}
