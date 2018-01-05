
public static int getHeight(Node root){
      int heightLeft = 0;
      int heightRight = 0;
      if(root.left !=null){
           heightLeft = 1+ getHeight(root.left);
      }
      if(root.right != null){
           heightRight = 1+  getHeight(root.right);     
      }
      if(heightLeft> heightRight){
          return heightLeft;
      }else{
          return heightRight;
      }
    }
