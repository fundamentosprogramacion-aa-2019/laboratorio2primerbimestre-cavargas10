/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;
import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class Laboratorio201 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String cadena = "";
        String nombres = "";
        int edad = 0;
        double sueldoMensual;
        double incentivo = 0;
        int hijos = 0;
        int bonoHijos = 0;
        double descuentoSS = 0;
        double totalPagar = 0;
        boolean bandera = true;
        int contador = 0;
        String valorUsuario = "";
        
        cadena = String.format("%s%s\n", cadena, 
                "Reporte de Rol de Pagos por Empleado");
 
        do{ 
            
            contador = contador + 1;
            System.out.printf("Ingrese sus nombres: ");
            nombres = entrada.nextLine();
            
            System.out.println("Si desea terminar, digite 'n' ");
            valorUsuario = entrada.nextLine();
            
            if (valorUsuario.equals("n")){
                bandera = false;
            }
                
            System.out.printf("Ingrese su edad: ");
            edad = entrada.nextInt();
            
            entrada.nextLine(); 
            
            System.out.println("Si desea terminar, digite 'n' ");
            valorUsuario = entrada.nextLine();
            
            if (valorUsuario.equals("n")){
                bandera = false;
            }
                                   
            System.out.printf("Ingrese su Sueldo Mensual: ");
            sueldoMensual = entrada.nextInt();
            
            entrada.nextLine();
            
            System.out.println("Si desea terminar, digite 'n' ");
            valorUsuario = entrada.nextLine();
            
            if (valorUsuario.equals("n")){
                bandera = false;
            }
            
            System.out.printf("Ingrese la cantidad de Hijos: ");
            hijos = entrada.nextInt();
            
            entrada.nextLine();
                                   
            System.out.println("Si desea terminar, digite 'n' ");
            valorUsuario = entrada.nextLine();
            
            cadena = String.format("%sNombres: %s, Edad: %d , Sueldo" 
                    + "Mensual: %.2f , Cantidad de Hijos: %d\n", cadena, 
                    nombres, edad, sueldoMensual, hijos);
                                   
            if (valorUsuario.equals("n")){
                bandera = false;
            }
            
            if(sueldoMensual == 340){
                
                System.out.printf("Usted es un Empleado TIPO 1. \n");
                System.out.println("* Usted recibe un incentivo del 5%, "
                        + "por concepto de edad.");
                incentivo = (double) (sueldoMensual * 0.05);
                                
                if(hijos > 0){
                    System.out.printf("* Usted recibe un bono adicional, por"
                            + " el concepto de hijos. \n");
                    bonoHijos = hijos * 10;
                }else{
                    System.out.printf("* Usted no obtiene bono adicional por el "
                            + "concepto hijos.\n");
                }
                
                sueldoMensual = incentivo + bonoHijos + sueldoMensual;
                
                if(edad <= 20){
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 15;
                }else if (edad > 20 && edad <= 30){
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 25;                    
                }else if (edad > 31) {
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 35;
                }
                                               
            }else if (sueldoMensual == 460){
                System.out.printf("Usted es un Empleado TIPO 2. \n");
                System.out.println("* Usted recibe un incentivo del 5%,"
                        + " por concepto de edad.");
                incentivo = (double) (sueldoMensual * 0.10);
                
                if(hijos > 0){
                    System.out.printf("* Usted recibe un bono adicional, por"
                            + " el concepto de hijos.\n");
                    bonoHijos = hijos * 10;
                }else{
                    System.out.printf("* Usted no obtiene bono adicional por el"
                            + " concepto hijos.\n");
                }
                
                sueldoMensual = incentivo + bonoHijos + sueldoMensual;
                
                if(edad <= 20){
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 15;
                }else if (edad > 20 && edad <= 30){
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 25;                    
                }else if (edad > 31) {
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 35;
                }
                            
            }else if (sueldoMensual == 580){
                System.out.printf("Usted es un Empleado TIPO 3. \n");
                System.out.println("* Usted recibe un incentivo del 5%,"
                        + " por concepto de edad.");
                incentivo = (double) (sueldoMensual * 0.15);
                
                if(hijos > 0){
                    System.out.printf("* Usted recibe un bono adicional, por"
                            + " el concepto de hijos.\n");
                    bonoHijos = hijos * 10;
                }else{
                    System.out.printf("* Usted no obtiene bono adicional por el"
                            + "concepto hijos.\n");
                }
                
                sueldoMensual = incentivo + bonoHijos + sueldoMensual;
                
                if(edad <= 20){
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 15;
                }else if (edad > 20 && edad <= 30){
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 25;                    
                }else if (edad > 31) {
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 35;
                }
            
            }else if (sueldoMensual == 600){
                System.out.printf("Usted es un Empleado TIPO 4. \n");
                System.out.println("* Usted recibe un incentivo del 5%,"
                        + "por concepto de edad.");
                incentivo = (double) (sueldoMensual * 0.15);
                
                if(hijos > 0){
                    System.out.printf("* Usted recibe un bono adicional, por"
                            + " el concepto de hijos.\n");
                    bonoHijos = hijos * 10;
                }else{
                    System.out.printf("Usted no obtiene bono adicional por el "
                            + "concepto hijos.\n");
                }
                
                sueldoMensual = incentivo + bonoHijos + sueldoMensual;
                
                if(edad <= 20){
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 15;
                }else if (edad > 20 && edad <= 30){
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 25;                    
                }else if (edad > 31) {
                    System.out.printf("* Usted Obtendra un Descuento por el "
                            + "concepto Seguro Social. \n");
                    descuentoSS = 35;
                }
            }
            
            System.out.printf("Si desea terminar, digite 'n' ");
            valorUsuario = entrada.nextLine();
            
            if (valorUsuario.equals("n")){
            bandera = false;
            }
                
        }while (bandera == true) ;
        
        totalPagar = (double) (sueldoMensual - descuentoSS);
        
        entrada.nextLine();
        
        cadena = String.format("%s\nDescuento de Seguro social: %.2f\n"
                + "Total Incentivo: %.2f\nTotal Pago por Hijos: %d\n"
                + "Total Pago de la Empresa: %.2f\n", cadena, descuentoSS, 
                incentivo, bonoHijos, totalPagar);
        System.out.printf("%s", cadena);
    }
}
