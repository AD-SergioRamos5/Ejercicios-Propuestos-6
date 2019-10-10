import java.io.*;
import java.util.Scanner;

public class Ejercicio5
{
   public static void main(String [] args)
   {
      if (! (new File("anotaciones.txt")).exists() ) {
         System.out.println("No he encontrado anotaciones.txt");
         return;
      }
      
      Scanner entrada;
      BufferedReader ficheroLectura = null;
      PrintWriter pW = null;
      
      try 
      {
         entrada = new Scanner(System.in);
         System.out.println("Introduce el fichero donde volcar anotaciones: ");
         String ficheroEntrada = entrada.nextLine();
         
         ficheroLectura = new BufferedReader(new FileReader(new File("anotaciones.txt")));
         pW = new PrintWriter(new BufferedWriter(new FileWriter(ficheroEntrada,true)));
         
         String linea = null;
         linea = ficheroLectura.readLine();
                  
         while (linea != null) 
         {
            pW.println(linea.toUpperCase());        
            linea = ficheroLectura.readLine();
         }
         
         pW.close();
         ficheroLectura.close();
      } 
      catch (IOException e) 
      {
         System.out.println( "Ha habido problemas: " + e.getMessage() );
      }
      
      System.out.println("Fin de la lectura.");
   }
}