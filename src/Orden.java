import java.util.Scanner;

public class Orden {
    public static void main(String[] args) {
        int orden =0,ninguno=0;
        Scanner lector = new Scanner(System.in);
        int [] lista = new int[10];

        System.out.println("Inserte 10 numeros en orden");
        for (int i =0;i<10;i++)
        {
            lista[i]= lector.nextInt();
        }
        for (int i=0;i<9;i++)
        {
            if (lista[i]==(lista[i+1]-1))
            {
                orden =1;//creciente
            } else if (lista[i]==(lista[i+1]+1)) {
                orden =2;//decreciente
            }else if (lista[i]==lista[i+1]){
                ninguno=2;//todos iguales
            }
            else {
                ninguno=1;//no orden
            }
        }
        if (ninguno==1)
        {
            System.out.println("Los numeros que fueron insertados sin orden");
        }
        else if (ninguno==2)
        {
            System.out.println("Los numeros que fueron insertados son todos iguales");
        }
        else if (orden==1)
        {
            System.out.println("Los numeros fueron insertados crecientemente");
        }
        else
        {
            System.out.println("Los numeros fueron insertados decrecientemente");
        }
    }
 }

