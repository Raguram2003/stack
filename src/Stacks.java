
class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
    }
}

class Stk{
    Node top;
    int height;

    Stk(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    void print(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.value+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void push(int value){
        Node newNode = new Node(value);
        if(height == 0 ){top = newNode;}
        else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    Node pop(){
        if(height == 0 ){return null;}
        Node temp = top;
        top = top.next;
        temp.next = null;
        return temp;
    }
}


public class Stacks {
    public static void main(String[] args) {
        Stk stc = new Stk(23);
        stc.print();
        System.out.println("-------------------");
        stc.push(67);
        stc.push(58);
        stc.push(357);
        stc.print();
        System.out.println("-------------------");
        stc.pop();
        stc.print();
    }
}
