class BSTIterator {
    private Stack<TreeNode>stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);       
    }   
    public int next() {
        TreeNode node = stack.pop();
        pushAll(node.right);
        return node.val;
        
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
        
    }
    public void pushAll(TreeNode t){
        while(t!=null)
        {
            stack.push(t);
            t=t.left;
        }
    }
}
