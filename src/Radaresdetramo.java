import java.util.Scanner;

public class Radaresdetramo {
    public static void main(String[] args) {
        double distancia,velocidadmax,tiempo,maxconductor;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca la distancia(metros), velocidad maxima(km/h) y el tiempo(segundos)");
        distancia = lector.nextDouble();
        velocidadmax = lector.nextDouble();
        tiempo = lector.nextDouble();
        velocidadmax = velocidadmax/3.6;//de km/h a m/s
        maxconductor = distancia/tiempo;
        if (maxconductor < velocidadmax)
        {
            System.out.println("OK");
        }
        else
        {
            System.out.println("Puntos");
        }
    }
}
