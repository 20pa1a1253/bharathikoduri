class Solution
{
    Node root;
	public  ArrayList<Integer> list = new ArrayList<>();
	public void leftview(Node node){
		if(node==null){
			return ;
		}
		if(node.left!=null){
		    list.add(node.data);
			leftview(node.left);
		}
		else if(node.right!=null){
		    list.add(node.data);
		    leftview(node.right);
		}
		//return list;
	}
	public void leaves(Node node){
	    if(node==null){
	        return ;
	    }
	    leaves(node.left);
	    if(node.left==null&&node.right==null){
	        list.add(node.data);
	        
	    }
	    leaves(node.right);
	}
	public void rightvue(Node node){
	    if(node==null){
	        return ;
	    }
	    if(node.right!=null){
	        list.add(node.data);
	        rightvue(node.right);
	    }
	    if(node.left!=null){
	        list.add(node.data);
	        rightvue(node.left);
	    }
	    //return list;
	}
	ArrayList <Integer> boundary(Node node)
	{
	    list.add(node.data);
	   if(node==null){
	       return list;
	   }
	   //list.add(node.data);
	   leftview(node.left);
	   leaves(node.left);
	   leaves(node.right);
	   rightvue(node.right);
	   return list;
	}
	
}
