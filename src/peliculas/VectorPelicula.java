/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.peliculas;

import src.tienda.IngresoDatos;

/**
 *
 * @author Luis Monterroso
 */
public class VectorPelicula {

    private Pelicula[] pelicula = new Pelicula[50];
    private int siguienteCodigo;

    public VectorPelicula() {
        siguienteCodigo = 1;
    }

    //agregar clientes
    public void agragarPelicula(String nombre, int age, String categoria, boolean disponible) {
        if (siguienteCodigo > 50) {
            System.out.println("Límite de peliculas alcanzado");
        } else {
            pelicula[(siguienteCodigo - 1)] = new Pelicula(siguienteCodigo, nombre, age, categoria, disponible);
            siguienteCodigo++;
        }

    }

    public void agragarPelicula() {
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        int age = IngresoDatos.getEntero("Ingrese el año de salida", false);
        String categoria = IngresoDatos.getTexto("Ingrese la categoria de la pelicula");
        agragarPelicula(nombre, age, categoria, true);
    }

    // fin agregar clientes
    public void mostrarPeliculas() {
        System.out.println("\nPeliculas de memorabilia");
        for (int i = 0; i < (siguienteCodigo - 1); i++) {
            System.out.println("Id: " + pelicula[i].getId() + " Nombre: " + pelicula[i].getNombre() + " Año de salida: " + pelicula[i].getAge() + " Categoria: " + pelicula[i].getCategoria() + " Disponible: " + pelicula[i].getDisponible());
            //System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());
        }

        System.out.println("\n");
    }

    //Ordenamiento
    public void ordenarPorId(boolean ascendente) {
        boolean cambio;

        for (int i = 1; i < (siguienteCodigo - 1); i++) {
            for (int j = 0; j < (siguienteCodigo - 1 - i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente) {
                    cambio = (pelicula[j].getId() > pelicula[j + 1].getId());
                } else {
                    cambio = (pelicula[j].getId() < pelicula[j + 1].getId());
                }
                if (cambio) {
                    //clientes i va antes que clientes j <0 descendente
                    Pelicula aux = pelicula[j];
                    pelicula[j] = pelicula[j + 1];
                    pelicula[j + 1] = aux;
                }
            }
        }

    }

    public void editarPelicula() {
        mostrarPeliculas();
        int id = IngresoDatos.getEntero("Ingrese el id de la pelicula a eliminar", false);
        System.out.println("Que desea cambiar\n1) Nombre\n2) Año de salida\n3) Genero");
        int opcion = IngresoDatos.getEntero("Elija la opcion", false);
        String nuevoParametro;

        switch (opcion) {
            case 1:
                nuevoParametro = IngresoDatos.getTexto("Ingrese el nuevo nombre");
                editarPelicula(id, opcion, nuevoParametro);
                break;
            case 2:
                nuevoParametro = IngresoDatos.getTexto("Ingrese el nuevo año");
                editarPelicula(id, opcion, nuevoParametro);
                break;
            case 3:
                nuevoParametro = IngresoDatos.getTexto("Ingrese el nuevo genero");
                editarPelicula(id, opcion, nuevoParametro);
                break;
        }

    }

    public void editarPelicula(int id, int opcion, String nuevoParametro) {
        switch (opcion) {
            case 1:
                for (int x = 0; x < (siguienteCodigo - 1); x++) {
                    if (id == pelicula[x].getId()) {
                        pelicula[x].setNombre(nuevoParametro);
                        System.out.println("Pelcula editada");
                        return;
                    }
                }
                System.out.println("Id no existe");
                break;
            case 2:
                for (int x = 0; x < (siguienteCodigo - 1); x++) {
                    if (id == pelicula[x].getId()) {
                        pelicula[x].setAge(Integer.valueOf(nuevoParametro));
                        System.out.println("Pelcula editada");
                        return;
                    }
                }
                System.out.println("Id no existe");
                break;
            case 3:
                for (int x = 0; x < (siguienteCodigo - 1); x++) {
                    if (id == pelicula[x].getId()) {
                        pelicula[x].setCategoria(nuevoParametro);
                        System.out.println("Pelcula editada");
                        return;
                    }
                }
                System.out.println("Id no existe");
                break;
        }
    }

    public void eliminarPelicula() {
        mostrarPeliculas();
        int id = IngresoDatos.getEntero("Ingrese el id de la pelicula a eliminar", false);
        eliminarPelicula(id);
    }

    public void eliminarPelicula(int id) {
        for (int x = 0; x < (siguienteCodigo - 1); x++) {
            if (id == pelicula[x].getId()) {
                for (int y = x; y < (siguienteCodigo - 1); y++) {
                    if (y < (siguienteCodigo - 2)) {
                        pelicula[y] = pelicula[y + 1];
                        pelicula[y].setId(pelicula[y].getId() - 1);
                    }
                }
                siguienteCodigo--;
                System.out.println("Pelicula eliminada");
                return;
            }
        }
        System.out.println("El id no existe");
    }
}
