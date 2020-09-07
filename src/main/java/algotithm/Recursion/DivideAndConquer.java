package algotithm.Recursion;

import algotithm.Bsearch.Result;

import java.util.Scanner;

public class DivideAndConquer {
    public  IntArrow intArrow = null;

    DivideAndConquer(){
        System.out.println("wozai ");
        intArrow = new IntArrow();
    }

    public static int getSum(IntArrow intArrow){
        if (intArrow.pointer==0){
            return 0;
        }
        else {
            intArrow.pointer--;
            return intArrow.intArrow[intArrow.pointer]+getSum(intArrow);
        }
    }
    public Result bSearch(int[] intArrow, int key,int low,int high){
        //获取中间位置
        int middle = (low+high)/2;
        //返回中间位置如果相等
        if(intArrow[middle]==key){
            Result result = new Result(middle,intArrow[middle]);
            return result;
        }
        //不存在
        if(low>high){
            return  new Result();
        }

        if(intArrow[middle]>key){
              return   bSearch(intArrow,key,low,middle-1);
            }
       if (intArrow[middle]<key){
             return bSearch(intArrow,key,middle+1,high);
            }
        return new Result();
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        DivideAndConquer divideAndConquer = new DivideAndConquer();
        int sumOfArrow = divideAndConquer.getSum(divideAndConquer.intArrow);
        System.out.println("result=="+sumOfArrow);
        int key = -1;
        System.out.println("请输入查询值：");
        while(!scanner.hasNext("q")){
            key = scanner.nextInt();
            Result result = divideAndConquer.bSearch(divideAndConquer.intArrow.intArrow,key,0,divideAndConquer.intArrow.intArrow.length-1);
            System.out.println(result);
            System.out.println("请输入查询值：");
        }

    }
}
