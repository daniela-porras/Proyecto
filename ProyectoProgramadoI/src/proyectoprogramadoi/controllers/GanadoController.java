/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramadoi.controllers;

import proyectoprogramadoi.models.Ganado;

import java.util.List;
import proyectoprogramadoi.models.containers.GanadoContainer;

/**
 *
 * @author diego
 */
public class GanadoController implements GanadoInterface,GanadoListaInterface{

    @Override
    public String store(String[] data) {
        if(GanadoContainer.exist(data[0])){
            return "error:Ya existe el ganadero registrado!";
        }
        Ganado obj=new Ganado(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]));
        boolean done=GanadoContainer.store(obj);
        if(done)  return "done:Ganadero guardado exitosamente!";
        return "error:Error al guardar los datos";
    }

    @Override
    public String[][] getAll() {
        
        List ganados=GanadoContainer.getAll();        
        String[][] data=new String[ganados.size()][3];
        for(int i=0;i<ganados.size();i++){
            Ganado g=(Ganado) ganados.get(i);
            data[i][0]=g.getCodigoRaza();
            data[i][1]=String.valueOf(g.getPeso());
            data[i][2]=String.valueOf(g.getPrecioRes());
        }
        return data;
        
    }
    
}
