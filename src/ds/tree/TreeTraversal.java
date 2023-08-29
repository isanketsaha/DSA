package ds.tree;


import ds.common.Node;
import ds.common.TreeNode;
import ds.stack.Stack;

interface Traversal<T> {
    void recursionTraversal(TreeNode<T> root);

    void iterativeTraversal(TreeNode<T> root);
}

public class TreeTraversal<T> {

    PreOrderTraversal<T> constructPreOrder() {
        return new PreOrderTraversal<>();
    }

    InorderTraversal<T> constructInOrder() {
        return new InorderTraversal<>();
    }

    PostorderTraversal<T> constructPostOrder() {
        return new PostorderTraversal<>();
    }

    public static void main(String[] args) {
        TreeTraversal<Integer> traversal = new TreeTraversal<>();
        traversal.constructPostOrder()
                .recursionTraversal(BinaryTree.constructSimpleTree()
                        .getRoot());
    }

    /**
     * This class wil travers a tree based on Preorder method. The sequence of traversal is from Root to Left to right Node
     *
     * @param <E>
     */
    class PreOrderTraversal<E> implements Traversal<E> {

        public void recursionTraversal(TreeNode<E> root) {
            if (root == null)
                return;
            System.out.print(root.getData() + " ");
            recursionTraversal(root.getLeftNode());
            recursionTraversal(root.getRightNode());
        }

        public void iterativeTraversal(TreeNode<E> root) {
            Stack<TreeNode<E>> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode<E> pop = stack.pop()
                        .getData();
                System.out.print(pop.getData() + " ");
                if (pop.getRightNode() != null)
                    stack.push(pop.getRightNode());
                if (pop.getLeftNode() != null)
                    stack.push(pop.getLeftNode());
            }
        }
    }

    /**
     * This traversal starts from left node to root and then to right node. _____ L D R ___
     *
     * @param <E>
     */
    class InorderTraversal<E> implements Traversal<E> {

        @Override
        public void recursionTraversal(TreeNode<E> root) {
            if (root == null)
                return;
            recursionTraversal(root.getLeftNode());
            System.out.print(root.getData() + " ");
            recursionTraversal(root.getRightNode());
        }

        @Override
        public void iterativeTraversal(TreeNode<E> root) {
            Stack<TreeNode<E>> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                /* We have to traverse till the end of left node and once
                 done we can print node and then branch to right side. */
                if (root.getLeftNode() != null) {
                    root = root.getLeftNode();
                    stack.push(root);
                } else {
                    TreeNode<E> pop = stack.pop()
                            .getData();
                    System.out.println(pop.getData());
                    if (pop.getRightNode() != null) {
                        root = pop.getRightNode();
                        stack.push(root);
                    }
                }
            }
        }
    }

    class PostorderTraversal<E> implements Traversal<E> {

        @Override
        public void recursionTraversal(TreeNode<E> root) {
            if (root == null)
                return;
            recursionTraversal(root.getLeftNode());
            recursionTraversal(root.getRightNode());
            System.out.println(root.getData());
        }

        @Override
        public void iterativeTraversal(TreeNode<E> root) {

        }
    }
}
