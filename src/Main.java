public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
            System.out.println(linkedList.getSize());
        }

        linkedList.add(2, 666);
        System.out.println(linkedList);
        System.out.println(linkedList.getSize());

        linkedList.remove(2);
        System.out.println(linkedList);
        System.out.println(linkedList.getSize());
        linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println(linkedList.getSize());
//        linkedList.removeLast();
//        System.out.println(linkedList);
    }
}
