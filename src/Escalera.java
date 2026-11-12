import java.util.Arrays;
import java.util.Scanner;

public class Escalera {
    public static void main(String[] args) {
        int falta=14;
        int [] Cartas ={20,20,20,20,20};
        Scanner lector =new Scanner(System.in);
        for (int i=0;i<4;i++)
        {
            System.out.println("Inserte el numero de una carta");
            Cartas[i] = lector.nextInt();
        }
        Arrays.sort(Cartas);
        do {
            Cartas[4]=falta;
            if (Cartas[3]==(Cartas[2]+1))
            {
                if (Cartas[2]==(Cartas[1]+1)){
                    if (Cartas[1]==(Cartas[0]+1)){
                       if (Cartas[4]==(Cartas[0]-1)){
                           break;
                       } else if (Cartas[4]==(Cartas[3]+1)) {
                           break;
                       }
                    }
                }
            }
            if (Cartas[4]==Cartas[2]+1&& Cartas[4]==Cartas[3]-1) {
                break;
            } else if (Cartas[4]==Cartas[1]+1&&Cartas[4]==Cartas[2]-1) {
                break;
            } else if (Cartas[4]==Cartas[0]+1&&Cartas[4]==Cartas[1]-1) {
                break;
            }
            falta--;
        }while(falta>-1);
        System.out.println(Cartas[4]);
    }
}
