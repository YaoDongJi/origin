package algotithm.Bsearch;

import java.util.Scanner;
public class testBsearch {

    public static void main(String [] args){
        Bsearch bsearch = new Bsearch();
        Result result = new Result();
        bsearch.initArrow();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查找值");
        int key = scanner.nextInt();
        System.out.println("key == "+key);
        result = bsearch.bSearch(bsearch.arrowToSearch,key);
        scanner.close();
        System.out.println("result== "+result);
    }

}
