
package pe.uni.Pedidoapp.service;

public class PedidoService {
     
//declaramos la variable IGV y le asignamos el valor de 18% que equivale a 0.18
    private final double IGV = 0.18; 
// creamos el metodo "calcular Impuesto". dentro del parentesis llamamos a la variable "importe" de tipo double(decimal).  
    public double calcularImpuesto (double importe){
// declaramos la variable "impuesto" de tipo double.
    double impuesto;
//creamos la formula para calcular el impuesto.
    impuesto = importe * IGV;
//retornamos la variable con el valor calculado del impuesto.
    return impuesto;
    
    }
         
// creamos el metodo "calcular Total" dentro del parentesis llamamos a la variable "importe" de tipo double(decimal).  
    public double calcularTotal (double importe){
// declaramos la variable "total" de tipo double.
    double total;
//creamos la formula para calcular el total.   utilizamos el metodo creado que almacena el importe calculado.
    total = importe + calcularImpuesto(importe);
//retornamos la variable con el valo calculado del total.   
    return total;
    
    }
    
}
