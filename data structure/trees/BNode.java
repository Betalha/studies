public class BNode {
    private int value;
    private BNode left, right, father;


    BNode(int value, BNode left, BNode right){
        this.value = value;
        this.left = left;
        this.right = right;
        father = null;
    }
    BNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
        father = null;
    }

    public BNode getFather() {
        return father;
    }

    public void setFather(BNode father) {
        this.father = father;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BNode getLeft() {
        return left;
    }

    public void setLeft(BNode left) {
        this.left = left;
    }

    public BNode getRight() {
        return right;
    }

    public void setRight(BNode right) {
        this.right = right;
    }

    public boolean isleaf(){
        if (this.right == null && this.left == null) return true;
        else return false;
    }
}
