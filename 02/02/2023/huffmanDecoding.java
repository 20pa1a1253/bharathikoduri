void decode(String s, Node root) {
        Node temp=root;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                temp=temp.left;
            }
            if(s.charAt(i)=='1'){
                temp=temp.right;
            }
            if(temp.left==null && temp.right==null){
                System.out.print(temp.data);
                temp=root;
            }
        }
        

       
    }
