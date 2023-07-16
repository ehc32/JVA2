package View;

import Class.Capturar;
import Class.Capturar;
import java.util.Arrays;

public class Ejercios1 {

    public static void main(String[] args) {
        //intanciar clase
      Capturar x = new Capturar();
        Double a[], b[], c[];
        Integer cantidad, i;

        x.setMensaje("Digite el tamaño para los vectores A, B, C : ");
        cantidad = x.Capturar().intValue();
        a = new Double[cantidad];
        b = new Double[cantidad];
        c = new Double[cantidad];

        for (i = 0; i < cantidad; i++) {
            x.setMensaje("A[" + i + "]: ");
            a[i] = x.Capturar();
        }

        for (i = 0; i < cantidad; i++) {
            x.setMensaje("B[" + i + "]: ");
            b[i] = x.Capturar();
        }

        for (i = 0; i < cantidad; i++) {
            c[i] = a[i] + b[i];
        }
        

        // Salida del programa
        System.out.println("Vector A: " + Arrays.toString(a));
        System.out.println("Vector B: " + Arrays.toString(b));
        System.out.println("Vector C: " + Arrays.toString(c));
    }
}


