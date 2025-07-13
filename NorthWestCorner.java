import java.util.*;

public class NorthWestCorner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of supplies");
        int s1 = sc.nextInt();
        int TotalSupply = 0;
        int TotalDemand = 0;
        int total = 0;
        int[] S = new int[s1];
        for(int i=0;i<s1;i++){
            System.out.println("Enter supply no.["+i+"]:");
            S[i]=sc.nextInt();
            TotalSupply+=S[i];
        } 
        
        System.out.println("Enter number of demand");
        int d1 = sc.nextInt();

        int[] D = new int[d1];
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
        int i=0,j=0;
    while(TotalSupply!=0 && TotalDemand!=0){
        if(D[j]>S[i]){
            total+=S[i]*cost[i][j];
            TotalSupply-=S[i];
            TotalDemand-=S[i];
            D[j]-=S[i];
            S[i]=0;
           
            i+=1;
        }
        else if(S[i]>D[j]){
            total+=D[j]*cost[i][j];
            TotalSupply-=D[j];
            TotalDemand-=D[j];
            
            S[i]-=D[j];
            D[j]=0;
            j+=1;
        }
       
        else{
            total+=S[i]*cost[i][j];
            TotalSupply-=S[i];
            TotalDemand-=S[i];
            S[i]=0;
            D[j]=0;
            j+=1;
            i+=1;
        }
    }
    System.out.println(total);

    }
}