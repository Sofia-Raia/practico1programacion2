public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public String getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }


    public void ponerHuevo() {
        huevosPuestos = huevosPuestos + 1;
    }

    public void envejecer() {
        edad = edad + 1;
    }

    @Override
    public String toString() {
        return "Gallina {" +
                " ID gallina ='" + idGallina + '\'' +
                ", edad= " + edad +
                ", cantidad de huevos puestos= " + huevosPuestos +
                '}';
    }

}
