public class Main {
    public static void main(String[] args) {
        int numeroIf = -2;
        int numeroWhile = 1;
        String estacion = "verano";
        estacion = estacion.toUpperCase();

        if (numeroIf < 0) {
            System.out.println("La variable numeroIf es NEGATIVO");
        } else if (numeroIf > 0) {
            System.out.println("La variable numeroIf es POSITIVO");
        } else {
            System.out.println("La variable numeroIf es CERO");
        }

        while (numeroWhile < 3) {
            System.out.println("numeroWhile desde while: " + numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println("numeroWhile desde do - while: " + numeroWhile);
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor: " + numeroFor);
        }

        switch (estacion){
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("La estatación no existe");
        }

    }
}