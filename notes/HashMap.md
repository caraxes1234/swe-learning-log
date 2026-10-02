# HASHMAP

HashMap is a data structure that stores data in **key-value pairs**.

```text
HashMap(key, value)
```

It is useful when we want to quickly find a value using its key.

We add data using `put()` and get data using `get()`.

Both `put()` and `get()` are **O(1) on average**.

When we add a key, a **hash function** converts the key into a number and uses it to decide which **bucket** to store the data in.

Sometimes two keys can end up in the same bucket. This is called a **collision**.

To handle collisions, the data can be stored in a **linked list** inside that bucket. If the list becomes too large, Java can convert it into a **Red-Black tree** to make searching faster.

So basically:

```text
Key → Hash function → Bucket → Value
                         ↓
                    Collision?
                         ↓
                  Linked List
                         ↓
                  Red-Black Tree
```
