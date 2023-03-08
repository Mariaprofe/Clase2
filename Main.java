
public class Main {

    public static void main(String[] args) {

        System.out.println("Ejercicio 1.a - Clase 3");

        String unaFrase = "Hola, como estas?";
        char unaLetra = 'a';

        int cantApariciones = 0;

        for(int i = 0; i < unaFrase.length(); i++ ){
            char caracterActual = unaFrase.charAt(i);
            if(caracterActual == unaLetra) {
                cantApariciones ++;
            }
        }

        System.out.println("La cantidad de veces que aparece la letra " + unaLetra + " es " + cantApariciones);

        System.out.println("Ejercicio 1.c - Clase 3");

        int numeros[] = {5, 7, 8, 9};
        int algunNumero = 6;

        int sumaDeMayoresAAlgunNumero = 0;

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] > algunNumero) {
                sumaDeMayoresAAlgunNumero = sumaDeMayoresAAlgunNumero + numeros[i];
            }
        }

        System.out.println("El resultado final de los números mayores a " + algunNumero + " fue: " + sumaDeMayoresAAlgunNumero);


        System.out.println("Ejercicio 1.b - Clase 3");

        int otrosNumeros[] = {1, 15, 2, 16};
        boolean esAscendente = true;

        int numerosOrdenados[] = otrosNumeros;

        for(int i = 0; i < numerosOrdenados.length; i++) {
            System.out.println(numerosOrdenados[i]);
        }

        for(int i = 0; i < otrosNumeros.length; i++) {

            for(int j = 0; j < otrosNumeros.length; j++) {
                if(esAscendente) {
                    if(otrosNumeros[i] < numerosOrdenados[j]) {
                        int valorTemporal = numerosOrdenados[j];
                        numerosOrdenados[j] = otrosNumeros[i];
                        numerosOrdenados[i] = valorTemporal;
                    }
                }
                else {
                    if(otrosNumeros[i] > numerosOrdenados[j]) {
                        int valorTemporal = numerosOrdenados[j];
                        numerosOrdenados[j] = otrosNumeros[i];
                        numerosOrdenados[i] = valorTemporal;
                    }
                }
            }
        }

        for(int i = 0; i < numerosOrdenados.length; i++) {
            System.out.println(numerosOrdenados[i]);
        }

        // ------------------------------------------------------------------------------------
        int unParDeNumeros[] = {1, 37, 16};
        int suma = sumatoria(unParDeNumeros);
        int promedio = suma / unParDeNumeros.length;

        System.out.println(promedio);
        String unNombre = "Alejo";
        String unApellido = "DAr";
        System.out.println(saludoConNombreCompleto(unNombre, unApellido));
    }

    private static int sumatoria(int[] numeros) {
        int suma = 0 ;

        for(int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        return suma;
    }

    private static String saludoConNombreCompleto(String nombre, String apellido) {
        return "Hola " + nombre + " " + apellido + ", bienvenido!";
    }

    private static float division(int unNumero, int otroNumero) {
        return unNumero / otroNumero;
    }

}