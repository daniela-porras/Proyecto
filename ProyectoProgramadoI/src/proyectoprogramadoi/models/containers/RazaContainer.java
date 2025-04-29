/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramadoi.models.containers;

import java.util.HashMap;
import java.util.Map;
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
}
