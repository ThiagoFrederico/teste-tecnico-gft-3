package exercInverterInt;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {15485448,2195498,12,98716549, 999999899, 1654891};

        for(int numero : numeros) {
            inverter(numero);
        }

    }

    public static void inverter(int numero){
        int aux = numero;
        int i = 0;

        while (numero > 0) {
            i *= 10;
            i += (numero % 10);
            numero /= 10;
        }

        System.out.printf("%d -> %d.\n",aux, i);

    }
}
