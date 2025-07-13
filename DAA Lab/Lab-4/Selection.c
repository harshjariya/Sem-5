#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
    clock_t start,end;
    double cputime;
    FILE *fp;
    fp = fopen("D:\\SEM-5\\DAA Lab\\Lab-3\\Array\\best_case","w");
    int n=0,temp;
    printf("Enter array size:")
    scanf("%d",&n);
    int arr[n];
    int i=0,j=0;
    for(i=0;i<n;i++){
        fscanf(fp,"%d",&arr[i]);
    }
    for(i=0;i<n;i++){
        int min=i;
        for(j=0;j<n;j++){
            if(min>arr[j]){
                min = arr[i];
            }
        }
        int temp=min;
        min=arr[j];
        arr[j]=temp;
    }
    printf("Sorted array is:");
    for(i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}
