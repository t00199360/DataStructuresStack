import org.w3c.dom.Node;

public class MainBinSearchTree
{
    public static void main(String[] args) {
        BinarySearchTree searchTree = new BinarySearchTree();


        searchTree.insert("Jan");
        searchTree.insert("Feb");
        searchTree.insert("Mar");

        if(searchTree.contains("deb"))
        {
            System.out.println("FOUND ELEMENT");
        }else
        {
            System.out.println("NOT FOUND");
        }

        if(searchTree.recContain("hghghMar"))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("NOT FOUND");
        }

    }
}
