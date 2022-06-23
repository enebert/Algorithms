# Heap Data Structure

* A binary tree that is not necessarily full in the last layer.
* Each parent has a key that is larger than any node.

Here's a definition from Sedgewick:
**Defn.** A tree is *heap-ordered* if the key in each node is larger than or equal
to all of the node's children.

**Remark:** This is what Cormen, et. al. call a *max-heap*. One could also put the
smallest key at the root of the tree for a *min-heap*.

One can use an array to hold a complete binary tree. Using an array is eaiser than
using the nodes of a linked graph. Each node would have to contain links to its parent
and two  children. On the other hand, using arrays one needs to know the heap size before hand.
When using an array we have the following setup:

* **Parent:** $\lfloor \tfrac{i}{2} \rfloor$.
* **Left:** $2i$.
* **Right:** $2i+1$

**Heapifying:** Traversing the heap to "fix" it and make sure that everything is
in its proper order. In a priority queue, one does this when the priority of some
node is increased or decreased.

* If a node's key is larger than a parent's key we exchange the keys of the node and the parent. Keep doing this until it is correct or the root node is reached.
* If a parent's key is smaller than a node's key we do an exchange of these keys and continue until the heap is in the correct order.

1. Bottom-up heapify:

     * Start at a node in the last level of the heap.
     * If the node's key is in the correct place, move up the heap.
     * If the node's key is larger than the parent exchange.

2. Top-Down heapify:

     * Start at node $k$.
     * If the node's key is in the correct place continue to the next node.
     * If the node's key is larger than it's parent exchange.

Starting at any node in the heap, one can look at the subtree as a subheap and
apply each of these algorithms to the sub-structure to put it in order.
