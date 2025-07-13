import java.util.*;

public class Hungarian {
    public static void main(String[] args){
        int[][] bolean= new int[4][4];
        int[][] arr1= {{15,13,14,17},{11,12,15,13},{13,12,10,11},{15,17,14,16}};
        int row = arr1.length;
        int column = arr1[0].length;
        int[] min_row = new int[arr1.length];
        int[] min_column = new int[arr1.length];
        int min_value_row = Integer.MAX_VALUE;
        int min_value_column = Integer.MAX_VALUE;
        for(int i=0;i<column;i++){
             int min_value = Integer.MAX_VALUE;
            for(int j=0;j<arr1[0].length;j++){

                if(min_value>arr1[i][j]){

                System.out.println(j);
                min_value = arr1[i][j];
            }
        }
        min_row[i] = min_value;
        }
        for(int i=0;i<column;i++){
             
            for(int j=0;j<arr1[0].length;j++){

                if(min_value_column>arr1[i][j]){

                
                min_value_column = arr1[i][j];
            }
        }
        min_row[i] = min_value_column;
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j] -= min_row[i];
                System.out.print(arr1[i][j]+" ");
            }
            System.err.println();
        }

        for(int i=0;i<column;i++){
             
            for(int j=0;j<arr1[0].length;j++){

                if(min_value_row>arr1[i][j]){

                
                min_value_row = arr1[i][j];
            }
        }
        min_column[i] = min_value_row;
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j] -= min_row[i];
                System.out.print(arr1[i][j]+" ");
            }
            System.err.println();
        }
    }
   
    public static int findMinValueColumn(int[][] arr1,int[][] bolean,int column,int row){
        int min_value = Integer.MAX_VALUE;
        for(int i=0;i<row;i++){
            if(min_value>arr1[row][i]){
                min_value = arr1[row][i];
            }
        }
        return min_value;

    }
    
}
