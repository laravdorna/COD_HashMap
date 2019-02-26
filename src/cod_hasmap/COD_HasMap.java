/*
 *Contenedor de datos HASHMAP 
 * <key, value> clave, valor
 * -la clave es única y tiene significado
   - se accede a través de la clave: recupero valores directamente
   - no hay orden y es dificil de recorrer
EJERCICIO:
Crear interfaceHash con putValue y getValue
implementala en una clase classHash y añade un hashMap <Integer, String>
Crea un interfaceList con los metodos putElement y getElement
implementala en un clase ClassList con un ArrayList<String>

 */
package cod_hasmap;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class COD_HasMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear
        //ClassList miLista = new ClassList();
        ClassHash miHash = new ClassHash();
        //añadir
//        miLista.putElement("UNO");
//        miLista.putElement("DOS");
//        miLista.putElement("TRES");
//        miLista.putElement("CUATRO");
        miHash.putValue(10, "uno");
        miHash.putValue(11, "dos");
        miHash.putValue(12, "tres");
//ADAPTADOR
Hash2List miHash2List = new Hash2List(miHash);
        //MOSTRAR
        //MostrarClassList.mostrar(miLista);
MostrarClassList.mostrar(miHash2List);
    }

}
