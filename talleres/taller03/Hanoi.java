package hanoi;

import java.util.Scanner;

public class Hanoi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte número de discos: ");
        int n = sc.nextInt();
        max(1, 1, n);

    }

    public static void secuencia(int fichas, int i, int max) {
        double exp = 1;
        while (((2 * i) % Math.pow(2, exp)) == 0) {
            exp += 1;
        }
        int r = (int) exp - 1;

        if (fichas % 2 == 0) {
            if (r % 2 == 0 && r != 1) {
                System.out.println("Mover ficha " + r + ", 2 posiciones a la derecha.");

            } else {
                System.out.println("Mover ficha " + r + ", 1 posición a la derecha.");
            }
        } else {
            if (r % 2 == 0) {
                System.out.println("Mover ficha " + r + ", 1 posición a la derecha.");

            } else {
                System.out.println("Mover ficha " + r + ", 2 posiciones a la derecha.");
            }
        }

        if (i < max) {
            secuencia(fichas, i + 1, max);
        }

    }
    //Buca las combinaciones minimas con la siguiente formula: n+(n+1) 
    public static void max(int i, int n, int ficha) {
        if (i < ficha) {
            n += (n + 1);
            max(i + 1, n, ficha);
        } else {
            System.out.println("Combinaciones mínimas: " + n);
            secuencia(ficha, 1, n);
        }
    }

}
