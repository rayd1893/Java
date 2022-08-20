public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setEdad(20);
        persona.setTelefono("9914148346");

        String mensaje = "La persona se llama " + persona.getNombre() + " ";
        mensaje += " tiene " + persona.getEdad() + " años de edad ";
        mensaje += "y su número de teléfono es: " + persona.getTelefono();

        System.out.println(mensaje);
    }
}