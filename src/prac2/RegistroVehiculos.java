package prac2;

import java.util.*;
import java.util.stream.Collectors;

public class RegistroVehiculos {

    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        coches.add(coche);
    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public Coche obtenerVehiculo(String matricula) {
        Coche mat = null;
        for (Coche obtener : coches) {
            if (obtener.getMatricula().equals(matricula)) {
                mat = obtener;
            }
        }
        return mat;
    }

    public void eliminarVehiculo(String matricula) {
        Coche borrar = null;
        for (Coche obtener : coches) {
            if (obtener.getMatricula().equals(matricula)) {
                borrar = obtener;
            }
        }
        if (borrar != null) {
            coches.remove(borrar);
        }
    }

    public Coche obtenerVehiculoPrecioMax() {
        Coche max = null;
        double preciomax = 0;
        for (Coche obtener : coches) {
            if (obtener.getPrecio() > preciomax) {
                preciomax = obtener.getPrecio();
                max = obtener;
            }
        }
        return max;
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
        List<Coche> marcados = new ArrayList<Coche>();
        for (Coche obtener : coches) {
            if (obtener.getMarca().equals(marca)) {
                marcados.add(obtener);
            }
        }
        return marcados;

    }

    public List<Coche> obtenerTodos() {
        List<Coche> todos = new ArrayList<Coche>();
        for (Coche obtener : coches) {
            todos.add(obtener);
        }
        return todos;
    }
}
