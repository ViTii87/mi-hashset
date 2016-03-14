
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // Atributo para guardar una lista de enteros.
    private int arrayEnteros[];

    /**
     * Constructor for objects of class ArrayListInt, inicializamos el array con tamaño minimo.
     */
    public ArrayListInt()
    {
        arrayEnteros = new int[0];
    }
    
    /**
     * Metodo que añade un elemento a la colección al final de la misma.
     * Obtenemos el tamaño del array principal, creamos un array auxiliar de tamaño 1 mas el tamaño del principal.
     * Copiamos todos los elementos del principal al auxiliar.
     * Finalmente le añadimos el ultimo elemento.
     * Asignamos a nuestro array de enteros el auxiliar con el ultimo elemento añadido.
     */
    public void add(int elemento)
    {
        int tamanho = arrayEnteros.length;
        int[] aux = new int[tamanho+1];
        for(int i = 0;i < tamanho;i++)
        {
            aux[i] = arrayEnteros[i];
        }
        aux[tamanho] = elemento;
        arrayEnteros = aux;
    }
    
    /**
     * Metodo que añade un elemento a la colección en la posición especificada por el parámetro index. 
     * Si el valor de index no es válido, entonces no hace nada. Los elementos a continuación del añadido se desplazan una posición.
     */
    public void add(int index, int elemento)
    {
        int tamanho = arrayEnteros.length;
        if(index >= 0 && index <= tamanho)
        {
            int[] aux = new int[tamanho+1];
            int i = 0;
            int indexAux = 0;
            while(i < tamanho+1)
            {
                if(i == index)
                {
                    aux[i] = elemento;
                }
                else
                {
                    aux[i] = arrayEnteros[indexAux];
                    indexAux++;
                }
                i++;
            }
            arrayEnteros = aux;
        }
    }
    
    /**
     * Metodo que vacia nuestro array de enteros.
     */
    public void clear()
    {
        arrayEnteros = new int[0];
    }
    
    /**
     * Metodo que devuelve true si la colección contiene ese elemento, false en cualquier otro caso.
     */
    public boolean contains(int elemento)
    {
        boolean contiene = false;
        int i = 0;
        int tamanho = arrayEnteros.length;
        while(i < tamanho && !contiene)
        {
            if(arrayEnteros[i] == elemento)
            {
                contiene = true;
            }
            i++;
        }
        return contiene;
    }
    
    /**
     * Metodo que devuelve el elemento existente en la posición indicada. Si el valor de index no es válido, entonces devuelve -1.
     */
    public int get(int index)
    {
        int elemento = -1;
        int tamanho = arrayEnteros.length;
        if(index >= 0 && index < tamanho)
        {
            elemento = arrayEnteros[index];
        }
        return elemento;
    }
    
    /**
     * Metodo que reemplaza el elemento en la posición index con el valor de element. Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element)
    {
        int tamanho = arrayEnteros.length;
        if(index >= 0 && index < tamanho)
        {
            arrayEnteros[index] = element;
        }
    }
    
    /**
     * Metodo que devuelve el indice en el que aparece la primera ocurrencia del elemento especificado
     * o -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento)
    {
        int index = -1;
        int i = 0;
        int tamanho = arrayEnteros.length;
        boolean encontrado = false;
        while(i < tamanho && !encontrado)
        {
            if(arrayEnteros[i] == elemento)
            {
                encontrado = true;
                index = i;
            }
            i++;
        }
        return index;
    }
    
    /**
     * Metodo que devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean vacio = true;
        if(arrayEnteros.length != 0)
        {
            vacio = false;
        }
        return vacio;
    }
    
    /**
     * Metodo que elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento. 
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index)
    {
        int elemento = -1;
        int tamanho = arrayEnteros.length;
        if(index >= 0 && index < tamanho)
        {
            int[] aux = new int[tamanho-1];
            int i = 0;
            int auxIndex = 0;
            while(i < tamanho)
            {
                if(i == index)
                {
                    elemento = arrayEnteros[i];
                }
                else
                {
                    aux[auxIndex] = arrayEnteros[i];
                    auxIndex++;
                }
                i++;
            }
            arrayEnteros = aux;
        }
        return elemento;
    }
    
    /**
     * Metodo que devuelve el número de elementos de la colección.
     */
    public int size()
    {
        return arrayEnteros.length;
    }
}
