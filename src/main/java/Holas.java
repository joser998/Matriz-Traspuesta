import java.util.Scanner;
public class Holas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Matriz Traspuesta.\n");
        System.out.print("Inserta numero Filas: ");
        int nFilas=sc.nextInt();
        System.out.print("Inserta numero Columnas: ");
        int nColumnas=sc.nextInt();
        
        int matriz[][] = new int [nFilas][nColumnas];
        
        System.out.println("Guardar Matriz: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("\nMatriz Original: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("["+matriz[i][j]+"]" + " ");
            }
                System.out.println();
        }
        
        //Trasponiendo la Matriz
        int aux=0;
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<i; j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }
        
        System.out.println("\nMatriz Traspuesta:");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("["+matriz[i][j]+"]" + " ");
            }
                System.out.println();
        }
    }
}