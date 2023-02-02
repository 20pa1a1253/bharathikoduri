class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return l;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=1;i<=size;i++){
                TreeNode curr = q.poll();
                if(i==1){
                    l.add(curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return l;
    }
}
