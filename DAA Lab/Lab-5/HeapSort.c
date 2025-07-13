#include<stdio.h>
void heapify(int arr[],int n,int i){
    int largest=i;
    int LeftNode=2*i+1;
    int RightNode=2*i+1;
    if(LeftNode<n && arr[LeftNode]>arr[largest]){
        largest = LeftNode;
    }
    if(RightNode<n && arr[RightNode]>arr[largest]){
        largest = RightNode;
    }
    if(largest!=i){
        int temp=arr[largest];
        arr[largest] = arr[i];
        arr[i]=temp;
        heapify(arr,n,i);
    }
    
}


void HeapSort(int arr[],int n){
    for(int i=n/2;i>=0;i--){
        heapify(arr,n,i);
    }
    for(int i=n-1;i>0;i--){
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        heapify(arr,i,0);
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
HeapSort(arr,n);
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}