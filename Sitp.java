import java.util.Scanner;

public class Sitp { //NOmbre del Archivo

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in); // Para que lea los inputs

                // Crear instancias de las clases Bus y RutaFeriado
                Bus Transmi1 = new Bus("G43");
                Bus Transmi2 = new Bus("A21");
                // Bus es la clase Y transmi son las variables
                RutaFeriado rutaFeriado = new RutaFeriado();

                // Agregar estaciones a los buses
                Transmi1.agregarEstacion("Marly");
                Transmi1.agregarEstacion("Heroes");
                Transmi1.agregarEstacion("Portal el dorado");

                Transmi2.agregarEstacion("Heroes");
                Transmi2.agregarEstacion("Tunal");
                Transmi2.agregarEstacion("Portal del Norte");

                //Agrego las rutas en feriads
                rutaFeriado.agregarRutaFeriado("G43");

                //Menu
                int Opcion;

                while (true) {
                    System.out.println("Menú:");
                    System.out.println("1. Consultar paradas de un bus");
                    System.out.println("2. Consultar rutas en días feriados");
                    System.out.println("3. Salir");
                    System.out.print("Ingrese su opción: ");
                    Opcion = Scanner.nextInt();

                    switch (Opcion) {
                        case 1:
                            System.out.println("1. Ingrese la ruta a buscar");
                            String numeroRuta = Scanner.next();
                                if (numeroRuta.equals(Transmi1.getNumeroRuta())) {
                                    System.out.println("Paradas del bus " + numeroRuta + ": " + Transmi1.getEstaciones());
                                }

                                else if (numeroRuta.equals(Transmi1.getNumeroRuta())) {
                                    System.out.println("Paradas del bus " + numeroRuta + ": " + Transmi2.getEstaciones());
                                }

                                else {
                                    System.out.print("Ingrese su opción: ");
                                }
                                break;

                        case 2:
                        System.out.println("Rutas en días feriados: " + rutaFeriado.getRutasFeriado());
                        break;

                        case 3:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;

                        default:
                        System.out.println("Opcion invalida");
                        break;

                    }
                            
                }
    }
                
}