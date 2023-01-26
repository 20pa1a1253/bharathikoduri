class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        postorder(root,list);
        return list;
    }
    public void postorder(TreeNode root,ArrayList<Integer>list){
        if(root==null){
            return ;
        }
        postorder(root.left,list);
        //System.out.println(root.val);
        postorder(root.right,list); 
        list.add(root.val);       
        
        
    }
}
