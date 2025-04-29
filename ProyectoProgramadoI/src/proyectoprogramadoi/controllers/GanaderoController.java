/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramadoi.controllers;

import proyectoprogramadoi.models.Ganadero;

import java.util.List;
import proyectoprogramadoi.models.containers.GanaderoContainer;

/**
 *
 * @author usuario1
 */
public class GanaderoController implements GanaderoInterface{

    @Override
    public String store(String[] data) {
        if(GanaderoContainer.exist(data[0])){
            return "error:Ya existe el ganadero registrado!";
        }
        Ganadero obj=new Ganadero();
        boolean done=GanaderoContainer.store(obj);
        if(done)  return "done:Ganadero guardado exitosamente!";
        return "error:Error al guardar los datos";
    }

    @Override
    public String[][] getAll() {
        List ganaderos=GanaderoContainer.getAll();        
        String[][] data=new String[ganaderos.size()][2];
        for(int i=0;i<ganaderos.size();i++){
            Ganadero g=(Ganadero) ganaderos.get(i);
            data[i][0]=g.getCedula();
            data[i][1]=g.getNombre();
        }
        return data;
    }
    
}
