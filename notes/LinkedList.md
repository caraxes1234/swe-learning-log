LINKED LIST

Linked List is a linear data structure that solves some of the major limitations of arrays, but it compromises on fast element access.

In a Linked List, inserting and removing elements from the front is O(1), because we only need to change the links. In an array, inserting or removing from the front requires shifting the other elements, so it takes O(n).

However, accessing an element in an array using its index, such as `arr[2]`, is O(1). In a Linked List, accessing an element takes O(n) because we have to traverse the nodes one by one from the beginning.

Unlike arrays, Linked List nodes do not need to be stored next to each other in memory. Each node contains:

`value + next`

`value` stores the actual data, while `next` stores a reference/address to the next node.

So, Linked List trades **fast random access** for **efficient insertion and removal**.
