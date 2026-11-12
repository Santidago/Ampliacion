import java.util.Scanner;

public class Escudo_Romano {
    public static void main(String[] args) {
        int Romanos,cant,forma,escudos=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca la cantidad de Romanos");
        Romanos = lector.nextInt();
        do {
            cant= 0;
            do
            {
                cant++;
                forma=Romanos-(cant*cant);
                if (forma<0)
                {
                    System.out.printf("Una formacion de %d por %d%n", cant - 1, cant - 1);
                    if (cant==2)
                    {
                        escudos=escudos+5;
                    }
                    else
                    {
                        escudos=escudos+4+((cant-1)*(cant-1))+((cant-1)*4)-4;
                    }
                }
            }while (forma>=0);
            Romanos = Romanos-((cant-1)*(cant-1));
            if (Romanos<0)
            {
                Romanos = -Romanos;
            }
            if (Romanos==1)
            {
                Romanos=0;
                System.out.printf("Una formacion de 1 por 1%n");
                escudos=escudos+5;
            }
        }while (Romanos>0);
        System.out.println("escudos "+escudos);
    }
}
