/*
Autor: Juan Pablo Montoya.
DESCRIPCIÓN
Un programa que permite convertir coordenadas cartesianas en coordenadas polares
*/
package punto2d;
import java.util.concurrent.ThreadLocalRandom;

public class Punto2D {

    public static void main(String[] args) {
        //Obtenemos coordenadas X y Y aleatoriamente.
        int x=coordenadaX();
        int y=coordenadaY();
        //Imprimimos las coordenadas tanto cartesianas como polares
        System.out.println("Coordenadas Cartesianas: ");
        System.out.println("X: " + x + "\n" + "Y: " + y);
        System.out.println("Coordenadas polares: ");
        System.out.println("Radio Polar: " + radioPolar(x, y));
        System.out.println("Ángulo Polar: " + anguloPolar(y, radioPolar(x, y)));
    }
    //Obtenemos x de un número aleatorio.
    static public int coordenadaX(){
        int x = ThreadLocalRandom.current().nextInt(5, 100 + 1);
        return x;
    }
    //Obtenemos y de un número aleatorio.
    static public int coordenadaY(){
        int y = ThreadLocalRandom.current().nextInt(5, 100 + 1);
        return y;
    }
    //Obtenemos el radio, usando pitágoras con la formula de la hipotenusa.
    static public int radioPolar(int x, int y){
        int rp = (int) Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
        return rp;
    }
    //Obtenemos el angulo, usando pitágoras, para hallar el angulo alfa.
    static public int anguloPolar(double co, double h){
        int ap = (int) Math.toDegrees(Math.asin(co/h));
        return ap;
    }
}
