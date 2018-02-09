import java.util.Scanner;
/**
 * Write a description of class Add_2_Numb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Add_2_Numb
{
public static void main (String[] args)
    {
    Scanner entrada = new Scanner(System.in);
    int suma = 0;
    String numero = "";
    
    System.out.print("\n Ingrese dos numeros separados por un espacio. \n");
    numero = entrada.nextLine();
    String[] datos= numero.split(" ");
    for (int i=0; i < datos.length; i++){
        suma = suma + Integer.valueOf(datos[i]);
    }
    System.out.print("La suma de los dos numeros es:"+ suma + "\n");
}
}
