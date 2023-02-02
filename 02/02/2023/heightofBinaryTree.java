public static int height(Node root) {
      	//int sum=0;
        if(root==null){
            return -1;
        }        
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
        // Write your code here.
        
    }
