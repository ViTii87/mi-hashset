
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // Usamos nuestro ArrayList de interos previamente creado
    private ArrayListInt arrayInt;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        arrayInt = new ArrayListInt();
    }

    /**
     * Metodo que añade el elemento al conjunto si no estaba. Devuelve verdadero en 
     * caso de que el elemento no estuviera presente en el conjunto y falso en caso contrario.
     */
    public boolean add(int valor) {
        boolean devuelve = true;
        if(arrayInt.contains(valor)){
            devuelve = false;
        }
        else{
            arrayInt.add(valor);
        }
        return devuelve;
    }

    /**
     * Metodo que vacía el conjunto.
     */
    public void clear(){
        arrayInt.clear();
    }

    /**
     * Metodo que devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento){
        return arrayInt.contains(elemento);
    }

    /**
     * Metodo devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty(){
        return arrayInt.isEmpty();
    }

    /**
     * Metodo que elimina del conjunto el elemento dado. Si no existiera devuelve falso;
     * si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento){
        boolean devuelve = false;
        if(contains(elemento)){
            arrayInt.remove(arrayInt.indexOf(elemento));
            devuelve = true;
        }
        return devuelve;
    }

    /**
     * Metodo que devuelve el número de elementos del conjunto.
     */
    public int size(){
        return arrayInt.size();
    }

    /**
     * Metodo que devuelve una cadena conteniendo todos los elementos del conjunto 
     * separados por comas y entre corchetes.
     */
    public String toString(){
        String devuelve = "[";
        for(int i = 0; i < size(); i++ ){
            if(i!=size()-1){
                devuelve += arrayInt.get(i) + ", ";
            }
            else{
                devuelve += arrayInt.get(i);
            }
        }
        devuelve += "]";
        return devuelve;
    }

    /**
     * Metodo que devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto){
        boolean devuelve = true;
        if(otroConjunto.size() == arrayInt.size()){
            int i = 0;
            while(i < arrayInt.size() && devuelve){
                if(!(otroConjunto.contains(arrayInt.get(i)))){
                    devuelve = false;
                }
                i++;
            }
        }
        else{
            devuelve = false;
        }
        return devuelve;
    }
}
