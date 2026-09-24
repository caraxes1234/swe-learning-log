#stack vs heap 

Stack: Each method call gets a stack frame. Local variables, parameters, and object references are stored there. When the method finishes, its stack frame is removed automatically.

Heap: Objects and arrays created at runtime are generally stored in the heap. They can remain after the method that created them finishes, as long as they are reachable. In Java, the Garbage Collector automatically reclaims heap objects that are no longer reachable