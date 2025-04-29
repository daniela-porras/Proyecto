/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectoprogramadoi.controllers;

/**
 *
 * @author diego
 */
public interface RazaInterface {
    public String store(String[]data);
    public String[] find (String codigoRaza);
    public String update (String[]data);
    public String delete (String codigoRaza);
    public String [][] getAll();
}
