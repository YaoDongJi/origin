package algotithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Redio {
    public String redioName;
    public int coverStatesNums;
    public String[] coverStates;

    public Redio(Scanner scanner){
        System.out.println("请输入电台名称");
        this.redioName = scanner.nextLine();
        System.out.println("请输入覆盖数量");
        coverStatesNums = scanner.nextInt();
        coverStates = new String[coverStatesNums];
        scanner.skip("\n");
        for(String str:coverStates){
            System.out.println("请输入州名");
            str = scanner.nextLine();
        }
    }

    @Override
    public String toString() {
        return "Redio{" +
                "coverStates=" + Arrays.toString(coverStates) +
                '}';
    }
    public static void main(String []args){
        for(int i=0;i<4;i++){
            new Redio(new Scanner(System.in));
        }
    }
}
