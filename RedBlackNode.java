
public class RedBlackNode {
	RedBlackNode left, right;
    int element;
    int color;
    String name; 
    /* Constructor */
    public RedBlackNode(int theElement)
    {
        this( theElement, null, null,null );
    } 
    /* Constructor */
    public RedBlackNode(int theElement, RedBlackNode lt, RedBlackNode rt, String name)
    {
        left = lt;
        right = rt;
        element = theElement;
        color = 1;
        name=null;
}
}