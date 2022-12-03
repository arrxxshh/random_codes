#include<stdio.h>
int main()
{
    int m,k,n;
    
    //rows and columns of arr1
    printf("enetr order of matrix 1\n");
    scanf("%d%d",&m,&k);
    //rows and columns of arr2
    printf("enter order of matrix 2\n");
    scanf("%d%d",&k,&n);
    int arr1[m][k],arr2[k][n];
    int mul[m][n];
    //arr1 init
    printf("array 1\n");
     for(int i=0;i<m;i++){
        for (int j = 0; j < k; j++)
        {
            
            scanf("%d",&arr1[i][j]);
        }
    }
    
    //arr2 init
    printf("array 2\n");
     for(int i=0;i<k;i++){
        for (int j = 0; j < n; j++)
        {
            scanf("%d",&arr2[i][j]);
        }
        
    }
    //mul init
     for(int i=0;i<m;i++){
        for (int j = 0; j < n; j++)
        {
            mul[i][j]=0;
        }
        
    }

    //mul
    for (int i = 0; i < m; i++)
    {
       for (int j = 0; j < n; j++)
       {
            for (int p = 0; p < k; p++)
            {
                mul[i][j]+=arr1[i][p]*arr2[p][j];
                
            }
            printf("%d\t",mul[i][j]);
       }
      printf("\n"); 
    }
    
}
