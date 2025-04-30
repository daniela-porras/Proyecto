/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramadoi.models;

/**
 *
 * @author diego
 */
public class Ganado 
{
  private String codigoRaza;
  private double peso;
  private double precioRes;

  public Ganado(String _codigo,double _peso,double _precio)
  {
      this.codigoRaza=_codigo;
      this.peso=_peso;
      this.precioRes=_precio;
  };

    public String getCodigoRaza() {
        return codigoRaza;
    }

    public void setCodigoRaza(String codigoRaza) {
        this.codigoRaza = codigoRaza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioRes() {
        return precioRes;
    }
    public void setPrecioRes(double precioRes) {
        this.precioRes = precioRes;
    }
  
  
  
}
