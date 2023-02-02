 class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    static class pair{
        int data;
        Node node;
        public pair(int data,Node node){
            this.node=node;
            this.data=data;
        }
	public static void topView(Node root) {
        if(root==null){
            return;
        }
        Queue<pair> q=new LinkedList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            pair curr=q.poll();
            if(!map.containsKey(curr.data)){
                map.put(curr.data,curr.node.data);
            }
            if(curr.node.left!=null){
                q.add(new pair(curr.data-1,curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new pair(curr.data+1,curr.node.right));
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
      
      
    }
