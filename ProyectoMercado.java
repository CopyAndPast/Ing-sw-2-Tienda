package proyectomercado;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ProyectoMercado {

    public static void main(String[] args) throws IOException {
        Productos Bic = new Productos("Lapices y plumas Bic Pack 6pcs", 12033, 10);
        Productos Kleenex = new Productos("Paquete de pañuelos Kleenex", 93027, 7);
        Productos Bachoco = new Productos("Pechuga 600gr Bachoco", 92971, 9);
        Productos Doritos = new Productos("Doritos nacho 300gr", 68282, 26);
        Productos Pedigree = new Productos("Alimento Pedigree adulto 15kg", 35627, 8);
        List<Pasillos> productos = Arrays.asList(Bic, Kleenex, Bachoco, Doritos, Pedigree);
        Scanner entrada = new Scanner(System.in);
        int n;
        int i;
        int id;

        System.out.println("Bienvenido empleado. ¿Que desea hacer?");
        System.out.println("1: ver inventario disponible de un producto " + "2: Añadir producto al inventario " + "3: Eliminar producto del inventario");
        i = entrada.nextInt();

        if (i == 1) {
            System.out.println("Ingrese el numero de identificacion del producto: ");
            id = entrada.nextInt();

            switch (id) {
                case 12033:

                    System.out.println(Bic.toString());
                    break;
                case 93027:

                    System.out.println(Kleenex.toString());
                    break;
                case 92971:

                    System.out.println(Bachoco.toString());
                    break;
                case 68282:

                    System.out.println(Doritos.toString());
                    break;
                case 35627:

                    System.out.println(Pedigree.toString());
                    break;
                default:
                    System.out.println("Numero de ID no encontrada");
                    break;
            }
        }
        if (i == 2) {
            System.out.println("Introducir el numero de identificacion del producto y el numero de unidades a agregar: ");
            id = entrada.nextInt();
            n = entrada.nextInt();

            switch (id) {
                case 12033:
                    Bic.Invet = Bic.Invet + n;
                    System.out.println(Bic.toString());
                    break;
                case 93027:
                    Kleenex.Invet = Kleenex.Invet + n;

                    System.out.println(Kleenex.toString());
                    break;
                case 92971:
                    Bachoco.Invet = Bachoco.Invet + n;

                    System.out.println(Bachoco.toString());
                    break;
                case 68282:
                    Doritos.Invet = Doritos.Invet + n;

                    System.out.println(Doritos.toString());
                    break;
                case 35627:
                    Pedigree.Invet = Pedigree.Invet + n;

                    System.out.println(Pedigree.toString());
                    break;
                default:
                    System.out.println("Numero de ID no encontrada");
                    break;

            }
        }
        if (i == 3) {
            System.out.println("Introducir el numero de identificacion del producto y el numero de unidades a eliminar: ");
            id = entrada.nextInt();
            n = entrada.nextInt();

            switch (id) {
                case 12033:
                    Bic.Invet = Bic.Invet - n;
                    System.out.println(Bic.toString());
                    break;
                case 93027:
                    Kleenex.Invet = Kleenex.Invet - n;

                    System.out.println(Kleenex.toString());
                    break;
                case 92971:
                    Bachoco.Invet = Bachoco.Invet - n;

                    System.out.println(Bachoco.toString());
                    break;
                case 68282:
                    Doritos.Invet = Doritos.Invet - n;

                    System.out.println(Doritos.toString());
                    break;
                case 35627:
                    Pedigree.Invet = Pedigree.Invet - n;

                    System.out.println(Pedigree.toString());
                    break;
                default:
                    System.out.println("Numero de ID no encontrada");
                    break;
            }
        } else if (i == 4) {
            imprimirInventario(productos);
        }
    }

    public static void imprimirInventario(List<Pasillos> productos) {
        //esta parte en el fileWriter poner la ruta a desear
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/usuario/Desktop/Nueva carpeta/inventario.txt"))) {
            for (Pasillos producto : productos) {
                writer.write(producto.toString());
                writer.newLine();
            }
            System.out.println("Inventario impreso en inventario.txt");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    }
}
