#include<stdio.h>
#include<stdlib.h>

void accept(int **matrix,int rows, int cols)
{
    int i,j;
    for(i=0;i<rows;i++)
    {
        for(j=0;j<cols;j++)
        {
            scanf("%d",&matrix[i][j]);
        }
    }
}

void display(int **matrix,int rows, int cols)
{
    int i,j;
    for(i=0;i<rows;i++)
    {
        for(j=0;j<cols;j++)
        {
            printf("%d\t",matrix[i][j]);
        }
        printf("\n");
    }
}

void multiply(int **matrix1, int **matrix2, int rows, int cols,int n)
{
    int **result, i,j,k;
    result= (int**) malloc(rows*sizeof(int*));

    for(i=0;i<cols;i++)
        result[i]=(int*)malloc(cols*sizeof(int));

    for(i=0;i<rows;i++)
    {
        for(j=0;j<cols;j++)
        {
            result[i][j]=0;
            for(k=0;k<n;k++)
            {
                result[i][j]+= matrix1[i][k]*matrix2[k][j];
            }
        }
    }
    printf("Result of multiplication: \n");
    display(result,rows,cols);

}
void main()
{
    int **matrix1, **matrix2;
    int rows1,cols1,rows2,cols2,flag=0,i,j;
    do
    {
        printf("\n Enter no. of rows for matrix-1: ");
        scanf("%d",&rows1);
        printf("\n Enter no. of columns for matrix-1: ");
        scanf("%d",&cols1);
        printf("\n Enter no. of rows for matrix-2: ");
        scanf("%d",&rows2);
        printf("\n Enter no. of columns for matrix-2: ");
        scanf("%d",&cols2);
        if(cols1!=rows2)
        {
            flag=1;
            printf("\n Multiplication is not possible. Re-enter...");
        }

    }while(flag!=0);

    matrix1= (int**) malloc(rows1*sizeof(int*));

    for(i=0;i<cols1;i++)
        matrix1[i]=(int*)malloc(cols1*sizeof(int));

    matrix2= (int**) malloc(rows2*sizeof(int*));

    for(i=0;i<cols2;i++)
        matrix2[i]=(int*)malloc(cols2*sizeof(int));

    printf("\n Enter elements of matrix-1(%d x %d):",rows1,cols1);
    accept(matrix1,rows1,cols1);
    display(matrix1,rows1,cols1);
    printf("\n Enter elements of matrix-2(%d x %d):",rows2,cols2);
    accept(matrix2,rows2,cols2);
    display(matrix1,rows1,cols1);
    multiply(matrix1,matrix2,rows1,cols2,cols1);

}

