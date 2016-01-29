//
//  main.c
//  sortProgramming
//
//  Created by 한유진 on 2016. 1. 26..
//  Copyright © 2016년 한유진. All rights reserved.
//

// "C:\\Users\\youjin\\hyj\\input.txt"
#define _GNU_SOURCE
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int comparsionCounter1=0; // for exchangeSort
int comparisonCounter2=0; // for quickSort+partition
int comparisonCounter3=0; // for mergeSort+Merge

int partition(int Arr[],int l, int r);
void quickSort(int Arr[],int l,int r);
void exchangeSort(int n,int Arr[]);
void Merge(int *Arr, int *Left, int leftCount, int *Right, int rightCount);
void MergeSort(int *Arr, int n);


void Merge(int *Arr, int *Left, int leftCount, int *Right, int rightCount){
    int i=0; //i : Left의 인덱스 변수 선언 및 초기화
    int j=0; //j : Right의 인덱스 변수 선언 및 초기화
    int	k=0; //k : Arr의 인덱스변수 선언 및 초기화
    //두개로 쪼갠걸 비교한다
    while(i<leftCount && j<rightCount){
        comparisonCounter3++;
        
        if(Left[i]<Right[j])
            Arr[k++] = Left[i++];
        
        else
            Arr[k++]=Right[j++];
        
    }
    //왼쪽에 남아있는 것이 합해진 배열에 추가
    while(i<leftCount)
        Arr[k++]=Left[i++];
    
    //오른쪽에 남아있는 것이 합해진 배열에 추가
    while(j<rightCount)
        Arr[k++]=Right[j++];
}

//재귀함수
void MergeSort(int *Arr, int n){
    int mid, i, *Left, *Right;
    //배열 원소개수가 2개 미만이면 bye~
    if(n<2)
        return;
    
    mid = n/2; //반 자르셈
    
    //왼,오른쪽 쪼갠 배열 생성하기
    //0~mid-1 까지 : 왼쪽(mid개)
    //mid~n-1까지 : 오른쪽(n-mid개)
    Left = (int*)malloc(mid*sizeof(int));
    Right = (int*)malloc((n-mid)*sizeof(int));
    
    //Left,Right배열을 생성했으니 각각의 원소를 넣읍시당
    for(i=0;i<mid;i++)
        Left[i]=Arr[i];
    for(i=mid;i<n;i++)
        Right[i-mid]=Arr[i];
    
    //왼쪽거 정렬
    MergeSort(Left,mid);
    //오른쪽거 정렬
    MergeSort(Right,n-mid);
    //합친다
    Merge(Arr,Left,mid,Right,n-mid);
    free(Left);
    free(Right);
    
}

int partition(int Arr[],int l, int r){
    int pivot; //pivot  --> 맨 왼쪽에 있는애로 정하쟝
    int i,j;
    int temp;
    
    pivot = Arr[l];
    i=l;
    j=r;
    //j=r;
    //정지한상태에서 숫자 교환하게 해주는 가장 큰 loop
    while(1){
        //Arr[i]이 pivot보다 작으면 통과(index i 증가시키며), 크거나 같으면 정지 하게하는 loop
        //do ++i;
        while(Arr[i]<=pivot && i<=r){
            if(i==10)
                break;
            ++i;
            comparisonCounter2++;
        }
        
        //Arr[j]이 pivot보다 크면 통과(index j 감소시키면서), 작으면 정지하게 하는 loop
        while(Arr[j]>pivot){
            --j;
            comparisonCounter2++;
        }
        
        //정지된 위치에서 교환(교차 안된 상태일때)
        if(i<j){
            comparisonCounter2++;
            temp = Arr[i];
            Arr[i]= Arr[j];
            Arr[j]= temp;
        }
        //교차되면 큰 while loop 나가
        else
            break;
    }
    //교차되면 큰 while loop 나온 상태에서
    //Arr[l](pivot)과 Arr[j]랑 바꿔
    temp = Arr[l];
    Arr[l]=Arr[j];
    Arr[j]=temp;
    
    return j;
}
void quickSort(int Arr[],int l,int r){
    //partition 의 리턴값 : pivot의 위치
    int j;
    
    if(l<r){
        //comparisonCounter2++;
        j=partition(Arr,l,r);
        //recursive call
        quickSort(Arr, l, j-1); //Group A1
        quickSort(Arr,j+1,r); //Group A2
    }
    //printf("\n");
}

