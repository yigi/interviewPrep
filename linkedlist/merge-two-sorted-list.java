class Main {
    public static void main(String[] args) {


     
        Node head1 = newNode(1);
        head1.next = newNode(3);
        head1.next.next = newNode(5);
        // 1.3.5 LinkedList created
 
        Node head2 = newNode(0);
        head2.next = newNode(2);
        head2.next.next = newNode(2);
        // 0.2 LinkedList created

        Node mergedhead = merge(head1, head2);
        printList(mergedhead);
}        


        public static Node newNode(int key)
        {
            Node temp = new Node();
            temp.data = key;
            temp.next = null;
            return temp;
        }

        public static class Node {
            int data;
            Node next;
        };

        public static Node merge(Node node1, Node node2) {

            if (node1 == null)
                return node2;
            if (node2 == null)
                return node1;
            
            if(node1.data < node2.data)
            {
                node1.next = merge(node1.next, node2);
                return node1;
            }
            else {
                node2.next = merge(node1, node2.next);
                return node2;
            }
        };

        static void printList(Node node)
        {
            while (node != null) {
                System.out.printf("%d ", node.data);
                node = node.next;
            }
        }
   }