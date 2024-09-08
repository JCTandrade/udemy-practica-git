public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo desde java");

        /**
         * Se puede imprimir el mismo mensaje bajo una variable
         */

        String saludar = "Hola mundo desde java";
        System.out.println(saludar);

        /**
         * Tambien podemos poner el mismo mensaje en mayuscula todas las letras
         */

        System.out.println("saludar con toUpperCase para poner en mayusculas las letras = " + saludar.toUpperCase());

        /**
         * -> tipo de datos primitivos como int, char, boolean etc
         * -> crear una variable de tipo entero
         */

        int numero = 11;
        System.out.println("numero = " + numero);


        boolean valor = true;
        int numero2 = 5;
        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";
        System.out.println(numero3);

        String nombre;

        nombre = "Andres";

        if (numero > 10) {
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);

        int edadPersona = 5;

        /**
         * esta forma de comentario es espesifica para generar documentacion, lo que facilita
         * la comprencion de codigo y el uso de tu codigo
         */

        /*primera forma de hacer comentarios*/

        //segunda forma de hacer comentario


    }
}
