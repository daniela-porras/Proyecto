/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramadoi.models.containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import proyectoprogramadoi.models.Raza;

/**
 *
 * @author diego
 */
public class RazaContainer {
    private static Map<String,Raza> container = new HashMap<>();
    

    public static boolean exist(String codigoRaza)
    {
        return container.containsKey(codigoRaza);
    }
    
    public static boolean store(Raza _raza)
    {
        if(!container.containsKey(_raza.getCodigo()))
        {
            container.put(_raza.getCodigo(), _raza);
            return true;
        }
        return false;
    }
    
    public static List getAll(){
        List data=new ArrayList<Raza>();
        container.values().iterator().forEachRemaining(new Consumer<Raza>(){
            @Override
            public void accept(Raza t) {
                data.add(t);
            }
            
        });
        return data;
    }
    
}
