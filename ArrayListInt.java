/**
 * 
 */
public class ArrayListInt
{
    //En este atributo se declara el array que va a ser usado por el usuario
    private int[] array;
    //En este atributo se guarda el indice del array donde se guardo un dato por ultima vez
    private int indice;

    /**
     * Constructor donde se inicializan los atributos
     */
    public ArrayListInt()
    {
        indice = 0;
        array = new int[indice];
    }
    
    /**
     * Añade un elemento a la colección al final de la misma.
     */
    public void add(int elemento)
    {
        indice++;
        array = new int[indice];
        array[indice] = elemento;
    }
    
    /**
     * Añade un elemento a la colección en la posición especificada por el parámetro `index`. Si el valor de `index` no es válido, entonces no hace nada.
     */
    public void add(int index, int elemento)
    {
        if(index > indice)
        {
            indice = index;
        }
        
        if(contains(index) == true)
        {
            indice++;
            for(int i = index; i < indice; i++)
            {
                array[i+1] = array[i];
            }
        }
        array[index] = elemento;
    }
    
    /**
     * Vacía la colección.
     */
    public void clear()
    {
        /*for(int i = 0; i < indice; i++)
        {
        array[i] = 0;
        }*/
        indice = 0;
        array[0] = 0;
    }
    
    /**
     * Devuelve `true` si la colección contiene ese elemento.
     */
    public boolean contains(int elemento)
    {
        boolean tueOrFalse = true;
        if(array[elemento] == 0)
        {
            tueOrFalse = false;
        }
        return tueOrFalse;
    }
    
    /**
     * Devuelve el elemento existente en la posición indicada. Si el valor de `index` no es válido, entonces devuelve `-1`
     */
    public int get(int index)
    {
        return array[index];
    }
    
    /**
     * Devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento)
    {
        int contador = 0;
        boolean buscador = true;
        int indiceBuscado = -1;
        while(buscador == true)
        {
            if(array[contador] == elemento)
            {
                indiceBuscado = contador;
                buscador = false;
            }
            contador++;
        }
        return indiceBuscado;
    }
    
    /**
     * Devuelve `true` si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean tueOrFalse = true;
        for(int i = 0; i < indice; i++)
        {
            if(array[i] != 0)
            {
                tueOrFalse = false;
            }
        }
        return tueOrFalse;
    }
    
    /**
     * Elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento. Si el valor de `index` no es válido, no hace nada.
     */
    public int remove(int index)
    {
        int resultado = array[index];
        array[index] = 0;
        if(index == indice)
        {
            indice--;
        }
        return resultado;
    }
    
    /**
     * Devuelve el número de elementos de la colección.
     */
    public int size()
    {
        return indice;
    }
}
