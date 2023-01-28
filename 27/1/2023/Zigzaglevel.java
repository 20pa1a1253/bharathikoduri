class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return result ;
        }
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            List<Integer> l=new LinkedList<>();
            int size=q.size();
            for(int i=1;i<=size;i++){
                TreeNode curr=q.poll();
                if(flag==true){
                    l.add(curr.val);
                }
                else{
                    l.add(0,curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            flag=(flag)?false:true;
            result.add(l);
        }
        return result;
    }
}
