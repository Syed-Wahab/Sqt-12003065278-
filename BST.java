package bst;

/**
 *
 * @author Syed Wahab Hussain
 */
class node<T>
{
   T data;
   node head,left,right;
   node(T ndata){
       head=left=right=null;
       data=ndata;
   }
   
}
class BSTs<T extends Comparable<T>> {
    public node<T> root;
    BSTs(){
        root=null;
    };
    void postorder()
    {
        printpostOrder(root);
            System.out.println();
    };
    private void printpostOrder(node<T> nnode) {
    if (nnode == null){
        return;
    }
    printpostOrder(nnode.right);
    printpostOrder(nnode.left);
    System.out.print(nnode.data);
};
    
    void inorder()
    {
        printInOrder(root);
            System.out.println();
    };
    private void printInOrder(node<T> nnode) {
    if (nnode == null){
        return;
    }
    printInOrder(nnode.left);
    System.out.print(nnode.data);
    printInOrder(nnode.right);
};
    void preorder(){
    printPreOrder(root);
    System.out.println();
    }

private void printPreOrder(node<T> nnode) {
    if (nnode == null){
        return;
    }
    System.out.print(nnode.data);
    printPreOrder(nnode.left);
    printPreOrder(nnode.right);
};
    boolean isEmpty()
    {
        if(root==null)
            return true;
        else
            return false;
    };
    
    boolean searchNode(node<T> nnode, T ndata)
    {
        int n;
        n= nnode.data .compareTo(ndata);
        if(n==0)
            return true;
        else
            if(nnode.left!=null){
            searchNode(nnode.left,ndata);}
            if(nnode.right!=null){
            searchNode(nnode.right,ndata);}
            return false;
    };
    public void insertNode (T data)
    {
        while(true){
        if (root==null)
        {
            root =new node(data);
            break;
        }
        else
        {
            int n=0;
            n= data .compareTo(root.data);
            if ((n==1)&&(root.left==null))
            {
                root.left =new node(data);
                break;
            }
            else if((n==-1)&&(root.right==null))
            {
                root.right = new node(data);
                break;
            }
            else break;
        }
        
        }
    };
        node<T> Dsearch(node<T> nnode, T data)
    {
        int n;
        n= nnode.data .compareTo(data);
        if(n==0)
            return nnode;
        else
            searchNode(nnode.left,data);
            searchNode(nnode.right,data);
            return null;
    };

    void deleteNode(T data){
            node<T> snode= Dsearch(root,data);
            if (snode==null)
                return;
            node<T> temp2 = snode;
            if((snode.right==null)||(snode.left==null))
                root=null;
            else
            {
                while(temp2.left!=null){
                    
                    temp2=temp2.left;
                }
                temp2.right=snode.right;
                temp2.left=snode.left;
                snode=null;
            }
           
    };
    void printBST(){
        printfun(root);
        System.out.println();
    };
    void printfun(node<T> nroot){
        if(nroot!=null){
        System.out.print(nroot.data);
        printfun(nroot.right);
        printfun(nroot.left);
        return;
    }
        else return;
    };
    
}

public class BST{
    


    public static void main(String[] args) {
        // TODO code application logic here
        BSTs noden = new BSTs();
        Integer n=10;
        
        noden.insertNode(n-2);
        noden.insertNode(n-1);
        noden.insertNode(n-3);
        
        noden.preorder();
        noden.inorder();
        noden.postorder();
        System.out.println(noden.searchNode(noden.root,8));
        noden.printBST();
        noden.deleteNode(10);
        noden.printBST();
        System.out.println(noden.isEmpty());
    }
};

