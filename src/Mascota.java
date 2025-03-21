public class Mascota {
    //kata 2
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre +
                "\nEspecie: " + this.especie +
                "\nEdad: " + this.edad);
    }
   public void cumplirAnios(int aumentarEdad){
        edad += aumentarEdad;
       System.out.println("Edad: " + edad);
   }
}
