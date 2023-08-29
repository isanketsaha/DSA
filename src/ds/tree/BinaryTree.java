package ds.tree;

import ds.common.TreeFormatter;
import ds.common.TreeNode;

public class BinaryTree<T> {

    TreeNode<T> root = null;

    BinaryTree(T data){
        this.root = new TreeNode<>(data, null, null);
    }

    TreeNode<T> addLeftNode(T data, TreeNode<T> root) {
        TreeNode<T> node = new TreeNode<>(data, null, null);
        root.setLeftNode(node);
        return node;
    }

    TreeNode<T> addRightNode(T data, TreeNode<T> root) {
        TreeNode<T> node = new TreeNode<>(data, null, null);
        root.setRightNode(node);
        return node;
    }



    public TreeNode<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        TreeFormatter formatter = new TreeFormatter();
        return formatter.topDown(this.getRoot());
    }

  static BinaryTree<Integer> constructSimpleTree(){
       BinaryTree<Integer> tree = new BinaryTree<>(1);
       TreeNode<Integer> left = tree.addLeftNode(2, tree.getRoot());
       TreeNode<Integer> right = tree.addRightNode(3, tree.getRoot());
       tree.addLeftNode(4, left);
       tree.addRightNode(5, left);
       tree.addLeftNode(6, right);
       tree.addRightNode(7, right);
       return tree;
    }

    public static void main(String[] args) {

    }

}
