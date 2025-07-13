public class Equation {
    public static void main(String []args){
        int x1=0,x2=0,z=0,X1=0,X2=0;

        for(x1=0;x1<=4;x1++){
            for(x2=0;x2<=4-x1;x2++){
                if(z<3*x1+2*x2){
                    z=3*x1+2*x2;
                    X1=x1;
                    X2=x2;
                }
            }
            
        }
        System.out.println(X1);
        System.out.println(X2);
        System.out.println(z);
    }
}
