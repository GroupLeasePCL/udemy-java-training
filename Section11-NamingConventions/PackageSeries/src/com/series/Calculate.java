package com.series;

public class Calculate implements Series {
    @Override
    public long nSum(int n) {
        var sum = 0;
        var val = 0;
        for (int i=0 ; i<=n ; i++){
            if(i==0){
                val = 0;
                sum= 0;
            }else {
                val = val+i;
                sum += val;
            }
            System.out.print(val+" ");
        }
        return sum;
    }

    @Override
    public void factorial(int n) {
        int val=0;
        for(int i=0; i<=n; i++){
            if(i==0){
                val = 0;
            }else if(i==1){
                val = 1;
            }else {
                val = val*i;
            }
            System.out.print(val+" ");
        }
    }

    @Override
    public void fibonacci(int n) {
        long preVal = 0;
        long nextVal = 1;
        for(int i=0; i<=n; i++){
            System.out.print(preVal+" ");
            long sum=preVal+nextVal;
            preVal=nextVal;
            nextVal=sum;
        }
    }
}
