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
public class classHash implements InterfaceHash {

    public  HashMap<Integer, String> map = new HashMap<Integer, String>();

    @Override
    public void putValue(Integer key, String value) {
        map.put(key, value);
    }

    @Override
    public String getValue(Integer key) {
        return map.get(key);
    }
}
