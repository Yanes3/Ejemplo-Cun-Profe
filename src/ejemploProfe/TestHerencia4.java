package ejemploProfe;
import java.util.Calendar;
import java.util.ArrayList;

public class TestHerencia4 {

    public static void main(String[] Args) {

        Profesor profesor1 = new Profesor("Juan", "Hernández García", 33);

        profesor1.setIdProfesor("Prof 22-387-11");

        Calendar fecha1 = Calendar.getInstance();

        fecha1.set(2024, 10, 22);

        ProfesorInterino interino1 = new ProfesorInterino("José Luis", "Morales Pérez", 54, fecha1);
        
        System.out.print("Datos Profesor= Nombre de profesor: " + profesor1.getNombre() + " "
                + profesor1.getApellidos() + " con Id de profesor: " + profesor1.getIdProfesor());

        ListinProfesores.listar();
    }
}

class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        nombre = "";
        apellidos = "";
        edad = 0;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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
}

class Profesor extends Persona {

    private String IdProfesor;

    public Profesor(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        IdProfesor = "Unknown";
    }

    public void setIdProfesor(String IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public String getIdProfesor() {
        return IdProfesor;
    }
}

class ListinProfesores {

    static ArrayList<Profesor> listinProfesores = new ArrayList<Profesor>();

    public static void addProfesor(Profesor profesor) {
        listinProfesores.add(profesor);
    }

    public static void listar() {
        //logica
    }
}

class ProfesorInterino extends Profesor {

    private Calendar FechaComienzoInterinidad;

    public ProfesorInterino(String nombre, String apellido, int edad, Calendar fecha1) {
        super(nombre, apellido, edad);
        this.FechaComienzoInterinidad = fecha1;
    }

    public Calendar getFechaComienzoInterinidad() {
        return FechaComienzoInterinidad;
    }

    public void mostrarDatos() {
        System.out.println("Datos ProfesorInterino. Comienzo interinidad: "
                + FechaComienzoInterinidad.getTime().toString());
    }
}
