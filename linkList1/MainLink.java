public class MainLink{
	
	Node head;

	public static void main(String[] args){
			MainLink mk = new MainLink();
			mk.createLinkList(5);
			mk.printLinkList();
			mk.reverseLinkList();
			mk.printLinkList();
	}
	
	public void createLinkList(int n){
		if ( n <= 1)
			return;
		int i = 1;
		Node temp = null;
		ev ( i <= n){
		Node node = new Node(i);
		if (head == null){
			head = node;
			temp = head;
		} else {
			temp.setNext(node);
			temp = node;
		}
			i++;
		}
	}
	
	public void printLinkList(){
		Node temp = head; 
		if ( temp == null)
				return;
		while ( temp != null){
			System.out.print(temp.getValue()+"->");
			temp = temp.getNext();
		}
		System.out.print("X");
	}
	
	public void reverseLinkList(){
			reverseLinkList(Node head);
	}
	
	public void reverseLinkList(Node curr){
		if ( curr == null ) 
			return null;
		if ( curr.getNext() == null){
			return;
		}		
		reverseLinkList(curr.getNext());
		curr.getNext().setNext(curr);
		curr.setNext(null);
		
	}	
}