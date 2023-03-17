
package lab9.lab9p1_eduardochinchilla;

import java.util.ArrayList;

public class Ventanilla {
   private ArrayList<Integer> colaPrioridad; 
   private ArrayList<Integer> colaRegular;
   private int[] ventanilla;
   private char[] ClientesEnVentanilla;
 
   
   public  Ventanilla (int num){
    this.colaPrioridad= new ArrayList<Integer>();
    this.colaRegular = new ArrayList<Integer>();
    this.ventanilla = new int[num];
    this.ClientesEnVentanilla = new char[num];
    
    for (int i =0; i<num;i++){
        ventanilla[i]=0;
        ClientesEnVentanilla[i] =' ';
        }
    }//fin constructor
   public void agregarClienteRegular(int tiempoCliente){
       this.colaRegular.add(tiempoCliente);
}
   public void agregarClientePreferencial (int tiempoCliente){
       this.colaPrioridad.add(tiempoCliente);
   }
   public void actualizarVentanillas(){
       for(int i =0; i < ventanilla.length;i++){
           if(ventanilla[i] > 0){
               ventanilla[i]--;
           }else if(ventanilla[i]== 0){
               ventanilla[i]=' ';
           }
       }
       
   }
   public int encontrarVentanilladisponible(){
       for (int i =0; i <ventanilla.length;i++){
           if(ventanilla[i]==0){
               return i;
           }
       }
       return -1;
   }
   public void correrSimulacion(int total){
       int tiempoTotal = 0;
       while(colaPrioridad.size()> 0 || colaRegular.size()>0){
           actualizarVentanillas();
           
           int disponible = encontrarVentanilladisponible();
           if(disponible !=-1){
       }
     
    }
   }

    public ArrayList<Integer> getColaPrioridad() {
        return colaPrioridad;
    }

    public void setColaPrioridad(ArrayList<Integer> colaPrioridad) {
        this.colaPrioridad = colaPrioridad;
    }

    public ArrayList<Integer> getColaRegular() {
        return colaRegular;
    }

    public void setColaRegular(ArrayList<Integer> colaRegular) {
        this.colaRegular = colaRegular;
    }

    public int[] getVentanilla() {
        return ventanilla;
    }

    public void setVentanilla(int[] ventanilla) {
        this.ventanilla = ventanilla;
    }

    public char[] getClientesEnVentanilla() {
        return ClientesEnVentanilla;
    }

    public void setClientesEnVentanilla(char[] ClientesEnVentanilla) {
        this.ClientesEnVentanilla = ClientesEnVentanilla;
    }
   
}

