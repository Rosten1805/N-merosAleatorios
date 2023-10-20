import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Math.floor(Math.random()*10+1);

        int[] array = new int[10];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random()*10 + 1);
        }

        int suma = 0;
        for (i = 0; i< array.length; i++) {
        System.out.print(array[i]+" ");

            suma = suma + array[i];
        }
        System.out.println();
        System.out.println("La suma de los elementos del array es " + suma);
    }
}

