public class NaveEspacial {
    private String nombre;
    private int conbustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConbustible() {
        return conbustible;
    }

    public void setConbustible(int conbustible) {
        this.conbustible = conbustible;
    }

    /*
despegar(): Reduce 10 unidades de combustible al despegar. No puede despegar si hay menos de 10 unidades.
avanzar(int distancia): Consume 1 unidad de combustible por cada unidad de distancia. No puede avanzar si no hay suficiente combustible.
recargarCombustible(int cantidad): Aumenta la cantidad de combustible en la nave. No puede superar el límite máximo de 100 unidades.
mostrarEstado(): Muestra el nombre de la nave y la cantidad de combustible actual.
     */
    public void despegar(){
        conbustible=conbustible-10;
        if (conbustible <10){
            System.out.println("La nave NO puede despegar");
        }
    }
    public void avanzar(int distancia){
        conbustible=conbustible-distancia;
        if (conbustible <10){
            System.out.println("La nave NO puede avanzar");
        }
    }
    public void recargarCombustible(int cantidad){
        int suma = conbustible+cantidad;
        if (suma <= 100){
            System.out.println("Se cargo combustible exitosamente");
        }else{
            System.out.println("La cantidad de conbustble no puede ser mayor a 100 unidades");
        }

    }
    @Override //mostrar estado
    public String toString() {
        return "NaveEspacial{" + " Nombre= " + nombre + " conbustible= " + conbustible + '}';
    }

}
