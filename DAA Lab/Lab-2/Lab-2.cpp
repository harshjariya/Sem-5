#include<stdio.h>

#define Size 4
int arr[Size];
int top=-1;
void display();
int push();
int pop();
//push method
void push(int value){
	if(top>=Size-1){
		printf("stack overflow");
		return;
	}
	else{
		top++;
		arr[top]=value;
	}
};
int pop(){
	if(top<0){
		printf("Stack underflow");
		return -1;
	}
	else{
		int val=arr[top];
		top--;
		return val;
	}
}
void display(){
	int i;
	for(i=top;i>=0;i--){
		printf("%d\n",arr[i]);
	}
}
int main(){
	push(10);
	push(20);
	push(22);
	push(50);
	display();
	pop();
	return 0;
}
