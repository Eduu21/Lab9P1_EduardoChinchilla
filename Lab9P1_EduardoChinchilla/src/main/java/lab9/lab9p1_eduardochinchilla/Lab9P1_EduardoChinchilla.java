
package lab9.lab9p1_eduardochinchilla;

import java.util.Scanner;
import java.util.Random;


public class Lab9P1_EduardoChinchilla {
    static Scanner read= new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
       
        int opcion =0;
        
        do{
            System.out.println("Menu");
            System.out.println("1. Pase a la ventanilla");
            System.out.println("2. salir");
            
            opcion = read.nextInt();
            
            switch(opcion){
                case 1:{
                    
                    System.out.println("Ingrese el numero de clientes: ");
                    int clientes = read.nextInt();
                    System.out.println("Ingrese el numero de escritorios disponibles: ");
                    int vent = read.nextInt();
                     Ventanilla v = new Ventanilla(vent);
                    
                    for(int i =1; i <= clientes;i++){
                         int p_o_r = rand.nextInt(2);
                         int tiempoCliente = 1+rand.nextInt(5);
                         
                         String tiemp = "";
                         String tipoCliente= "";
                         
                         if(p_o_r == 0){
                             tipoCliente = "preferencia";
                             v.agregarClientePreferencial(tiempoCliente);
                         }else {
                             tipoCliente = "regular";
                             v.agregarClienteRegular(tiempoCliente);
                         }
                         tiemp = "minutos por cliente: " +tiempoCliente;  
                         System.out.println(p_o_r+ " " +tipoCliente);
                         System.out.println(tiemp);
                         //v.correrSimulacion(clientes*tiempoCliente);
                    }
                    
                    break;
                }
                case 2:{
                    System.out.println("Ha salido del menu");
                    break;
                }
                
                
                
                default:
            }//fi switch
        }while(opcion !=2);
       
    }//fin main
}//fin class
