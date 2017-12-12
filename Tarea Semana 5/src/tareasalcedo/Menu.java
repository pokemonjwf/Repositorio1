package tareasalcedo;
import java.util.Scanner;

import tareasalcedo.PruebaNombre;
public class Menu {
	public static void main(String[] args) {
		 Scanner tecla=new Scanner(System.in);
		  int opcion;
		  boolean salida=false;
		while(!salida)
		{	  
		System.out.println("\t\tMENU DE OPERACIONES");
		System.out.println("\t\t-------------------");
		System.out.println("\t1. Clase Object-metodo equals()");
		System.out.println("\t2. Clase Object-metodo getClass()");
		System.out.println("\t3. Clase Object-metodo toString()");
		System.out.println("\t4. Clase Math");
		System.out.println("\t5. Clase Wrapper");
               System.out.println("\t6. String-Metodo Lenght()");
               System.out.println("\t7. String-Metodo toUpperCase()");
               System.out.println("\t8. String-Metodo toLowerCase()");
               System.out.println("\t9. String-Metodo indexOf()");
               System.out.println("\t10. String-Metodo compareTo()");
		System.out.println("\t11. String-Metodo SubString/CharAt()");
               System.out.println("\t12. String-Metodo trim()");
               System.out.println("\t13. String-Metodo replace()");
               System.out.println("\t14. Salir");
               
		System.out.print("\t\n\nIngrese opcion: ");
		opcion=tecla.nextInt();
		    
		switch(opcion)
		{case 1:	System.out.println("Clase Object-metodo equals()");
				String sCadena1=new String("Jaime");
                               String sCadena2=new String("Jorge");
                               String sCadena3=new String("Jaime");
                               if(sCadena1.equals(sCadena2))
                                   System.out.println(sCadena1+" y "+sCadena2+" son IGUALES");
                               else
                                   System.out.println(sCadena1+" y "+sCadena2+" son DIFERENTES");
                               if(sCadena1.equals(sCadena3))
                                   System.out.println(sCadena1+" y "+sCadena3+" son IGUALES");
                               else
                                   System.out.println(sCadena1+" y "+sCadena3+" son DIFERENTES");
                               break;
		  
		  case 2:    System.out.println("Clase Object-metodo getClass() ");
		             PruebaNombre prueba = new PruebaNombre();
                               System.out.println(prueba.nombreClase());
		   break;
		   
		 case 3:    System.out.println("Clase Object-metodo toString()");
                           System.out.println(Thread.currentThread().toString());
                           System.out.println(new Integer(44).toString());	
                
                  break;
		   
		 case 4:    System.out.println("Funcion Math");
                           double operador1;
                           double operador2;
                           System.out.print("Ingrese valor 1: ");
                           operador1=tecla.nextDouble();
                           System.out.print("Ingrese valor 2: ");
                           operador2=tecla.nextDouble();
                           System.out.println(Math.ceil(operador1)); 
                           System.out.println(Math.floor(operador2)); 
                           System.out.println(Math.pow(operador1, operador2)); 
                           System.out.println(Math.max(operador1, operador2)); 
                           System.out.println(Math.sqrt(operador1)); 
                           System.out.println(Math.abs(operador1));
                           System.out.println(Math.atan2(operador1, operador2));
                           System.out.println(Math.log(operador2)); 
                           System.out.println(Math.cos(operador1));
                           System.out.println(Math.exp(operador2));
                           System.out.println(Math.round(operador2));
		   break;
                  case 5:  System.out.println("Clase Wrapper");
                           Float f2 = new Float(3.14f);    // Crea un nuevo objeto wrapper
                           short s = f2.shortValue();      // Convierte el valor de f2 en un primitivo short
                           System.out.println(s);	
                
                  break;
                  case 6:    System.out.println("String-Metodo Lenght()");
                           String nombre ;
                           System.out.print("Ingrese una cadena de texto: ");
                            nombre=tecla.next();
		        	System.out.println("La longitud de la cadena es :"+nombre.length());
		        	break;
                  case 7:    System.out.println("String-Metodo toUpperCase()");
                           String sCadena;
                           System.out.print("Ingrese una cadena de texto: ");
                               sCadena=tecla.next();
		        	System.out.println("El texto en mayuscula seria: "+sCadena.toUpperCase());
		        break;
                  case 8:    System.out.println("String-Metodo toLowerCase()");
                           String sCadenaN;
                           System.out.print("Ingrese una cadena de texto: ");
                            sCadenaN=tecla.next();
		        	System.out.println("El texto en minuscula seria: "+sCadenaN.toLowerCase());
		        break;
                   case 9:    System.out.println("String-Metodo indexOf()");
                              String colores="rojo,amarillo,verde,azul,morado,marron";
                              int inicio=colores.indexOf(",");
                              int fin=colores.indexOf(",",inicio+1);
                              System.out.println(colores.substring(inicio+1,fin));
                              System.out.println(colores.substring(inicio+1));
                           break;
                   case 10:    System.out.println("String-Metodo compareTo()");
                           String cadena1="";
                            String cadena2="";
                            System.out.print("Ingrese cadena 1: ");
                            cadena1=tecla.next();
                            System.out.print("Ingrese cadena 2: ");
                            cadena2=tecla.next(); 
                           System.out.println(cadena1.compareTo(cadena2));
                       break;
		  
                   case 11:    System.out.println("String-Metodo SubString/CharAt()");
                               String texto;
		        	String subcadena;
		        	char mp;
		        	System.out.println("Ingrese una cadena de texto:");
                                texto=tecla.next();
                               subcadena=texto.substring(2);
                               mp=texto.charAt(1);
                               System.out.println("Las partes extraidas de la cadena son :"+subcadena);
                               System.out.println("Las partes extraidas de la cadena son :"+mp);
                        break;
                   case 12:System.out.println("String-Metodo trim()");
                       String cadenatrim = " Esto Es Una Cadena  " ;
                       System.out.println(cadenatrim.trim());
                   break;
                   case 13:System.out.println("String-Metodo replace()");
                       String cadena = new String("secar");
                       System.out.println(cadena.replace('e','a')); //sacar
                   break;
		 case 14:    salida=true;break;
		 default:   System.out.println("Solo números entre 1 y 14");salida=true;
		}
	  }
	}
}