void exchangeSort(int n,int Arr[]){
    int i;
    int j;
    int temp;
    int minidx;// 최소값을 찾을 index
    
    for(i=0;i<n-1;i++){
        minidx=i;
        for(j=i+1;j<n;j++){
            if(Arr[j]<Arr[minidx]){
                minidx=j;
            }
            comparsionCounter1++;
        }
        //비교 종료- 선택된 최소값을 맨 앞과 뒤바꿔
        temp = Arr[minidx];
        Arr[minidx]=Arr[i];
        Arr[i]=temp;
    }
    //printf("Total number of Comparison Operations: %d ",comparsionCounter1 );
    //printf("\n");
}

int main(){
    
    int matrix[100][100];
    int matrix2[100][100];
    int matrix3[100][100];
    
    int  i=0,totalNums,totalNum,j=0;
    //파일 받아오기
    FILE *pFile = NULL;
    pFile = fopen( "C:\\Users\\youjin\\hyj\\input.txt", "r" );
    //파일 제대로 불러 왔을 경우
    if( pFile != NULL )
    {
        char strTemp[255];
        char *pStr;
        char *p;
        int column;
        int row=0;
        int r=0;
        
        for(r=0;r<20;r++){
            //txt파일에서 1행의 문자열들을 받아오기
            pStr = fgets( strTemp, sizeof(strTemp), pFile );
            //printf( "%s \n", pStr); //잘 받아왔는지 확인 -->ok
            
            //개행문자 기준으로 strtok 잘라줘
            p = strtok(strTemp," ");
            for(column=0; column < 10; column++){
                
                if(!p)
                    break; //error
                //strtok한것을 atoi로 integer로 변환하기
                row = atoi(p);
                //integer로 변환시킨것을 2차원 배열에 넣기
                matrix[r][column] = row;
                matrix2[r][column] = row;
                matrix3[r][column] = row;
                //한문장 끝 잘라줘
                p =strtok(NULL," ");
            }
        }
        
        //2차원 배열에 넣은거 출력 --> 값 잘 들어왔는지
        /*
         for (i=0 ; i<20 ; i++) {
         printf("Arr%d: ",i+1);
         for (j=0 ; j<10; j++) {
         printf("%d ",  matrix[i][j]);
         }
         printf("\n");
         }
         */
        
        //1. exchangeSort
        printf("1. exchangeSort ");
        for(i=0;i<20;i++)
            exchangeSort(10,matrix[i]);
        
        printf("\n");
        printf("--> exchangeSort의 comparision average: %d ", comparsionCounter1/20);
        printf("\n");
        printf("\n");
        
        //2. mergeSort
        printf("2. mergeSort ");
        for(i=0;i<20;i++)
            MergeSort(matrix3[i],10);
        printf("\n");
        printf("--> mergesort의 comparision average: %d ", comparisonCounter3/20);
        printf("\n");
        printf("\n");
        
        //3. quickSort
        printf("3. quickSort ");
        for(i=0;i<20;i++)
            quickSort(matrix2[i],0,9);
        
        printf("\n");
        printf("--> quickSort의 comparision average: %d ", comparisonCounter2/20);
        
        printf("\n");
        printf("\n");
        
        
        
    }
    //파일 잘못 불러 왔을 경우
    else{
        printf("file load error");
    }
    
    //파일 닫기
    fclose( pFile );
    
    return 0;
}
