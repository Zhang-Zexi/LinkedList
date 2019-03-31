public class LinkedList<E> {

    private  class Node {
        private E e;
        private Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyNode;
    private int size;

    public LinkedList() {
        dummyNode = new Node();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, E e) {

        if(index < 0 || index > size) {
            throw new IllegalArgumentException("add Exception");
        }

        if(index == 0) {
            addFirst(e);
        }else {
            Node prev = dummyNode;
            for(int i = 0; i < index;i ++) {
                prev = prev.next;
            }
            prev.next = new Node(e, prev.next);
            size ++;
        }
    }

    public void addFirst(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;
        add(0 ,e);
        size ++;
    }

    public void addLast(E e) {
        add(size, e);
    }




}
