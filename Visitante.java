public class Visitante {
    private String nombre;
    private int edad;
    private String cedula;

    public Visitante(){
    setedad(0);
    setNombre("");
    setCedula("");
    }

    public Visitante(String nombre, int edad, String cedula){
        setNombre(nombre);
        setedad(edad);
        setCedula(cedula);
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getCedula(){
        return cedula;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setedad(int edad){
        this.edad = edad;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }
}
