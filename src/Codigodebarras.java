import java.util.Scanner;

public class Codigodebarras {
    public static void main(String[] args) {
        int cant,remv,num;
        int[] barra = {1,1,1,1,0,0,0,0,0,0,0,0,0};
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca un Codigo de Barra");
        String Barra = lector.next();
        if (Barra.length()==8)
        {
            for (cant = 0; cant < 8; cant++) {
                remv = Integer.parseInt(Barra.substring((cant),(cant+1)));
                barra[cant] = remv;
            }
            num = barra[0]*3;
            for (cant = 1;cant <4;cant++)
            {
                num=num+(barra[(cant*2)-1]);
                num=num+(barra[cant*2]*3);
            }
            num=num+barra[7];
            if (num%10 != 0) {
                System.out.println("El codigo de la barra no es valido");
            }
            else
            {
                System.out.println("Barra normal");
            }
        }
        else if (Barra.length()==13)
        {
            for (cant = 0; cant < 13; cant++) {
                remv = Integer.parseInt(Barra.substring((cant),(cant+1)));
                barra[cant] = remv;
            }
            num = barra[1]*3;
            num = num+barra[0];
            for (cant = 1;cant <6;cant++)
            {
                num=num+(barra[cant*2]);
                num=num+(barra[(cant*2)+1]*3);
            }
            num=num+barra[12];
            if (num%10 != 0) {
                System.out.println("El codigo de la barra no es valido");
            }
            else
            {
                System.out.println("Barra normal");
            }
        }
        else
        {
            System.out.println("El largo del codigo es incorrecto");
        }
    }
}
