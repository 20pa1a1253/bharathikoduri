class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return result ;
        }
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l=new LinkedList<>();
            int size=q.size();
            for(int i=1;i<=size;i++){
                TreeNode curr=q.poll();
                l.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            result.add(l);
        }
        return result;
    }
}
