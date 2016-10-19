package prac2;
import java.util.*;
import java.util.stream.Collectors;
public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche){
        coches.add(coche);
    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public Coche obtenerVehiculo(String matricula){
        Coche encontrado = null;
        for (Coche obtener : coches){
            if (obtener.getMatricula().equals(matricula)){
                encontrado = obtener;
            }
        }
        return encontrado;
    }

    public void eliminarVehiculo(String matricula){
        Coche borrar = null;
        for (Coche obtener: coches) {
            if (obtener.getMatricula().equals(matricula)) {
                borrar = obtener;
            }
        }
        if (borrar != null) {
            coches.remove(borrar);
        }
    }

    public Coche obtenerVehiculoPrecioMax(){
        return null;
    }

    public List<Coche> obtenerVehiculosMarca(String marca){
        List <Coche> encontrados = new ArrayList<Coche>();
        for (Coche obtener : coches) {
            if (obtener.getMarca().equals(marca))
                encontrados.add(obtener);
        }
        return encontrados;

    }
    public List<Coche> obtenerTodos(){
return null;
    }
}
