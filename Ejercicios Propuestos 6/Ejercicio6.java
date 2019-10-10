import java.io.*;
import java.util.Scanner;

public class Ejercicio6
{
   public static void main(String [] args)
   {
      Scanner entrada = new Scanner(System.in);
         
      System.out.print("Introduzca un fichero para leer: ");
      String ficheroLeer = entrada.nextLine();
      
      if (! (new File(ficheroLeer)).exists() ) {
         System.out.println("No he encontrado " + ficheroLeer);
         return;
      }
      
      BufferedReader fichero = null;
      
      try 
      {

         fichero = new BufferedReader(new FileReader(new File(ficheroLeer)));
                  
         System.out.print("Introduzca una palabra para buscarla en el fichero: ");
         String palabra = entrada.nextLine();
         
         String linea = null;
         linea = fichero.readLine();
                     
         while (linea != null) 
         {
            if(linea.contains(palabra))
               System.out.println(linea);
            
            linea = fichero.readLine(); 
         }
         
         fichero.close();
      } 
      catch (IOException e) 
      {
         System.out.println( "Ha habido problemas: El fichero no existe" );
      }
      
      System.out.println("Fin de la lectura.");
   }
}