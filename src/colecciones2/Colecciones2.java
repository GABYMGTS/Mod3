
/*
Diseñar un programa que lea y guarde razas de perros en un 
ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle,
el mismo se guardará en la lista y
después se le preguntará al usuario
si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package colecciones2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author GABY
 */
public class Colecciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          /*  ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }

        }
        System.out.println(bebidas.toString()+"**************"); */
       ArrayList <String>  razas= new ArrayList();
       boolean guardarOtroPerro;
       int rta;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       do{
           System.out.println("INDIQUE RAZA DE PERRO");
           razas.add(leer.next());
           System.out.println("1:quiere guardar otro perro o 2:si quiere salir");
           rta=leer.nextInt();
           if(rta==1){
               guardarOtroPerro=true;}
           else if(rta==2){
               guardarOtroPerro=false;}
           else{
               System.out.println("solo acepto 1 o 2, Y TE SACO X TU ERROR");
               guardarOtroPerro=false;
           }
           
       }while (guardarOtroPerro);
    //    for (int i = 0; i < razas.size(); i++) {
            System.out.println(  razas.toString());
            
            System.out.println("ahora con iterator");
            
            Iterator it;
            it= razas.iterator();
            while(it.hasNext()){
                System.out.print(it.next()+"_");
            }
            
      //  }
       /*Continuando el ejercicio anterior, después de mostrar los perros,
    al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator,
    se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. 
    Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
        System.out.println("******************");
        System.out.println("RAZA BUSCADA");
        String buscada = leer.next();
        int encontrada = 0;
        
        //recorrer
         it= razas.iterator();
        while (it.hasNext()) {
            if (it.next().equals(buscada)) {
                encontrada++;
                System.out.println("entre al if ==");
                it.remove();//lo borra
            };
        }
        if (encontrada == 0) {
            System.out.println("NO SE ENCONTRÓ");
        }
        //utilizar la función Collections.sort(colección).
        Collections.sort(razas);//la ordenará
        it= razas.iterator();
            while(it.hasNext()){
                System.out.print(it.next()+"_");
            }
    }



}
    

