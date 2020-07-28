class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len=inorder.length;
        return Helper(inorder,postorder,0,len-1,0,len-1);
        
    }
    
  static  TreeNode Helper(int[] inorder,int[]postorder,int instart,int inend,int poststart,int postend)
    { 
      if(instart>inend)
          return null;
      
      
      
      int rootval=postorder[postend];
        TreeNode root=new TreeNode(rootval);
        int rootindex=instart;
        for(;rootindex<=inend;rootindex++)
        {
            if(inorder[rootindex]==rootval)
                break;
        }
        int leftheight=rootindex-instart;
        int rightheight=inend-rootindex;
           
        
        root.left=Solution.Helper( inorder, postorder,instart,rootindex-1,poststart,poststart+leftheight-1);
         root.right=Solution.Helper( inorder, postorder,rootindex+1,inend,postend-rightheight,postend-1);
        
        return root;
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}