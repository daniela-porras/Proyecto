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
public class GanaderoController implements GanaderoInterface,GanaderoListaInterface{

    @Override
    public String store(String[] data) {
        if(GanaderoContainer.exist(data[0])){
            return "error:Ya existe el ganadero registrado!";
        }
        Ganadero obj=new Ganadero(data[0],data[1],data[2],data[3],data[4]);
        boolean done=GanaderoContainer.store(obj);
        if(done)  return "done:Ganadero guardado exitosamente!";
        return "error:Error al guardar los datos";
    }

    @Override
    public String[][] getAll() {
        List ganaderos=GanaderoContainer.getAll();        
        String[][] data=new String[ganaderos.size()][5];
        for(int i=0;i<ganaderos.size();i++){
            Ganadero g=(Ganadero) ganaderos.get(i);
            data[i][0]=g.getCedula();
            data[i][1]=g.getNombre();
            data[i][2]=g.getDireccion();
            data[i][3]=g.getEmail();
            data[i][4]=g.getTelefono();
        }
        return data;
    }
    
}
