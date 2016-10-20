package prac2;

public class Persona {

    private String dni;
    private String numSeg;
    private String nombre;
    private String apellidos;
    private int edad;
    private double sueldo;

    public Persona(String dni, String numSeg, String nombre, String apellidos, int edad, double sueldo) {
        this.dni = dni;
        this.numSeg = numSeg;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNumSeg(String numSeg) {
        this.numSeg = numSeg;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNumSeg() {
        return numSeg;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String Datos() {
        return "Persona= (" + "DNI= " + dni + ", Número SS= " + numSeg + ", Nombre= " + nombre + ", Apellidos= " + apellidos + ", Edad= " + edad + ", Sueldo=" + sueldo + ")";
    }
}
