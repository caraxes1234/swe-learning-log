ARRAYLIST

ArrayList is a Java data structure that solves the fixed-size limitation of normal arrays.

In a normal array, we have to specify the size when creating it, and its size cannot be changed dynamically.

ArrayList uses an internal array and automatically resizes it when it becomes full. It creates a new array, copies the old elements into it, and increases the capacity by about 1.5×.

For example:

10 → 15 → 22 → 33

Normally, add() takes O(1). During resizing, copying takes O(n), but resizing happens only occasionally. Since the capacity grows by 1.5×, the cost is spread across many additions, making add() amortized O(1).

If we increased the capacity by only +1, resizing would happen much more often, making repeated additions expensive.

Common methods: add(), size(), remove(), get().