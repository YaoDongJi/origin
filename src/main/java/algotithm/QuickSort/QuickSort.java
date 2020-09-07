package algotithm.QuickSort;

import algotithm.Recursion.IntArrow;

import java.util.Arrays;


public class QuickSort {

    public static int[] a ={345,23,4354,21,1342,32,34,231,435,1324,13423};
    public static int[] quikSort(int [] arrowToSort,int left,int right){
        //基线条件,满足基线条件返回退出
        if(left>=right){
            return arrowToSort;
        }
        //设定基准值
        int privot = arrowToSort[left];
        int i = left;
        int j = right;
        while (i<j){
            //从右向左寻找小于基准值的位置
            while ((i<j)&&arrowToSort[j]>=privot){
                j--;
            }
            while ((i<j)&&arrowToSort[i]<=privot){
                i++;
            }
            if(i<j){
                //交换
                int temp = arrowToSort[i];
                arrowToSort[i] = arrowToSort[j];
                arrowToSort[j] = temp;
            }
        }
        //缩小排序的范围，直到left<=right
        arrowToSort[left]=arrowToSort[i];
        arrowToSort[i]=privot;
        quikSort(arrowToSort,left,i-1);
        quikSort(arrowToSort,i+1,right);
        return arrowToSort;
    }
    public static void main(String[] args){
        IntArrow intArrow = new IntArrow();
        System.out.println(intArrow.toString());
        System.out.println(Arrays.toString(quikSort(intArrow.intArrow,0,intArrow.intArrow.length-1)));
    }
}
