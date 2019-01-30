public class BSTSimpleNode
{
   int value;//we will use integers for our simple case
   BSTSimpleNode left;//the branch that contains the lesser values
   BSTSimpleNode right;//the branch that contains the greater values	

   public BSTSimpleNode(int nodeVal)
   {
      value=nodeVal;
      left=null;
      right=null;
   }
   public static void add(BSTSimpleNode root, int newValue)
   {
      if(root.value!=newValue)
         add(root, new BSTSimpleNode(newValue));
   }
   public static void add(BSTSimpleNode root, BSTSimpleNode newNode)
   {
      if(newNode.value>root.value)
         if(root.right!=null)
            add(root.right, newNode);
         else
            root.right=newNode;
      else
         if(newNode.value<root.value)
            if(root.left!=null)
               add(root.left, newNode);
            else
               root.left=newNode;
   }
   public static void displayTreePreOrder(BSTSimpleNode root)
   {
      if(root!=null)
      {
         System.out.println("Current node value equals="+root.value);
         displayTreePreOrder(root.left);
         displayTreePreOrder(root.right);
      }
   }
   public static void displayTreeInOrder(BSTSimpleNode root)
   {
      if(root!=null)
      {
         displayTreeInOrder(root.left);
         System.out.println("Current node value equals="+root.value);
         displayTreeInOrder(root.right);
      }
   }
   public static void displayTreePostOrder(BSTSimpleNode root)
   {
      if(root!=null)
      {
         displayTreePostOrder(root.left);
         displayTreePostOrder(root.right);
         System.out.println("Current node value equals="+root.value);
      }
   }
   public static void main(String[] args)
   {
      BSTSimpleNode theRoot, theRoot2;
      int[] valuesToAdd={1, 18, 10, 4, 6, 8, 9, 15, 3, 4, 20};
      theRoot=new BSTSimpleNode(valuesToAdd[0]);
      for(int i=1; i<valuesToAdd.length; i++)
         BSTSimpleNode.add(theRoot, new BSTSimpleNode(valuesToAdd[i]));
      theRoot2=new BSTSimpleNode(valuesToAdd[0]);
      for(int i=1; i<valuesToAdd.length; i++)
         BSTSimpleNode.add(theRoot2, valuesToAdd[i]);
      System.out.println("Tree 1:");
      System.out.println();
      System.out.println("Pre-order:");
      System.out.println();
      BSTSimpleNode.displayTreePreOrder(theRoot);
      System.out.println();
      System.out.println("In order:");
      System.out.println();
      BSTSimpleNode.displayTreeInOrder(theRoot);
      System.out.println();
      System.out.println("Post-order:");
      System.out.println();
      BSTSimpleNode.displayTreePostOrder(theRoot);
      System.out.println();
      
      System.out.println("Tree 2:");
      System.out.println();
      System.out.println("Pre-order:");
      System.out.println();
      BSTSimpleNode.displayTreePreOrder(theRoot2);
      System.out.println();
      System.out.println("In order:");
      System.out.println();
      BSTSimpleNode.displayTreeInOrder(theRoot2);
      System.out.println();
      System.out.println("Post-order:");
      System.out.println();
      BSTSimpleNode.displayTreePostOrder(theRoot2);
   }
}