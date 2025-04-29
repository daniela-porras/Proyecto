/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramadoi.containers;

import proyectoprogramadoi.models.Ganadero;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
/**
 *
 * @author usuario1
 */
public class GanaderoContainer {
    
    private static final Map<String,Ganadero> container=new HashMap<>();
    
    public static boolean exist(String id){
        return container.containsKey(id);
    }
    
     public static boolean store(Ganadero _ganadero){
        if(!container.containsKey(_ganadero.getCedula())){
            container.put(_ganadero.getCedula(),_ganadero);
            return true;
        }
        return false;
    }
     
    public static List getAll(){   
        List data=new ArrayList<Ganadero>();
        container.values().iterator().forEachRemaining(new Consumer<Ganadero>(){
            @Override
            public void accept(Ganadero t) {
                data.add(t);
            }
            
        });
        return data;
    }
    
    public static Ganadero getById(String id){
        return container.get(id);
    }
    
}



