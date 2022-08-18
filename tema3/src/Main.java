public class Main {
    public static void main(String[] args) {
        int numero1 = 10, numero2 = 20, numero3 = 30;
        int resultado = suma(numero1,numero2,numero3);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.nroPuertas = 2;
        miCoche.aumentarPuertas();

        System.out.println(miCoche.nroPuertas);
    }

    public static int suma (int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}