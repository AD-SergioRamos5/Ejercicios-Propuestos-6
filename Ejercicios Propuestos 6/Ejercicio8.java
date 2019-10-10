import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio8
{
   public static void main(String [] args)
   {
      Scanner entrada = new Scanner(System.in);
         
      System.out.print("Introduzca un fichero para leer: ");
      String archivoLeer = entrada.nextLine();
      
      if (! (new File(archivoLeer)).exists() ) {
         System.out.println("No he encontrado" + archivoLeer);
         return;
      }

      BufferedReader fichero = null;
      
      try 
      {         
         fichero = new BufferedReader(new FileReader(new File(archivoLeer)));
         
         ArrayList <String> aL = new ArrayList <String>();
         
         String linea = null;
         linea = fichero.readLine();
         int contador = 0;
                 
         while (linea != null) 
         {
            aL.add(linea);
            linea = fichero.readLine();
            contador++;
         }
         
         System.out.print("Introduce una palabra para buscar en el fichero: ");
         String palabra = entrada.nextLine();
         
         while(!palabra.equals(""))
         {
            for(int i = 0; i < aL.size(); i++)
            {
               if(aL.get(i).contains(palabra))
               { 
                  System.out.println(aL.get(i));
               }               
            }
            
            System.out.print("Introduce una palabra para buscar en el fichero: ");
            palabra = entrada.nextLine();
         }
         
         fichero.close();
         
      } 
      catch (IOException e) 
      {
         System.out.println( "Ha habido problemas: " + e.getMessage() );
      }
      
      System.out.println("Fin de la busqueda.");
   }
}