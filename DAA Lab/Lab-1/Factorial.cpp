#include<stdio.h>

int factorial(int n){
	int fact=n;
	int i=0;
	for(i=1;i<n;i++){
		fact*=i;
	}
return n * factorial(n - 1);
}
int main(){
	int num;
	int fact;
	printf("enter positive integer:");
	scanf("%d",&num);
	if(num<0){
		printf("please enter positive:");
		
	}
	else {
        printf("Factorial of %d is %llu\n",num,fact);
    }

    return 1;
}
