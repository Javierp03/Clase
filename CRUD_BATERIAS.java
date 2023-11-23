package com.mycompany.crud_baterias;
import java.util.Scanner; //Permite meter informacion
import java.util.Random;  //Permite usar random
import java.util.Arrays;  //Permite usar el sort
public class CRUD_BATERIAS {

    public static void main(String[] args) {
     String[][] baterias = new String[100][2];
     int opcion;
     String marca;
     String voltaje;
     int num;
     String bat;
     String m;
     int n;
     
     do{
         System.out.println("===========MENU==========");
         System.out.println("1. Dar de alta una bateria");
         System.out.println("2. Dar de baja una bateria");
         System.out.println("3. Modificar una bateria");
         System.out.println("4. Mostrar baterias");
         System.out.println("5. Ordenar las baterias");
         System.out.println("6. Buscar una bateria");
         System.out.println("7. Salir");
         System.out.println("-------------------------------");
         System.out.println("Escribe una opcion: (1-7)");
          Scanner entradaEscaner = new Scanner (System.in);
          opcion = entradaEscaner.nextInt();
    
     switch(opcion){
         case 1: {
             
                 Random random = new Random();
             
          for (int i = 0; i < 100; i++) {
            // Generar una letra aleatoria y agregarla a la primera columna
            char letra = (char) (random.nextInt(26) + 'A');
            baterias[i][0] = String.valueOf(letra);

            // Generar un número aleatorio y agregarlo a la segunda columna
            int numero = random.nextInt(1001); // Números entre 0 y 1000
            baterias[i][1] = String.valueOf(numero);
        }
          break;
         }
         
         case 2: {
         
             for(int i=0;i<100;i++){
                 System.out.println("");
                 System.out.print(i+". ");
                 for(int j=0;j<2;j++){
                     System.out.print(baterias[i][j]+" ");
                     
                 }
             }
             
             System.out.println("Elige una bateria a eliminar (0-99): ");
             num = entradaEscaner.nextInt();
             
             baterias[num][0]="";
             baterias[num][1]="";
         break;
         }
         
       case 3: {
         
             for(int i=0;i<100;i++){
                 System.out.println("");
                 System.out.print(i+". ");
                 for(int j=0;j<2;j++){
                     System.out.print(baterias[i][j]+" ");
                     
                 }
             }
             
             System.out.println("Elige una bateria a modificar (0-99): ");
             num = entradaEscaner.nextInt();
             entradaEscaner.nextLine(); // Consumir el salto de línea pendiente

             System.out.println("Marca: ");
             marca=entradaEscaner.nextLine();
             
             System.out.println("Voltaje: ");
             voltaje=entradaEscaner.nextLine();
             
             baterias[num][0]=marca;
             baterias[num][1]=voltaje;
         break;
         }
       
       case 4:{
           System.out.println("");
            for(int i=0;i<100;i++){
                 System.out.println("");
                 System.out.print(i+". ");
                 for(int j=0;j<2;j++){
                     System.out.print(baterias[i][j]+" ");
                     
                 }
             }
       break;
       }
     
       case 5:{
       
           System.out.println("Por que campo lo quieres ordenar: (1-2)");
           System.out.println("1. Marca");
           System.out.println("2. Voltaje");
           num = entradaEscaner.nextInt();
           
           if(num==1){
            // Ordenar por el campo de texto (columna 0) utilizando compareTo
        Arrays.sort(baterias, (a, b) -> a[0].compareTo(b[0]));

        // Imprimir el array ordenado
        for (String[] row : baterias) {
            System.out.println(Arrays.toString(row));
        }
			
		}
           
           if(num==2){
            for (int i = 0; i < 99; i++) {
               for (int j = 0; j < 99 - i; j++) {
                 int num1 = Integer.parseInt(baterias[j][1]);
                    int num2 = Integer.parseInt(baterias[j + 1][1]);
                    if (num1 > num2) {
                    // Intercambiar las filas
                         String[] temp = baterias[j];
                      baterias[j] = baterias[j + 1];
                      baterias[j + 1] = temp;
                }
            }
        }

        // Mostrar el array ordenado
        for (String[] row : baterias) {
            System.out.println(row[0] + ", " + row[1]);
        }
			}
           break;
	}
       
       case 6:{
           entradaEscaner.nextLine();
           System.out.println("Introduce el voltaje a buscar: ");
           bat = entradaEscaner.nextLine();
           
           for (int i=0;i<100;i++){
               if(baterias[i][1].equals(bat)){
                   System.out.println(baterias[i][0]+ " "+baterias[i][1]);}
           }
           
           break;}
           
       default:{
           System.out.println("OPCION INCORRECTA");
        break;}
     
     } 
     }while(opcion!=7);
     
     
    }
}
