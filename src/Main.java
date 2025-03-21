import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //KATA 1 "Registro de estudiantes"--------------------------------------------------------
        /*Estudiante estudiante=new Estudiante("Nicolas","Marquez","curso 4",9);
        mostraInfo(estudiante);
        Scanner sc=new Scanner(System.in);
        int opcion;
        double num;
        do {
            System.out.println("Ingrese 1 para subir la calificacion");
            System.out.println("Ingrese 2 para bajar la calificacion");
            System.out.println("Ingrese 3 para Salir");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese un numero");
                    num = sc.nextDouble();
                    subirCalificacion(num, estudiante);
                    break;
                case 2:
                    System.out.println("Ingrese un numero");
                    num = sc.nextDouble();
                    bajarCalificacion(num, estudiante);
                    break;
                case 3:
                    System.out.println("Usted salio.");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 3);

         */
        //KATA 2 "Registro de mascotas" ----------------------------------------------------------
        /*
        System.out.println("Registro de Mascotas: ");

        Mascota mascota=new Mascota("Gino", "gato", 3);
        mascota.mostrarInfo();
        System.out.println("Datos actualizados: ");
        mascota.cumplirAnios(1);
        */
        //KATA 3 "Primeros pasos en encapsulamiento"--------------------------------------------------
        /*
        Libro libro = new Libro("La bella y la bestia ", "Jeanne-Marie Leprince de Beaumont.",3000);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el año de publicacion ");
        int anioingresado = teclado.nextInt();
        libro.setAnioPublicacion(anioingresado);
        System.out.println("Año de publicación en este momento: "+libro.getAnioPublicacion());
        System.out.println(libro);
        */

        //KATA 4 "Estado e identidad de los objetos"-------------------------------------------------
        /*
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina("id_gallina_1");
        gallina1.setHuevosPuestos(3);
        gallina1.ponerHuevo();
        gallina1.envejecer();
        System.out.println("Primer gallina" + gallina1);

        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina("id_gallina_2");
        gallina2.ponerHuevo();
        gallina2.envejecer();
        System.out.println("Segunda gallina" + gallina2);
        */
        //KATA 5 "Comportamiento de los objetos"
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Nave Nodrisa");

        nave.setConbustible(50);
        System.out.println("Estado actual: "+nave);
         //tiene que fallar
        nave.avanzar(60);
        nave.recargarCombustible(40);
        nave.avanzar(60);
        System.out.println("Estado actual: "+nave);


    }
    public static void mostraInfo(Estudiante estudiante){
        System.out.println("Nombre: "+ estudiante.getNombre()+
                " Apellido: " + estudiante.getApellido()+
                " Curso: "+ estudiante.getCurso()+
                " calificación: "+estudiante.getCalificacion());

    }
    public static void subirCalificacion(double calificacion, Estudiante estudiante){
        int notaActual= Math.toIntExact(Math.round(estudiante.getCalificacion()));
        if (notaActual == 10 ){
            System.out.println("La nota es 10, no se puede aumentar más");
        }else if ( calificacion >= notaActual && calificacion <= 10 ){
            estudiante.setCalificacion(calificacion);
            System.out.println("Se guardo la nota!");
        }else if (calificacion < notaActual){
            System.out.println("No se puede guardar la nota. Debe seleccionar la otra opción");
        }
        System.out.println("Nota actual: "+ estudiante.getCalificacion());
    }
    public static void bajarCalificacion(double calificacion,Estudiante estudiante){
        int notaActual= Math.toIntExact(Math.round(estudiante.getCalificacion()));

        if (notaActual == 1 ){
            System.out.println("La nota es 1, no se puede decrementar más");
        }else if ( calificacion <= notaActual  && calificacion != 0 ){
            estudiante.setCalificacion(calificacion);
            System.out.println("Se guardo la nota!");
        }else if (calificacion > notaActual){
            System.out.println("No se puede guardar la nota. Debe seleccionar la otra opción");
        }
        System.out.println("Nota actual: "+ estudiante.getCalificacion());
    }
}