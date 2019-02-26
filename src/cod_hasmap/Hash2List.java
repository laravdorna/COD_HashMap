/*
 * Esta clase es el adaptador de hash a list
 */
package cod_hasmap;

import java.util.Iterator;

/**
 *
 * @author lvazquezdorna
 */
public class Hash2List extends ClassList{
    
    public Hash2List (ClassHash hashAconvertir){
//        recorrer el hashAconvertir y añadirlo al arrayList
           Iterator it= hashAconvertir.miHashOriginal.keySet().iterator();  
           while (it.hasNext()){
           miLista.add(hashAconvertir.miHashOriginal.get(it.next()));
           }

    
    }
    
}
