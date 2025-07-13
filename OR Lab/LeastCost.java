import java.util.*;

public class LeastCost{ 
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
        int money = 0;
        while(true){
            int min_cost = Integer.MAX_VALUE;
            int min_row = -1;
            int min_col = -1;
            for(int i=0;i<s1;i++){
                for(int j=0;j<d1;j++){
                    if(S[i]>0 && D[j]>0 && cost[i][j]<min_cost){
                        min_cost = cost[i][j];
                        min_col = j;
                        min_row = i;

                    }
                }
                
            }
            if(min_row==-1 || min_col==-1){
                break;
            }
            int alloc = Math.min(S[min_row],D[min_col]);
            money+=alloc*cost[min_row][min_col];

            S[min_row]-=alloc;
            D[min_col]-=alloc;
        }
        System.out.println("Cost:"+money);
        sc.close();
    }
}