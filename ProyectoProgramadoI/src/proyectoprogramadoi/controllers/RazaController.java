/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramadoi.controllers;

import proyectoprogramadoi.models.Raza;
import proyectoprogramadoi.models.containers.RazaContainer;

/**
 *
 * @author diego
 */
public class RazaController implements RazaInterface {

    @Override
    public String store(String[] data) {
        if(RazaContainer.exist(data[0]))
        {
            return "error: Ya existe el Codigo de la Raza!!";
        }
        //double valor = Double.parseDouble(data[2]);
        Raza obj = new Raza(data[0],data[1],Double.parseDouble(data[2]));
        
        
        return "Message"+data[0]+" "+data[1]+" "+data[2];
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
    public String[][] getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
