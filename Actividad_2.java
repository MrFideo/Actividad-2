public class Actividad_2 {
    public static void main(String[] args) {
        
        // Ejemplo de if-else
        int numero = 10;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es cero o negativo.");
        }
        
        // Ejemplo de switch
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Hoy es Lunes.");
                break;
            case 2:
                System.out.println("Hoy es Martes.");
                break;
            case 3:
                System.out.println("Hoy es Miércoles.");
                break;
            default:
                System.out.println("Día no reconocido.");
                break;
        }
        
        // Ejemplo de for
        System.out.println("Bucle for del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        
        // Ejemplo de while
        System.out.println("Bucle while, imprimiendo números del 1 al 3:");
        int contador = 1;
        while (contador <= 3) {
            System.out.println("contador = " + contador);
            contador++;
        }
        
        // Ejemplo de do-while
        System.out.println("Bucle do-while, imprimiendo números del 1 al 3:");
        int contador2 = 1;
        do {
            System.out.println("contador2 = " + contador2);
            contador2++;
        } while (contador2 <= 3);
        
        // Ejemplo adicional con break y continue
        System.out.println("Uso de break y continue en un bucle for:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                System.out.println("Se encontró el 3, se utiliza 'continue' para saltar.");
                continue; 
            }
            if (j == 5) {
                System.out.println("Se encontró el 5, se utiliza 'break' para salir del bucle.");
                break;
            }
            System.out.println("j = " + j);
        }
    }
}
