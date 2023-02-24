import java.util.LinkedList;
import java.util.Stack;

public class BTree {
    private BNode root;
    Stack<Integer> stack = new Stack<Integer>();

    public BTree(BNode root) {
        this.root = root;
    }
    public BTree() {
        this.root = null;
    }

    public Stack<Integer> getStack() {
        return stack;
    }

    public void setStack(Stack<Integer> stack) {
        this.stack = stack;
    }

    public Stack<Integer> path(BNode root, Integer n){
        if (root == null) return null;
        if (n == root.getValue()){
            BNode aux1 = root;
            while (aux1 != null){
                stack.add(aux1.getValue());
                aux1 = aux1.getFather();
            }
        }

        path(root.getLeft(), n);
        path(root.getRight(), n);
        return stack;
    }
    public void add(int valeu){
        if (root == null) {
            BNode B = new BNode(valeu);
            root = B;
        }else {
            BNode aux = root;
            while (!aux.isleaf()){
                if (valeu< aux.getValue()){
                    if(aux.getLeft() != null) aux = aux.getLeft();
                    else break;
                }
                else{
                    if (aux.getRight() != null) aux = aux.getRight();
                    else break;
                }
            }
            BNode B = new BNode(valeu);
            B.setFather(aux);
            if (valeu< aux.getValue()) {
                aux.setLeft(B);
            }
            else {
                aux.setRight(B);
            }
        }
    }
    public void preOrder(BNode root){
        if (root == null) return;
        System.out.print(root.getValue() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    public void inOrder(BNode root){
        if (root == null) return;
        inOrder(root.getLeft());
        System.out.print(root.getValue() + " ");
        inOrder(root.getRight());
    }
    public void posOrder(BNode root){
        if (root == null) return;
        posOrder(root.getLeft());
        posOrder(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    public BNode getRoot() {
        return root;
    }
}
