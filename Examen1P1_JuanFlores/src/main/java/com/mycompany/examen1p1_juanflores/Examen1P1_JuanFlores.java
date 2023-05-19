/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examen1p1_juanflores;
import java.util.Scanner;
/**
 *
 * @author Juan David
 */
public class Examen1P1_JuanFlores {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        Scanner leer_str=new Scanner (System.in);
        boolean menu = true; //controlador del menu
        
        while(menu){
            System.out.println("Menu \n 1.Sumador Binario \n 2.Estrella \n Ingresar una opción: ");
            int opcion=leer.nextInt();
            
            switch(opcion){
                case 1:
                {
                    String cade;
                    String cade2;
                    
                    System.out.println("Ingresar cadena 1: ");
                    cade=leer_str.next();
                   
                    
                    System.out.println("Ingresar cadena 2: ");
                    cade2=leer_str.next();
                    
                    boolean validacion=true;
                    
                    System.out.println(cade);
                    System.out.println(cade2);
                    
                    
                    if(validacion){
                        if (cade.length()!=cade2.length()){
                            System.out.println("los numeros deben tener el mismo numeros de bits");
                            validacion=false;
                            break;// validacion de que las cadenas sean de igual longitud
                        }
                    }
                    
                    for (int i = 0; i < cade.length(); i++) {
                        int letra = cade.charAt(i);//recorre toda la cadena
                        
                        if (letra!=48 && letra!=49){
                            System.out.println("el primer numero contiene caracteres distintos de 0 y 1");
                            break;//validacion de la primera cadena, si no contiene 1 y 0
                        }  
                    }
                    for (int j = 0; j < cade2.length(); j++) {
                        int  letra2 = cade2.charAt(j);//recorre toda la cadena
                        
                        if (letra2!=48 && letra2!=49){
                           System.out.println("el segundo numero contiene caracteres distintos de 0 y 1");
                           break;//validacion de la segunda cadena, si no contiene 1 y 0
                        }
                    }
                    
                    /*
                    0 + 0 = 0
                    0 + 1 o 1 + 0 = 1
                    1 + 1 = 0 y se lleva uno para la siguiente suma 
                    1 + 1 + 1 = 1 y se lleva uno para la siguiente suma
                    */
                    
                    String resultado="";
                    for (int i = cade.length()-1; i >=0; i--) {
                        
                        char chara1=cade.charAt(i);
                        char chara2=cade2.charAt(i);
                        
                        if (chara1==0 && chara2==0){
                            resultado+=chara2;
                        }else if((chara1==0 && chara2==1)||(chara1==0 && chara2==1)){
                            resultado+=chara2;
                        }else if((chara1==1 && chara2==1)){
                            resultado+=chara2+1;
                        }else if(chara1==1 && chara2==1){
                            resultado+=1;
                        }else{
                            
                        }
                      //intento de comparar
                    }
                    System.out.println(resultado);
                    
                    
                    
                    
                }//fin caso 1
                break;
                case 2:
                {
                    System.out.println("ingresar el tamaño de la estrella: ");
                    int tamaño = leer.nextInt();
                    
                    while(tamaño%2==0 || tamaño<=9){
                        System.out.println("!EROOR! SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                        System.out.println("ingrese un tamaño mayor a 9 y impar: ");
                        tamaño = leer.nextInt();// validacion por si ingresa un caracter fuera del rango
                    }
                    
                    for (int i = 1; i <= tamaño/2+2; i++) {
                        for (int j = 1; j <=tamaño; j++) {
                            if(i==1 && j<=tamaño/2){
                                System.out.print(" ");
                            }else if(i==1 && j<=tamaño/2+1){
                                System.out.print("+");
                            }else if (i==1 && j>=tamaño/2+2){
                                System.out.print(" ");
                            }else if(i==2){
                                System.out.print("*");
                            }else if (i==tamaño/2-2 && j<=1){
                                System.out.print(" ");
                            }else if (i==tamaño/2-2 && j<=2){
                                System.out.print("*");
                            }else if (i==tamaño/2-2 && j<=tamaño/2-2){
                                System.out.print(" ");
                            }else if (i==tamaño/2-2 && j<=tamaño/2-1){
                                System.out.print("+");
                            }else if (i==tamaño/2-2 && j<=tamaño-4){
                                System.out.print(" ");
                            }else if (i==tamaño/2-2 && j<=tamaño-3){
                                System.out.print("+");
                            }else if (i==tamaño/2-2 && j<=tamaño-2){
                                System.out.print(" ");
                            }else if (i==tamaño/2-2 && j<=tamaño-1){
                                System.out.print("*");
                            }else if (i==tamaño/2-2 && j<=tamaño){
                                System.out.print(" ");
                            }else if (i==tamaño/2-1 && j<=2){
                                System.out.print(" ");
                            }else if (i==tamaño/2-1 && j<=tamaño/2-2){
                                System.out.print("*");
                            }else if (i==tamaño/2-1 && j<=tamaño-3){
                                System.out.print(" ");
                            }else if (i==tamaño/2-1 && j<=tamaño-2){
                                System.out.print("*");
                            }else if (i==tamaño/2-1 && j<=tamaño){
                                System.out.print(" ");
                                
                            }else if(i==tamaño/2 && j<=1){
                                System.out.print(" ");
                            }else if (i==tamaño/2 && j<=2){
                                System.out.print("+");
                            }else if (i==tamaño/2 && j<=tamaño/2-2){
                                System.out.print(" ");
                            }else if (i==tamaño/2 && j<=tamaño/2-1){
                                System.out.print("*");
                            }else if (i==tamaño/2 && j<=tamaño/2+2){
                                System.out.print(" ");
                            }else if (i==tamaño/2 && j<=tamaño/2+3){
                                System.out.print("*");
                            }else if (i==tamaño/2 && j<=tamaño/2+4){
                                System.out.print(" ");
                            }else if (i==tamaño/2 && j<=tamaño/2+5){
                                System.out.print("+");
                            }else if (i==tamaño/2 && j<=tamaño-1){
                                System.out.print(" ");
                            }else if (i==tamaño/2+1 && j<=tamaño/2-1){
                                System.out.print("+");
                            }else if (i==tamaño/2+1 && j<=tamaño/2){
                                System.out.print("*");
                            }else if (i==tamaño/2+1 && j<=tamaño/2+1){
                                System.out.print("+");
                            }else if (i==tamaño/2+1 && j<=tamaño/2+2){
                                System.out.print("*");
                            }else if (i==tamaño/2+1 && j<=tamaño){
                                System.out.print("+");
                            }else if (i==tamaño/2+2 && j<tamaño/2+1){
                                System.out.print(" ");
                            }else if (i==tamaño/2+2 && j<tamaño/2+2){
                                System.out.print("*");
                            } else if (i==tamaño/2+2 && j<=tamaño){
                                System.out.print(" ");
                            }else{
                                System.out.print("");
                            }
                            
                        }
                        System.out.println("");
                    }
                    
                    
                    
                    
                }//fin caso 2
                break;
                case 3:
                {
                 menu=false; //fin del menu
                 System.out.println("salio del menu");
                         
                }//fin caso 3
                break;
                
                default:
                    
                    System.out.println("opcion invalida, ingrese una correcta 1-2");
                    menu=false;
                    break;
            }
            
        }
    }
}
