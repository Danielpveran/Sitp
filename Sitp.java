import java.util.Scanner;

public class Sitp { //NOmbre del Archivo

    public static void main(String[] args) {
        // Tu código comienza aquí
        Scanner Scanner = new Scanner(System.in); // Para que lea los inputs

                // Crear instancias de las clases Bus y RutaFeriado
                Bus Transmi1 = new Bus("G43");
                Bus Transmi2 = new Bus("A21");

                RutaFeriado rutaFeriado = new RutaFeriado();

                // Agregar estaciones a los buses
                Transmi1.agregarEstacion("Marly");
                Transmi1.agregarEstacion("Heroes");
                Transmi1.agregarEstacion("Portal el dorado");

                Transmi2.agregarEstacion("Heroes");
                Transmi2.agregarEstacion("El dorado");
                Transmi2.agregarEstacion("Usme");

    }
}