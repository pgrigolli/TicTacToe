import java.util.Scanner;

public class Program {
 
    public static Integer chooseRow(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Select the row: ");
        Integer row = sc.nextInt();

        sc.close();
        return row;
        
        
    }
    
    public static Integer chooseCol(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Select the col: ");
        Integer col = sc.nextInt();
        
        sc.close();
        return col;
        


    }

    public static void printMat(String[][] mat){

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                System.out.print(mat[i][j] + " ");


            }
            System.out.println();
        }


    }
    
    
    
    
    
    
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("X or O: ");
        String symbol = sc.next().toUpperCase();
        
        
        String[][] mat = new String[3][3];

        

        printMat(mat);

        Integer row;
        Integer col;
        
        sc.close();
        while(true){

            row = chooseRow();
            col = chooseCol();

            mat[row][col] = symbol;


            
            
            
            
        }



    }



}
