/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_hasmap;

import java.util.HashMap;

/**
 *
 * @author lvazquezdorna
 */
public class ClassHash implements InterfaceHash {

    public  HashMap<Integer, String> miHashOriginal = new HashMap<Integer, String>();

    @Override
    public void putValue(Integer key, String value) {
        miHashOriginal.put(key, value);
    }

    @Override
    public String getValue(Integer key) {
        return miHashOriginal.get(key);
    }
}
