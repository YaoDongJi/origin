package algotithm.graph;

import java.util.*;

public class Graph {
    public Map<String,Person[]> graph = new HashMap<>();
    public Map<String ,Person> people = new HashMap<>();
    public Graph(){
        Scanner scanner = new Scanner(System.in);
        String name = null;
        String role;

        System.out.println("初始化人物,");
        System.out.println("请输入姓名");
        while (!scanner.hasNext("q")){

            name = scanner.nextLine();
            System.out.println("请输入角色");
            role = scanner.nextLine();
            Person person = new Person(name,role);
            people.put(name,person);
            System.out.println("请输入姓名");
        }

        System.out.println("初始化图");
        scanner.skip("q");

        Set<String> nameSet = people.keySet();
        for(String nodeName:nameSet){
            System.out.println("请输入 "+nodeName+" 的朋友数量");
            int numOfFriends = scanner.nextInt();
            List<Person> friends = new ArrayList<>();
            for(int i=0;i<numOfFriends;i++) {
                System.out.println("请输入朋友名：");
                String friendName = scanner.next();
                friends.add(people.get(friendName));
            }
            graph.put(nodeName,friends.toArray(new Person[friends.size()]));
        }
    }

    @Override
    public String toString() {
        String str = "\n";
        Set<String > keySet = graph.keySet();
        for (String key:keySet){
            str+=key;
            Person[] persons = graph.get(key);
            for(Person person:persons){
                str+="  "+person.toString();
            }
            str+='\n';
        }
        return "Graph{" +
                "graph=" + str+
                '}';
    }

    public static void main (String []args){
        Graph graph = new Graph();
        System.out.println(graph.toString());
    }
}
