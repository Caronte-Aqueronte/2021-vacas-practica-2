package src.tienda;

import src.clientes.VectorClientes;
import src.peliculas.VectorPelicula;

public class Principal {

    public static void main(String[] args) {
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private VectorPelicula tablaPelicula = new VectorPelicula();

    public Principal() {

        int menu = 0;

        while (menu != -1) {
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar clientes ascente");
            System.out.println("4) Ordenar clientes descendente");
            System.out.println("5) Ingresar de peliculas");
            System.out.println("6) Modificar pelicula");
            System.out.println("7) Eliminar Pelicula");
            System.out.println("8) Mostrar peliculas");
            System.out.println("9) Ordenar peliculas ascendentemente");
            System.out.println("10) Ordenar peliculas descendente");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);
            switch (menu) {
                case 1:
                    tablaClientes.agregarCliente();
                    break;
                case 2:
                    tablaClientes.mostrarClientes();
                    break;
                case 3:
                    //mostrar clientes
                    System.out.println("Desordenado:");
                    tablaClientes.mostrarClientes();
                    System.out.println("\n\nOrdenado:");
                    tablaClientes.ordenarPorNombre(true);
                    tablaClientes.mostrarClientes();
                    break;
                case 4:
                    //mostrar clientes
                    System.out.println("Desordenado:");
                    tablaClientes.mostrarClientes();
                    System.out.println("\n\nOrdenado:");
                    tablaClientes.ordenarPorNombre(false);
                    tablaClientes.mostrarClientes();
                    break;
                case 5:
                    tablaPelicula.agragarPelicula();
                    break;
                case 6:
                    tablaPelicula.editarPelicula();
                    break;
                case 7:
                    tablaPelicula.eliminarPelicula();
                    break;
                case 8:
                    tablaPelicula.mostrarPeliculas();
                    break;
                case 9:
                    System.out.println("Desordenado:");
                    tablaPelicula.mostrarPeliculas();
                    System.out.println("\nOrdenado:");
                    tablaPelicula.ordenarPorId(true);
                    tablaPelicula.mostrarPeliculas();
                    break;
                case 10:

                    System.out.println("Desordenado:");
                    tablaPelicula.mostrarPeliculas();
                    System.out.println("\nOrdenado:");
                    tablaPelicula.ordenarPorId(false);
                    tablaPelicula.mostrarPeliculas();
                    break;
                case -1:
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }

    }

}
