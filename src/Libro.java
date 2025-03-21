public class Libro {
    //Kata 3
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
//verificar, No se puede modificar si el año es menor a 1900 o mayor al año actual.
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 1900 && anioPublicacion < 2025) {
            this.anioPublicacion = anioPublicacion;
            System.out.println("Se guardo el año de publicación");
        }else {
            System.out.println("No fue posible guardar el año de publicación, por defecto es 1900");
            this.anioPublicacion = 1900;
        }
    }


    //para mostrar el objeto libro.
    @Override
    public String toString() {
        return "LIBRO {" +
                " Título='" + titulo + '\'' +
                ", autor= " + autor +
                ", año de publicación= " + anioPublicacion +
                '}';
    }
}
