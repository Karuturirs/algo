package  com.prepare.algo.ds;

public class LinkedList<t>{

    private Node node;
    private int size;

    public LinkedList(){
    }

    /***
     * Add element at end of the linked list
     * @param x
     */
    public void put(t x) {
        if (this.node == null) {
            this.node = new Node(x);
            this.size = this.size + 1;
        } else {
            Node n = this.node;
            for (int i = 0; i < size; i++) {
                if (null == n.getNode()) {
                    Node<t> temp = new Node(x);
                    n.setNode(temp);
                    this.size = this.size+1;
                } else {
                    n = n.getNode();
                }
            }
        }
    }

    /***
     *
     * @param x the data that needs to be added to list
     * @param i the position in which the value x needs to be added (0 to size-1 of the list)
     * @return
     */
    public boolean add(t x, int i){
        int j=0;
        Node n =this.node;
        Node prv = this.node;
        while(j<size && i<size){
            if(j==i){
                Node<t> nd = new Node();
                nd.setData(x);
                nd.setNode(n);
                prv.setNode(nd);
                this.size = this.size+1;
            }else{
                prv = n;
                n = n.getNode();
            }
            j++;
        }

        return false;
    }

    /***
     * Removes the data in the linked list
     * @param x
     * @return
     */
    public boolean remove(t x){
        Node<t> n = node;
        Node<t> temp = n;
        for(int i=0; i<=size-1; i++) {
            if (x.equals(n.getData())) {
                temp.setNode(n.getNode());
                this.size = this.size-1;
                return true;
            } else {
                temp = n;
                n = n.getNode();

            }
        }
        return false;
    }

    /***
     * Fetches the ith element in the linked lists
     * @param i index of the linked list starting from 1 to size of the list
     * @return
     */
    public t get(int i) {
        Node<t> n = this.node;
        for (int x = 0; x < i && x < size && size != 0; x++) {
            if (x == i) {
                return n.getData();
            } else {
                n = n.getNode();
            }
        }
        return null;
    }

    /***
     * Fetches the size of the linked list
     * @return
     */
    public int size(){
        return this.size;
    }


}

class Node<t>{
    private t data;
    private Node node;

    public Node(){

    }

    public Node(t data){
        this.data=data;
    }


    public Node(t data, Node node){
        this.data = data;
        this.node = node;
    }

    public t getData(){
        return this.data;
    }

    public void setData(t data){
        this.data = data;
    }

    public Node getNode(){
        return this.node;
    }

    public void setNode(Node node){
        this.node = node;
    }

}
