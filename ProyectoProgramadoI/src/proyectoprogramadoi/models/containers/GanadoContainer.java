/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramadoi.models.containers;

import proyectoprogramadoi.models.Ganado;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 *
 * @author diego
 */
public class GanadoContainer {
    
    private static final Map<String,Ganado> container=new HashMap<>();
    
    public static boolean exist(String id){
        return container.containsKey(id);
    }
    
     public static boolean store(Ganado _ganado){
        if(!container.containsKey(_ganado.getCodigoRaza())){
            container.put(_ganado.getCodigoRaza(),_ganado);
            return true;
        }
        return false;
    }
    
     public static List getAll(){   
        List data=new ArrayList<Ganado>();
        container.values().iterator().forEachRemaining(new Consumer<Ganado>(){
            @Override
            public void accept(Ganado t) {
                data.add(t);
            }
            
        });
        return data;
    }
    
    public static Ganado getById(String id){
        return container.get(id);
    }
    
}
