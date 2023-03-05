package com.algorithmproblems;
import java.util.Scanner;

class N_PrimeNumbers
{
    public void find_N_PrimeNumbers()
        {
        int i,count;
        System.out.print("Enter n value : ");
        Scanner range=new Scanner(System.in);

        int n=range.nextInt();
        System.out.println("Prime numbers between 1 to "+ n +" are ");
        for(int j=2;j<=n;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print(j+"  ");
        }
    }

    public static void main(String[] args)
    {
        N_PrimeNumbers obj = new N_PrimeNumbers();
        obj.find_N_PrimeNumbers;
    }
}


