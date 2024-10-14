
class MetodoBusqueda {
    // Método de búsqueda secuencial
    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i; 
            }
        }
        return -1; 
    }

    // Método de búsqueda binaria
    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == value) {
                return medio; 
            }
            if (arr[medio] < value) {
                inicio = medio + 1; //  la mitad derecha
            } else {
                fin = medio - 1; //  la mitad izquierda
            }
        }
        return -1; // Valor no encontrado
    }

//codigo practica en clases con el ingeniero
    /*public int busquedaSecuencial(int[] arreglo, int valorBuscado){
        int position = -1;
        for (int i = 0 ; i < arreglo.length ; i++ ){
            if (arreglo[i]==valorBuscado){
                return i;
            }
        }
        return -1;
    } 
    public int busquedaBinaria(int [] arr , int value){
        int inicio=0;
        int fin = arr.length-1;
        while (inicio <= fin){
            int medio = inicio  +(fin-inicio)/2;

            if (arr[medio]==value ){
                return medio;                    // 10,20,30,40,50,60,70,80,90,100
            }
                if(arr[medio]<value){
                    inicio = medio +1;//buscar en la mitad de la derecha
                    
            }else{
                fin = medio - 1 ;//buscar en la mitad de la izquierda
            }
        }
        return -1;
    }
    */
//fin codigo practica en clases con el ingeniero 


    public void printArreglo(int[] arreglo){
        for (int elem : arreglo)
    {
        System.out.println(elem + "");
    }
    }   
}
