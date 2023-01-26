/* inodertraversal*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode root,ArrayList<Integer>list){
        if(root==null){
            return ;
        }
        inorder(root.left,list);
        //System.out.println(root.val);
        list.add(root.val);
        inorder(root.right,list);        
        
        
    }
}
