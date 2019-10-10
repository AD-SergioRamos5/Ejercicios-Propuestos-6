import java.io.*;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
public class Ejercicio3
{
   public static void main(String [] args)
   {
      if (! (new File("anotaciones.txt")).exists() ) {
         System.out.println("No he encontrado anotaciones.txt");
         return;
      }
      
      System.out.println("Leyendo fichero...");
      Scanner entrada;
      
      try 
      {
         BufferedReader fichero = new BufferedReader(new InputStreamReader(new FileInputStream("anotaciones.txt"), StandardCharsets.UTF_8));
         String linea = null;
         linea = fichero.readLine();
         
         String seguir;    
         entrada = new Scanner(System.in);
         
         int contador = 0;
                     
         while (linea != null) 
         {
            System.out.println(linea);
            linea = fichero.readLine(); 
            contador++;
            if(contador == 10)
            {          
               contador = 0;       
               System.out.println("Pulsa Enter para continuar...");
               seguir= entrada.nextLine();               
            }
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