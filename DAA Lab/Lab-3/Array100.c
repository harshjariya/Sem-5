#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define N 100


void best_case(){
    FILE *fp;
    fp = fopen("D:\\SEM-5\\DAA Lab\\Lab-3\\Array\\best_case","w");
    int i;
    for(i=1;i<=N;i++){
        fprintf(fp,"%d\n",i);

    }
    fclose(fp);
}
void worst_case(){
    FILE *fp;
    fp = fopen("D:\\SEM-5\\DAA Lab\\Lab-3\\Array\\worst_case","w");
    int i;
    for(i=N;i>=1;i--){
        fprintf(fp,"%d\n",i);
    }
    fclose(fp);
}
void avg_case(){
    FILE *fp;
    fp = fopen("D:\\SEM-5\\DAA Lab\\Lab-3\\Array\\avg_case","w");
    int i;
    int arr[N];
    for(i=1;i<=N;i++){
        arr[i-1]=i;
    }
    srand(time NULL);
    
    for(i=N-1;i>0;i--){
        int j=rand()%(i+1);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    for(i=0;i<N;i++){
                fprintf(fp,"%d\n",arr[i]);

        
    }
    fclose(fp);
}

void main(){
    best_case();
    worst_case();
    avg_case();
}