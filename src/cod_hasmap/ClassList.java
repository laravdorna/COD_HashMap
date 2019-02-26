/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_hasmap;

import java.util.ArrayList;


/**
 *
 * @author lvazquezdorna
 */
public class ClassList implements InterfaceList {
    
    ArrayList<String> miLista = new ArrayList<String>();
    
    @Override
    public void putElement(String element) {
        miLista.add(element);
    }
    
    @Override
    public void getElement(int index) {
       miLista.get(index);
    }

    
}
