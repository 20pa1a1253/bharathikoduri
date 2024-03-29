class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) {
            return root;
        }
        if(root.val==key) {
            // no child
            if(root.left==null && root.right==null) {
                return null;
            } else if(root.right==null || root.left==null) {
                // 1 child
                return root.right==null?root.left:root.right;
            } else {
                // both child. find left most node of right child.
                TreeNode node =root;
                node=node.right;
                while(node.left!=null) {
                    node=node.left;
                }
                //update value
                root.val=node.val;
                //now delete the leaf node of right child.
                root.right=deleteNode(root.right,root.val);
            }
        } else if(root.val<key){
             root.right=deleteNode(root.right,key);
        } else {
             root.left=deleteNode(root.left,key);
        }
        return root;
    }
    
}
