import java.util.*;
public class VogelsApproximation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of supplies");
        int s1 = sc.nextInt();
        int TotalSupply = 0;
        int TotalDemand = 0;
        int total = 0;
        int[] S = new int[s1];
        int[] PenaltyR = new int[s1];
        for(int i=0;i<s1;i++){
            System.out.println("Enter supply no.["+i+"]:");
            S[i]=sc.nextInt();
            TotalSupply+=S[i];
        } 
        
        System.out.println("Enter number of demand");
        int d1 = sc.nextInt();

        int[] D = new int[d1];
        int[] PenaltyC = new int[d1];
        for(int i=0;i<d1;i++){
            System.out.println("Enter demand no.["+i+"]:");
            D[i]=sc.nextInt();
             TotalDemand+=D[i];
        }

        if(TotalSupply!=TotalDemand){
            System.out.println("supply and demand is not same");
            return;
        }

        int[][] cost = new int[s1][d1];
        for(int i=0;i<s1;i++){
            for(int j=0;j<d1;j++){
                System.out.println("Enter cost no.["+i+"]["+j+"]");
                cost[i][j]=sc.nextInt();
            }
        }
        
        int i=0;
        while (i<s1) {
            int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
            for(int j=0;j<d1;j++){
            
                   
                if(cost[i][j]<min1){
                     min2 = min1;
                     min1 = cost[i][j];
                }
                else if(cost[i][j]<min2){
                    min2 = cost[i][j];
                }
            }
        PenaltyR[i] = min2-min1;
        i++;      
        }  
        int j=0;
        while (j<d1) {
            int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
            for(i=0;i<s1;i++){
            
                   
                if(cost[i][j]<min1){
                     min2 = min1;
                     min1 = cost[i][j];
                }
                else if(cost[i][j]<min2){
                    min2 = cost[i][j];
                }
            }
        
        PenaltyC[j] = min2-min1;
        j++;      
        }    
        for(i=0;i<s1;i++){
            System.out.println("penalty["+i+"]:"+PenaltyR[i]);
        }
        
        for(j=0;j<d1;j++){
            System.out.println("penalty["+j+"]:"+PenaltyC[j]);
        }
        
    }
}