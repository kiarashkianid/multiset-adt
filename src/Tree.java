public class Tree<T> {
    private T root;
    private List<Tree<T>> subtrees;

    public Tree(T root) {
        this.root = root;
        this.subtrees = new ArrayList<>();
    }

    public Tree(T root, List<Tree<T>> subtrees) {
        this.root = root;
        this.subtrees = new ArrayList<>(subtrees);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            int size = 1;  // count the root
            for (Tree<T> subtree : subtrees) {
                size += subtree.size();
            }
            return size;
        }
    }