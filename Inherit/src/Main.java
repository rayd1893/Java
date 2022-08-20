public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Carlos");
        cliente.setEdad(20);
        cliente.setTelefono("985214458");
        cliente.setCredito(1876.60);

        System.out.println("CLIENTE");
        System.out.println("=================");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());
    }
}