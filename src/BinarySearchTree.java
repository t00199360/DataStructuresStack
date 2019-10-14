/**
   This class implements a binary search tree whose
   nodes hold objects that implement the Comparable
   interface.
*/

public class BinarySearchTree<E extends Comparable<E>> {

   private Node root;

   private class Node {
      public E data;
      public Node left;
      public Node right;
   }

   public BinarySearchTree() {
      root = null;
   }

   public void insert(E e) {
      Node newNode = new Node();
      newNode.data = e;
      newNode.left = null;
      newNode.right = null;
      if (root == null)
         root = newNode;
      else
         insertSub(root, newNode);
   }

   private void insertSub(Node node, Node newNode) {
      int result = node.data.compareTo(newNode.data);
      if (result >= 0) {
         //go left
         if (node.left == null) {
            node.left = newNode;
         } else {
            insertSub(node.left, newNode);
         }
      } else {
         //go right
         if (node.right == null) {
            node.right = newNode;
         } else {
            insertSub(node.right, newNode);
         }
      }
   }

   public boolean recContain(E element)
   {
      Node node  = root;

      if(recursiveContain(node, element))
      {
         return true;
      }

      else{
         return false;
   }
   }

   public boolean recursiveContain(Node node, E element)
   {
      if(node == null)
      {
         return false;
      }
      int result = node.data.compareTo(element);
      boolean found = false;
      if (result == 0)
      {
         found = true;
      }
      else if (result > 0)
      {
         if (node.left == null)
         {
            found = false;
         }
         else {
            found = recursiveContain(node.left, element);
         }

      }
      else
      {
         if(node.right == null)
         {
            found = false;
         }
         else {
            found = recursiveContain(node.right, element);
         }
      }
      return found;
   }



   public boolean contains(E element)
   {
      Node node = root;

      while(node!= null) {


         int result = node.data.compareTo(element);
         if (result == 0) {
            return true;
         }
         if (result > 0) {
               node = node.left;

         }

         if (result < 0) {
               node = node.right;

         }
      }
      return false;
   }

}