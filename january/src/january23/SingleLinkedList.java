package january23;

public class SingleLinkedList<T> {
    public Node<T> head = null;
    
    public class Node<T> {
        T data;
        Node<T> next = null; //포인터 
        
        public Node(T data) {
            this.data = data;
        }
    }
    
    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next; //현재 노드를 그 다음 노드로 바꿔라
            }
            node.next = new Node<T>(data);
             // 포인터에다가 현재 추가하는 노드에 연결
        }
    }
    
    public void printAll() {
    	if(head!=null) {
    		Node<T> node = this.head;
    		System.out.println(node.data);
    		while(node.next != null) {
    			node = node.next;
    			System.out.println(node.data);
    		}
    	}
    }
   public static void main(String[] args) {
	SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
	MyLinkedList.addNode(1);
	MyLinkedList.addNode(1);
	MyLinkedList.addNode(1);

	MyLinkedList.printAll();
   }
}