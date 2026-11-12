public class Lychrel {
    public static void main(String[] args) {
        int numero=4994,inverso,resultado,contador=1;
        boolean llego =false;
        do {
            inverso = reverse(numero);
            resultado=inverso+numero;
            if (check(resultado)){
                llego=true;
                break;
            }else{
                numero=resultado;
            }
            contador++;
        }while(resultado<1000000000);
        if (!llego){
            contador=-1;
        }
        System.out.println(contador);
    }
    public static int reverse(int numero) {
        String reverso = String.valueOf(numero);
        String[] partes = reverso.split("");
        String arbalap = partes[partes.length - 1];
        for (int i = partes.length - 2; i > -1; i--) {
            arbalap = String.join("", arbalap, partes[i]);
        }
        return Integer.parseInt(arbalap);
    }
    public static boolean check(int numero) {
        String capicua = String.valueOf(numero);
        String[] partes = capicua.split("");
        int contador=0;
        for (int i = partes.length - 1; i > partes.length/2; i--) {
            if (!partes[i].equals(partes[contador])) {
                return false;
            }
            contador++;
        }
        return true;
    }
}
