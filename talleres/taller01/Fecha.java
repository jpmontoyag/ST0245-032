package fecha;

import java.util.Calendar;
import java.util.Scanner;

public class Fecha {

    //Se establece variables para almacenar la fecha ingresada.
    static private int dia;
    static private int mes;
    static private int anio;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se ingresa la fecha.
        System.out.println("Ingrese el día:");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes:");
        mes = sc.nextInt();
        //Se resta 1 al mes debido a que el calendario en java comienza en 0 para enero. Al ingresar 1 como el mes de enero, internamente se reduce a 0, para poder trabajar normal.
        mes -= 1;
        System.out.println("Ingrese el año:");
        anio = sc.nextInt();

        //Se comprueba la fecha y se almacena a en una variable.
        Calendar fecha = Calendar.getInstance();
        int res = comparar(obtenerDia(fecha), obtenerMes(fecha), obtenerAnio(fecha), dia, mes, anio);
        //Se analiza la variable y se pasa a una expresión entendible.
        switch (res) {
            case -1:
                System.out.println("La fecha ingresada está antes.");
                break;
            case 1:
                System.out.println("La fecha ingresada está después.");
                break;
            case 0:
                System.out.println("La fecha ingresada es igual.");
                break;
        }
        //Se imprime las dos fechas.
        System.out.println(fechaToString(fecha));
        System.out.println(dia + "/" + mes + 1 + "/" + anio);

    }
    //Constructor

    public Fecha(int d, int m, int a) {
        d = dia;
        m = mes;
        a = anio;
    }
    //Se Obtiene el día.
    static public int obtenerDia(Calendar fecha) {
        int d = fecha.get(Calendar.DAY_OF_MONTH);
        return d;
    }
    //Se obtiene el mes.
    static public int obtenerMes(Calendar fecha) {
        int m = fecha.get(Calendar.MONTH);
        return m;
    }
    //Se obtiene el año.
    static public int obtenerAnio(Calendar fecha) {
        int a = fecha.get(Calendar.YEAR);
        return a;
    }
    //Se pasa la fecha a string.
    static public String fechaToString(Calendar f) {
        String FechaA = obtenerDia(f) + "/" + obtenerMes(f) + 1 + "/" + obtenerAnio(f);
        return FechaA;
    }
    //Comparamos las fechas.
    static public int comparar(int d, int m, int a, int dn, int mn, int an) {
        int res = 5;
        if (an > a) {
            res = 1;
        } else if (an < a) {
            res = -1;
        } else if (an == a) {
            if (mn > m) {
                res = 1;
            } else if (mn < m) {
                res = -1;
            } else if (mn == m) {
                if (dn > d) {
                    res = 1;
                } else if (dn < d) {
                    res = -1;
                } else if (dn == d) {
                    res = 0;
                }
            }
        }
        return res;
    }

}
