
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetodoBusqueda metodoBusqueda = new MetodoBusqueda();
        int[] arreglo = new int[100001];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i; 
        }
        System.out.println("Tamaño del arreglo: " + arreglo.length);
        System.out.print("Ingrese el valor que desea buscar (0 a 100000): ");
        int valorBuscado = scanner.nextInt();
        long inicioSecuencial = System.nanoTime();
        int posicionSecuencial = metodoBusqueda.busquedaSecuencial(arreglo, valorBuscado);
        long finSecuencial = System.nanoTime();
        long duracionSecuencial = finSecuencial - inicioSecuencial;
        if (posicionSecuencial != -1) {
            System.out.println("Búsqueda Secuencial: Valor encontrado en la posición: " + posicionSecuencial);
        } else {
            System.out.println("Búsqueda Secuencial: Valor no encontrado: " + valorBuscado);
        }
        System.out.println("Tiempo de búsqueda secuencial: " + duracionSecuencial + " nanosegundos");

        long inicioBinaria = System.nanoTime();
        int posicionBinaria = metodoBusqueda.busquedaBinaria(arreglo, valorBuscado);
        long finBinaria = System.nanoTime();
        long duracionBinaria = finBinaria - inicioBinaria;

        if (posicionBinaria != -1) {
            System.out.println("Búsqueda Binaria: Valor encontrado en la posición: " + posicionBinaria);
        } else {
            System.out.println("Búsqueda Binaria: Valor no encontrado: " + valorBuscado);
        }
        System.out.println("Tiempo de búsqueda binaria: " + duracionBinaria + " nanosegundos");
        scanner.close();
    }

    /*     int[] arreglo = {10,20,30,40,50,60,70,80,90,100};
        metodoBusqueda.printArreglo(arreglo);
        int valorBuscado=50;
        
        int position = metodoBusqueda.busquedaSecuencial(arreglo, 50);
        if (position!= -1){
            System.out.println("el valor se encuentra en la posicion: "+ position);
        }else{
            System.out.println("valor no encontrado: "+valorBuscado);
    }
    
    */
    }
