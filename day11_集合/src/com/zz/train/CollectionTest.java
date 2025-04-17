package com.zz.train;

import com.zz.train.entity.Person;
import com.zz.train.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionTest {

    public static void main(String[] args) {
        // 练习：判断输出结果为何？
        //testOne();

        //面试题1
        //interviewOne();

        //set面试题2
        //setInterviewOne();

        //练习list去重,尽量简单
        //listRemoveDuplicates();

        //1.请从键盘随机输入10个整数保存到List中，并按倒序、从大到小的顺序显示出来
        //testTwo();

        //.请把学生名与考试分数录入到集合中，并按分数显示前三名成绩学员的名字。
        //testThree();

        //定义一个Collection接口类型的变量，引用一个Set集合的实现类，实现添加单个元素，添加另一个集合，删除元素，判
        // 断集合中是否包含一个元素，判断是否为空，清除集合，返回集合里元素的个数等常用操作。
        //testFour();

        //创建Set接口的实现类，添加10个以上的元素，通过Iterator遍历此集合元素。
        //创建Set接口的实现类，添加10个以上的元素，通过foreach遍历此集合元素。
        //testFive();

        //创建Set接口的实现类，添加10个以上的元素，要求能够排序。
        //testSex();

        //创建ArrayList实例化对象，添加10个以上的元素，在2号位插入一个元素，
        // 获得5号位元素，删除6号位元素，修改7号位的元素；
        //testSeven();

        //按要求完成如下操作
        //1.	生成10个随机数，值在100到200之间；
        //2.	将这十个数存入HashSet集合中（有可能集合的长度小于10）。
        //3.	将这个HashSet集合转换成ArrayList集合
        //4.	重新为ArrayList集合排序，按照从小到大的顺序；
        //5.	使用foreach遍历集合；
        //testAight();

        //以下代码的运行结果
        testNight();
    }

    private static void testNight() {
        Integer[] arr = new Integer[] {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        list.add(1);
        System.out.println(list.size()); //报错UnsupportedOperationException
    }

    private static void testAight() {
        Set set = new HashSet();
        for (int i = 0; i < 10; i++) {
            int a = (int)((Math.random()) * 100) + 1;
            System.out.println(a);
            set.add(a);
        }
        ArrayList arrayList = new ArrayList<>(set);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        for (Object o : arrayList) {
            System.out.println(o);
        }

    }

    private static void testSeven() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(list);
        list.add(1,333);
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.remove(5));
        list.set(6,123);
        System.out.println(list);
    }

    private static void testSex() {
        Set set = new TreeSet();
        set.add(11);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(22);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(1);
        for (Object o : set) {
            System.out.println(o);
        }
    }

    private static void testFive() {
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object o : set) {
            if (o instanceof Integer) {
                System.out.println(o);
            }
        }
    }

    private static void testFour() {
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);

        Set set1 = new HashSet();
        set1.add(1);
        set.addAll(set1);

        set.remove(2);

        System.out.println(set.contains(3));

        System.out.println(set.isEmpty());

        set.clear();

        System.out.println(set.size());
    }

    private static void testThree() {
        Set<Student> studentSet = new TreeSet<>();

        studentSet.add(new Student("zz", 60, 3));
        studentSet.add(new Student("yy", 90, 2));
        studentSet.add(new Student("uu", 80, 1));
        studentSet.add(new Student("tt", 67, 5));
        studentSet.add(new Student("qq", 31, 2));
        List<Student> studentList = new ArrayList<>(studentSet);
        for (int i = 0; i < 3; i++) {
            System.out.println(studentList.get(i));
        }
    }

    private static void testTwo() {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("请输入:");
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    private static void listRemoveDuplicates() {
        List list = new ArrayList();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("3");
        list = (List) list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }

    private static void setInterviewOne() {
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");
        set.add(p1);
        set.add(p2);
        p1.setName("CC");
        set.remove(p1);
        System.out.println(set);//p2
        set.add(new Person(1001, "CC"));
        System.out.println(set);
        set.add(new Person(1001, "AA"));
        System.out.println(set);
    }

    private static void interviewOne() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list.toString()); //[1,2]
    }

    private static void updateList(List list) {
        list.remove(2);
    }

    private static void testOne() {
        String[] arr = new String[5];
        for (String s : arr) {
            s = "z";
            System.out.println(s); // z z z z z
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//null null null null null
        }
    }
}
