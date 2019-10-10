import java.io.*;

public class Ejercicio2
{
   public static void main(String [] args)
   {
      if (! (new File("anotaciones.txt")).exists() ) {
         System.out.println("No he encontrado anotaciones.txt");
         return;
      }
      
      System.out.println("Leyendo fichero...");
      
      try 
      {
         BufferedReader fichero = new BufferedReader(new FileReader(new File("anotaciones.txt")));
         String linea = fichero.readLine();;
                  
         while (linea != null) 
         {
            System.out.println(linea);
            linea = fichero.readLine();         
         }
         
         fichero.close();
      } 
      catch (IOException e) 
      {
         System.out.println( "Ha habido problemas: " + e.getMessage() );
      }
      
      System.out.println("Fin de la lectura.");
   }
}