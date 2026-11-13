import java.util.Arrays;

public class Expresiones {
    public static void main(String[] args) {
        //now uncomplete
        int limite;
        String expresion="5 1 2 + 4 * + 3 -";
        String [] partes=expresion.split(" ");
        do {
        for(int contador=0;contador<partes.length;contador++) {
            switch (partes[contador]) {
                case "+" -> {
                    partes = Arrays.copyOf(next(partes, contador, '+'),partes.length);
                    contador -= 2;
                    partes[partes.length-1] = "0";
                    partes[partes.length-2] = "0";
                }
                case "-" -> {
                    partes = Arrays.copyOf(next(partes, contador, '-'),partes.length);
                    contador -= 2;
                    partes[partes.length-1] = "0";
                    partes[partes.length-2] = "0";
                }
                case "*" -> {
                    partes = Arrays.copyOf(next(partes, contador, '*'),partes.length);
                    contador -= 2;
                    partes[partes.length-1] = "0";
                    partes[partes.length-2] = "0";
                }
                case "/" -> {
                    partes = Arrays.copyOf(next(partes, contador, '/'),partes.length);
                    contador -= 2;
                    partes[partes.length-1] = "0";
                    partes[partes.length-2] = "0";
                }
            }
        }
             expresion=String.join("",partes);
        }while(!expresion.matches("[0-9]+"));
        if (expresion.indexOf("0")==0) {
            System.out.println(expresion.charAt(0));
        }
        else if (expresion.length()>1) {
            limite = expresion.indexOf("0");
            System.out.println(expresion.substring(0, limite));
        }else  {
            System.out.println(expresion);
        }
    }
    public static String[] next(String[] partes,int contador,char simbolo){
        int num1=0,num2=0,resultado=0;
        for(int contador1=contador;contador1>-1;contador1--) {
            if(partes[contador1].matches("[0-9]+")&& num1==0) {
                num1=Integer.parseInt(partes[contador1]);
            }else if(partes[contador1].matches("[0-9]+")) {
                num2=Integer.parseInt(partes[contador1]);
                break;
            }
        }
        if (simbolo=='+') {
            resultado=num2+num1;
        } else if (simbolo=='-') {
            resultado=num2-num1;
        } else if (simbolo=='*') {
            resultado=num2*num1;
        } else if (simbolo=='/') {
            resultado=num2/num1;
        }
        partes[contador-2]=String.valueOf(resultado);
        for (int contador2=contador-1;contador2<partes.length-2;contador2++) {
            partes[contador2]=partes[contador2+2];
        }
        return partes;
    }
}
