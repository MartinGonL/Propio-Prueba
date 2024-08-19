
package perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

public class Perros {

   
    public static void main(String[] args) {
        ArrayList<String> raza = new ArrayList();
        Scanner leer = new Scanner (System.in);
        String opcion;
        boolean comparar = false;
        do{
            System.out.println("ingrese la raza de perro ");
            raza.add(leer.nextLine());
            System.out.println("se añadio una nueva raza, desea añadir otra s/n ");
            opcion=leer.nextLine();                       
        }while (opcion.equalsIgnoreCase("S"));
        
        System.out.println("lista sin ordenar");
        Iterator<String> i= raza.iterator();           
            while (i.hasNext()){
                System.out.println(" "+i.next());
            }
        System.out.println("elija la raza que desea borrar ");
        i= raza.iterator();
        String nombre =leer.next();
        while(i.hasNext()){
            if(nombre.equalsIgnoreCase(i.next())){
                i.remove();
                comparar=true;
            }
        }
           if(comparar){
               System.out.println("Raza "+nombre+ " a sido borrada ");               
           }else{
               System.out.println("Raza no encontrada ");
               
           }
        System.out.println("Lista con objeto borrado ");
        i=raza.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Collections.sort(raza);
        System.out.println("--Lista ordenada--");
        i=raza.iterator();
        while (i.hasNext());
        System.out.println(i.next());
    }
 
    
}
