package algotithm.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BFS {
    public Graph graph ;
    public BFS(){
        graph = new Graph();
    }
    public String findM(String firstNode,Graph graph){
        List<Person> list = new LinkedList<>();
        //将第一个节点放入队列
        list.add(graph.people.get(firstNode));
        while (list.size()>0){
            Person person = list.remove(0);
            if(!person.isCheck()){
                person.setCheck(true);
                System.out.println("person="+person.toString());
                if (person.getRole().equals("m")){
                    System.out.println("berore");
                    return person.getName();
                }else {
                    Person[] people = graph.graph.get(person.getName());
                    list.addAll(Arrays.asList(people));
                }
            }
        }
        System.out.println("after");
        return "-1";
    }
    public static void main(String[] args){
        BFS bfs = new BFS();
        System.out.println(bfs.graph.toString());
        System.out.println("xiamian");
        System.out.println(bfs.findM("1",bfs.graph));
    }

}
