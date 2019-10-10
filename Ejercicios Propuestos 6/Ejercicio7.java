import java.io.*;
import java.util.Scanner;

public class Ejercicio7
{
   public static void main(String [] args)
   {
      if (! (new File("rectangulo.txt")).exists() ) {
         System.out.println("No he encontrado rectangulo.txt");
         return;
      }
      
      System.out.println("Leyendo fichero...");
      
      try 
      {
         BufferedReader fichero = new BufferedReader(new FileReader(new File("rectangulo.txt")));
         String linea = null;
         linea = fichero.readLine();
         
         int anchura = 0;
         int altura = 0;
         
         if(linea != null) 
            anchura = linea.length(); 
                           
         while (linea != null) 
         {
            System.out.println(linea);
            linea = fichero.readLine();
            
            altura++;            
         }
         
         fichero.close();     
         
         System.out.println("La altura es: " + altura);
         System.out.println("La anchura es: " + anchura);         
      } 
      catch (IOException e) 
      {
         System.out.println( "Ha habido problemas: " + e.getMessage() );
      }
      
      System.out.println("Fin de la lectura.");
   }
}