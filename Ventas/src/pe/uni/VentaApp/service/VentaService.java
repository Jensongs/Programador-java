/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.VentaApp.service;


public class VentaService {
    
    // creamos el metodo "calcular Total" dentro del parentesis llamamos a la variable "importe" de tipo double(decimal).  
    public double calcularTotal (double precio, int cantidad){
// declaramos la variable "total" de tipo double.
    double total;
//creamos la formula para calcular el total.   utilizamos el metodo creado que almacena el importe calculado.
    total = precio * cantidad;
//retornamos la variable con el valo calculado del total.   
    return total;
    
    }
    //declaramos la variable IGV y le asignamos el valor de 18% que equivale a 0.18
    private final double IGV = 0.18; 
// creamos el metodo "calcular Impuesto". dentro del parentesis llamamos a la variable "importe" de tipo double(decimal).  
    public double calcularImporte (double precio,int cantidad ){
// declaramos la variable "impuesto" de tipo double.
    double importe;
//creamos la formula para calcular el impuesto.
    importe = calcularTotal(precio, cantidad) / (1+IGV);
//retornamos la variable con el valor calculado del impuesto.
    return importe;
    
    }
 public double calcularImpuesto (double precio,int cantidad ){
// declaramos la variable "impuesto" de tipo double.
    double impuesto;
//creamos la formula para calcular el impuesto.
    impuesto = calcularImporte(precio, cantidad) * IGV;
//retornamos la variable con el valor calculado del impuesto.
    return impuesto;
    
    }
    
    

}
