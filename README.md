# Red-Black-Tree
implementation a modified red black tree named Balanced Red Black Tree
Balancing Conditions:
 If root is not BLACK.
 If two nodes in a row are RED.
 If the difference of depth between any two subtrees is more than 1.
 Balancing Transactions:
 If root = RED then Recolor(root).
 If node.uncle = RED then Recolor(node.parent, node.grandparent, node.uncle).
 If node.uncle = BLACK and node_positions = TRIANGLE then
Rotate(node.parent)
 If node.uncle = BLACK and node_positions = LINE then
Rotate(node.grandparent) and Recolor(node.parent, node.grandparent)
 If the height of the left and right subtrees of each node is more than 1 then
Rotate(node.grandgrandparent) and Recolor(node.grandparent,
node.grandgrandparent).
 After balancing process, difference between depth of the right and left tree at any part
of the tree becomes 0 or 1.
