public class BinaryTree {
    public static Integer getLeftChild(String[] tree, int index){
        int idx = index*2+1;
        if (idx >= tree.length) {
            return null;
        }

        return idx;
    }
    public static Integer getRightChild(String[] tree, int index){
        int idx = index*2+2;
        if (idx >= tree.length) {
            return null;
        }

        return idx;
    }
    public static void inOrder(String[] tree, int index){
        Integer left = getLeftChild(tree, index),
        right = getRightChild(tree,index);

        if(left != null){
            inOrder(tree,left);
        }

        System.out.println(tree[index] + " ");

        if(right!= null)
            inOrder(tree,right);

    }

    public static void main(String[] args) {
        String[] names = {
                "Július", "Eugen", "Vladislav",
                "Tamara", "Sabina", "Tomáš",
                "Matej", "Daniela", "Igor"
        };

        inOrder(names,0);
    }
}