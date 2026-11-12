public class Reversible {
    public static void main(String[] args) {
        int numero=1010,inverso;
        inverso=reverse(numero);
        if (inverso==0){
            System.out.println("El numero no es reversible");
        }else {
            int resultado = inverso + numero;
            if (check(resultado)) {
                System.out.println("El numero es reversible");
            } else {
                System.out.println("El numero no es reversible");
            }
        }
    }
    public static int reverse(int numero){
        String reverso=String.valueOf(numero);
        String[] partes =reverso.split("");
        String arbalap= partes[partes.length-1];
        for(int i = partes.length-2; i>-1; i--){
            arbalap= String.join("",arbalap, partes[i]);
        }
        if (arbalap.indexOf('0')==0)
        {
            return 0;
        }
        return Integer.parseInt(arbalap);
    }
    public static boolean check(int numero){
        String reverso=String.valueOf(numero);
        String[] partes=reverso.split("");
        for (String parte:partes){
            if (Integer.parseInt(parte)%2==0){
                return false;
            }
        }
        return true;
    }
}

