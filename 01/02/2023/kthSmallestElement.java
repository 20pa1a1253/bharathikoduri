class Solution {
     public void inorder(TreeNode root,ArrayList<Integer>list){
        if(root==null){
            return ;
        }
        inorder(root.left,list);
        //System.out.println(root.val);
        list.add(root.val);
        inorder(root.right,list);        
        
        
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        inorder(root,list);
        //retrurn list;
        return list.get(k-1);
            
            
        

    }
}
