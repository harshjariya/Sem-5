#include<stdio.h>

void LinearSearch(int arr[],int n){
    int a;
    printf("Enter Search Element:");
    scanf("%d",&a);
    for(int i=0;i<n;i++){
        if(a==arr[i]){
            printf("Index is:%d",i+1);
        }
    }
}

void main(){
    int n;
    printf("Enter Size of Array:");
    scanf("%d",&n);
    int arr[n];   
    
    for(int i=0;i<n;i++){
        printf("Enter array %d element:",i);
        scanf("%d",&arr[i]);
    }
LinearSearch(arr,n);
}