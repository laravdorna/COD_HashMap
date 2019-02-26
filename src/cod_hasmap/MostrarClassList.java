/*
 *Muestra por ventana los elementos de la lista
 */
package cod_hasmap;

import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author lvazquezdorna
 */
public class MostrarClassList {

    public static void mostrar(ClassList lista) {
        //guardar los valores del array en una string y mostrarlos por ventana
        
        //cambiar el iterator por un foreach
        String mensaje = "Lista: \n";
        Iterator it = lista.miLista.iterator();
        while (it.hasNext()) {
           mensaje = mensaje + " " + it.next() + "\n";
        }
        System.out.println(mensaje);
       // JOptionPane.showInputDialog(mensaje);

    }

}
