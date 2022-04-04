class binarySearchtree {
    public static void main(String[] args) {
        treenode root=new treenode(20);
        treenode n1=new treenode(10);
        treenode n2=new treenode(30);
        root.left=n1;
        root.right=n2;
        treenode n3=new treenode(5);
        treenode n4=new treenode(15);
        n1.left=n3;
        n1.right=n4;
        treenode n5=new treenode(25);
        treenode n6=new treenode(35);
        n2.left=n5;
        n2.right=n6;
        System.out.println("Preorder traversal");
        preorder(root);
        System.out.println("Inorder traversal");
        inorder(root);
        System.out.println("Postorder traversal");
        postorder(root);


    }
    public static void preorder(treenode root){
        if(root==null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(treenode root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void postorder(treenode root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static treenode insert(treenode root, int data){
        treenode newnode=new treenode(data);
        if(root==null){
            root=newnode;
            return root;
        }
        if(root.data>newnode.data){
            if(root.left==null)
                root.left=newnode;
            else
                insert(root.left,data);
        }
        else{
            if(root.right==null)
                root.right=newnode;
            else
                insert(root.right,data);
        }
        return root;
    }
}
class treenode{
    int data;
    treenode left;
    treenode right;

    public treenode(int data) {
        this.data = data;
    }
}
