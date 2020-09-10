package algotithm.greedy;

import java.lang.reflect.Array;
import java.util.*;

public class Greedy {
    public List needCoverStates = new ArrayList<String>();
    public List<Redio> redioList = new LinkedList<>();
    public List<Redio> redioResultList = new LinkedList<>();

    public Greedy(){
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        System.out.println("构造needCoverStates");
        System.out.println("请输入州名，以tab分隔");
        String states = scanner.nextLine();
        needCoverStates.addAll(Arrays.asList(states.split("\t")));
        System.out.println("请输入电台总数");
        temp = scanner.nextInt();
        for(int i=0;i<temp;i++){
            Redio redio = new Redio(scanner);
            redioList.add(redio);
        }
        scanner.close();
    }

    @Override
    public String toString() {
        return "Greedy{" +
                "redioResultList=" + redioResultList.toString() +
                '}';
    }

    public static List<Redio> greedy(List needCoverStates,List redioList,List redioResultList){
//       当所有需要被覆盖的州都被覆盖时，循环结束
        while (needCoverStates.size()>0){
            Iterator<Redio> iterator = redioList.iterator();
            //用来操作集合交集和
            List<String> coverStates = new LinkedList<>();
            //添加所有待覆盖州
            coverStates.addAll(needCoverStates);
            //每轮循环找一个当前最优解
            //假定第一个为最优解
            Redio best = iterator.next();
            coverStates.retainAll(Arrays.asList(best.coverStates));
            int biggestCover = coverStates.size();

            while (iterator.hasNext()){
                //用来操作集合交集和
                coverStates = new LinkedList<>();
                //添加所有待覆盖州
                coverStates.addAll(needCoverStates);
                //每轮循环找一个当前最优解
                //假定第一个为最优解
                Redio temp = iterator.next();
                coverStates.retainAll(Arrays.asList(temp.coverStates));
                int tempInt =coverStates.size();
                if(tempInt>biggestCover){
                    best = temp;
                }
            }
            //每轮循环找到最优解之后移除最优解覆盖的州，并将最优解添加到队列 当中
            needCoverStates.removeAll(Arrays.asList(best.coverStates));
            redioResultList.add(best);
        }
        return redioResultList;
    }
    public static void main(String []args){
        Greedy greedy = new Greedy();
        greedy(greedy.needCoverStates,greedy.redioList,greedy.redioResultList);
        System.out.println(greedy.toString());
    }
}
