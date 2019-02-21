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
public class classList implements InterfaceList {
    
    private ArrayList<String> lista = new ArrayList<String>();
    
    @Override
    public void putElement(String element) {
        lista.add(element);
    }
    
    @Override
    public void getElement(int index) {
        lista.get(index);
    }
    
}
