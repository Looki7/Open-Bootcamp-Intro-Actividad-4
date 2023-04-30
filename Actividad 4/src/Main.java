
// Actividad 4

/* Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable
credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el
credito,tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que
solo tenga la clase Trabajador.
 */


public class Main {
    public static void main(String[] args){

        Cliente cliente = new Cliente(30, "Juan", "123456789", 5000);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Teléfono: " + cliente.telefono);
        System.out.println("Crédito: " + cliente.credito);

        Trabajador trabajador = new Trabajador(25, "María", "987654321", 10000);
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Teléfono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);


    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    int credito;

    public Cliente(int edad, String nombre, String telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
}
