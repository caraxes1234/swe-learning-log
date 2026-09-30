class Node{
     int value;
     Node next;
     Node(int value){
         this.value=value;
        this.next=null;
     }
}
public  class MyLinkedList{
      Node head;
      public  void insertAtFront(int value){
           Node node=new Node(value);
      
           node.next=head;
           head=node;
           return;
             
      }
    public  void printList(){
             Node ptr;
             if(head==null)return;
             ptr=head;
             while(ptr!=null){
                  System.out.print(ptr.value+"->");
                  ptr=ptr.next;

                   
             }
      }
      public static void main(String[] args) {
            MyLinkedList list=new MyLinkedList();
            list.insertAtFront(10);
            list.insertAtFront(20);
            list.insertAtFront(30);
            list.printList();
      }
}