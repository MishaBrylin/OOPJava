public class HW02 {

    public static void main(String[] args) {
        RedBlackTree<Integer> tree = new RedBlackTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.printTree();
    }

    public static class RedBlackTree<T extends Comparable<T>> {
        private static final boolean RED = true;
        private static final boolean BLACK = false;

        private Node root;

        private class Node {
            T value;
            Node left, right;
            boolean color;

            Node(T value, boolean color) {
                this.value = value;
                this.color = color;
            }
        }

        public void add(T value) {
            root = add(root, value);
            root.color = BLACK;
        }

        private Node add(Node node, T value) {
            if (node == null) return new Node(value, RED);

            int cmp = value.compareTo(node.value);
            if (cmp < 0) node.left = add(node.left, value);
            else if (cmp > 0) node.right = add(node.right, value);
            else node.value = value;

            if (isRed(node.right) && !isRed(node.left)) node = rotateLeft(node);
            if (isRed(node.left) && isRed(node.left.left)) node = rotateRight(node);
            if (isRed(node.left) && isRed(node.right)) flipColors(node);

            return node;
        }

        private boolean isRed(Node node) {
            if (node == null) return false;
            return node.color == RED;
        }

        private Node rotateLeft(Node node) {
            Node x = node.right;
            node.right = x.left;
            x.left = node;
            x.color = node.color;
            node.color = RED;
            return x;
        }

        private Node rotateRight(Node node) {
            Node x = node.left;
            node.left = x.right;
            x.right = node;
            x.color = node.color;
            node.color = RED;
            return x;
        }

        private void flipColors(Node node) {
            node.color = RED;
            node.left.color = BLACK;
            node.right.color = BLACK;
        }

        public void printTree() {
            printTree(root, 0);
        }

        private void printTree(Node node, int level) {
            if (node != null) {
                printTree(node.right, level + 1);
                for (int i = 0; i < level; i++) System.out.print("    ");
                System.out.println(node.value + " " + (node.color ? "RED" : "BLACK"));
                printTree(node.left, level + 1);
            }
        }
    }



}
