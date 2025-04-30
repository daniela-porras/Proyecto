/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramadoi.controllers;

import java.util.List;
import proyectoprogramadoi.models.Raza;
import proyectoprogramadoi.models.containers.RazaContainer;

/**
 *
 * @author diego
 */
public class RazaController implements RazaInterface, RazaListInterface {

    @Override
    public String store(String[] data) {
        if(RazaContainer.exist(data[0]))
        {
            return "error: Ya existe el Codigo de la Raza!!";
        }
        
        Raza obj = new Raza(data[0],data[1],Double.parseDouble(data[2]));
        boolean done=RazaContainer.store(obj);
        if(done)return "done: Raza guardada con exito";
        return "erorr: Error al guardar los datos";
    }

    @Override
    public String[] find(String codigoRaza) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String codigoRaza) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
       @Override
        public String[][]getAll() {
        List Razas=RazaContainer.getAll();        
        String[][] data=new String[Razas.size()][3];
        for(int i=0;i<Razas.size();i++){
            Raza obj=(Raza) Razas.get(i);
            data[i][0]=obj.getCodigo();
            data[i][1]=obj.getNombreRaza();
            data[i][2]= String.valueOf(obj.getPrecioKilo());
        }
        return data;
    }
    
   
}
