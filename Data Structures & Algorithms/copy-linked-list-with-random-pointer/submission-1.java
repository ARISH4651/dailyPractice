/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node cur=head;
        Node prev=null;
        Node res=null;
        HashMap<Node,Node>map=new HashMap<>();
        while(cur!=null){
            Node newNode=new Node(cur.val);
            map.put(cur,newNode);
            if(prev==null) res=newNode;
            else prev.next=newNode;
             
             prev=newNode;
             cur=cur.next;
        }
        cur=head;
        Node temp=res;
        while(cur!=null){
            temp.random=map.get(cur.random);

            temp=temp.next;
            cur=cur.next;
        }
        return res;
    }
}
