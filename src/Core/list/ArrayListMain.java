package Core.list;

import Core.list.core.GBList;
import Core.list.core.Impl.GBArrayList;
import Core.list.core.Impl.MyLinkedList;

public class ArrayListMain {
    public static void main(String[] args) {
      //  GBList<Integer>list = new GBArrayList<>();
        //list.add (3);
       // list.add (5);
       // list.add (6);

       // System.out.println(list);

       // list.remove(2);

       // System.out.println(list);

       // System.out.println(list.size());
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.addFirst(22);
        linkedList.addFirst(4);
        linkedList.addFirst(58);
        linkedList.addLast(9);
        linkedList.addLast(11);

        System.out.println(linkedList);
        System.out.println(linkedList.get(1));

        linkedList.remove(2);

        System.out.println(linkedList);
        System.out.println(linkedList.size());
    }
}


