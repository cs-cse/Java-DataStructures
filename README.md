# Java-DataStructures

A data structure is a particular way of organizing and storing data in a computer so that it can be accessed and modified efficiently. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data.This repository contains **Java** based solutions to many popular data structures from coding interviews pov.

### 🗃️ [Arrays](https://github.com/cs-cse/Java-DataStructures/tree/master/dsa-Arrays-Strings/src)
* An array is a collection of items stored at contiguous memory locations. The idea is to store multiple items of the same type together. 
* For simplicity, we can think of an array as a fleet of stairs where on each step is placed a value (let’s say one of your friends). Here, you can identify the location of any of your friends by simply knowing the count of the step they are on. 
* In Java, array is an object of a dynamically generated class. Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces. We can store primitive values or objects in an array in Java. Like C/C++, we can also create single dimentional or multidimentional arrays in Java.Moreover, Java provides the feature of anonymous arrays which is not available in C/C++.

### ⛓️ [Linked Lists](https://github.com/cs-cse/Java-DataStructures/tree/master/dsa-LinkedList/src)
* A linked list is a sequence of data structures, which are connected together via links.Linked List is a sequence of links which contains items. Each link contains a connection to another link. Linked list is the second most-used data structure after array.
* Following are the various types of linked list.

    * Simple Linked List − Item navigation is forward only.

    * Doubly Linked List − Items can be navigated forward and backward.

    * Circular Linked List − Last item contains link of the first element as next and the first element has a link to the last element as previous.
    
* Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

* The important points about Java LinkedList are:

    * Java LinkedList class can contain duplicate elements.
    * Java LinkedList class maintains insertion order.
    * Java LinkedList class is non synchronized.
    * In Java LinkedList class, manipulation is fast because no shifting needs to occur.
    * Java LinkedList class can be used as a list, stack or queue.

 
### 📚 [Stacks](https://github.com/cs-cse/Java-DataStructures/tree/master/dsa-Stacks/src)
* Stack is a linear data structure that follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out).
* Java Collection framework provides a Stack class that models and implements a Stack data structure. The class is based on the basic principle of last-in-first-out. In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek. The class can also be said to extend Vector and treats the class as a stack with the five mentioned functions. The class can also be referred to as the subclass of Vector. 


### 🖇️ [Queues](https://github.com/cs-cse/Java-DataStructures/tree/master/dsa-Queues/src)
* Queue is the data structure that is similar to the queue in the real world. A queue is a data structure in which whatever comes first will go out first, and it follows the FIFO (First-In-First-Out) policy. Queue can also be defined as the list or collection in which the insertion is done from one end known as the rear end or the tail of the queue, whereas the deletion is done from another end known as the front end or the head of the queue.
* The Queue interface present in the java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.
* Being an interface the queue needs a concrete class for the declaration and the most common classes are the PriorityQueue and LinkedList in Java. Note that neither of these implementations are thread safe. PriorityBlockingQueue is one alternative implementation if thread safe implementation is needed.

### 📊 [Graph](https://github.com/cs-cse/Java-DataStructures/tree/master/dsa-Graph/src)
* A graph is a data structure that consists of the following two components: 

  * A finite set of vertices also called as nodes. 
  * A finite set of ordered pair of the form (u, v) called as edge. The pair is ordered because (u, v) is not the same as (v, u) in case of a directed graph(di-graph). The pair of the form (u, v) indicates that there is an edge from vertex u to vertex v. The edges may contain weight/value/cost.
  Graphs are used to represent many real-life applications: Graphs are used to represent networks. The networks may include paths in a city or telephone network or circuit network. Graphs are also used in social networks like linkedIn, Facebook. For example, in Facebook, each person is represented with a vertex(or node). Each node is a structure and contains information like person id, name, gender, and locale.
* In Java, the Graph is a data structure that stores a certain of data. The concept of the graph has been stolen from the mathematics that fulfills the need of the computer science field. It represents a network that connects multiple points to each other. In this section, we will learn Java Graph data structure in detail. Also, we will learn the types of Graph, their implementation, and traversal over the graph.

### 🌳 [Tree](https://github.com/cs-cse/Java-DataStructures/tree/master/dsa-BinaryTree/src)
* Trees are non-linear data structures. They are often used to represent hierarchical data. For a real-world example, a hierarchical company structure uses a tree to organize.
* Trees are a collection of nodes (vertices), and they are linked with edges (pointers), representing the hierarchical connections between the nodes. A node contains data of any type, but all the nodes must be of the same data type. Trees are similar to graphs, but a cycle cannot exist in a tree.

  * Root: The root of a tree is a node that has no incoming link (i.e. no parent node). Think of this as a starting point of your tree.

  * Children: The child of a tree is a node with one incoming link from a node above it (i.e. a parent node). If two children nodes share the same parent, they are called siblings.

  * Parent: The parent node has an outgoing link connecting it to one or more child nodes.

  * Leaf: A leaf has a parent node but has no outgoing link to a child node. Think of this as an endpoint of your tree.

  * Subtree: A subtree is a smaller tree held within a larger tree. The root of that tree can be any node from the bigger tree.

  * Depth: The depth of a node is the number of edges between that node and the root. Think of this as how many steps there are between your node and the tree’s starting point.

  * Height: The height of a node is the number of edges in the longest path from a node to a leaf node. Think of this as how many steps there are between your node and the tree’s endpoint. The height of a tree is the height of its root node.

  * Degree: The degree of a node refers to the number of sub-trees.
### 🗄 [HashTable](https://github.com/cs-cse/Java-DataStructures/tree/master/dsa-HashTable/src)
* The Hashtable class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value. To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.  
* Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface. 
* Features of Hashtable:


    * It is similar to HashMap, but is synchronized.
    * Hashtable stores key/value pair in hash table.
    * In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
    * The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
    * HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.
### 🪴 [Heap](https://github.com/cs-cse/Java-DataStructures/tree/master/dsa-Heap/src)
* A Heap is a special Tree-based data structure in which the tree is a complete binary tree. Generally, Heaps can be of two types:

    * Max-Heap: In a Max-Heap the key present at the root node must be greatest among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
    * Min-Heap: In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
* In Java, a heap is a chunk of memory which is shared among all threads. In a heap, all class instances and the array is allocated. It is created when JVM starts-up. An automatic storage management system reclaims heap. It may be of fixed and variable size. It does not need to be contiguous.
### ➰ [Trie](https://github.com/cs-cse/Java-DataStructures/tree/master/dsa-Trie/src)
* Trie is an efficient information reTrieval data structure. Using Trie, search complexities can be brought to optimal limit (key length). If we store keys in binary search tree, a well balanced BST will need time proportional to M * log N, where M is maximum string length and N is number of keys in tree. Using Trie, we can search the key in O(M) time. However the penalty is on Trie storage requirements.
* A trie is a discrete data structure that's not quite well-known or widely-mentioned in typical algorithm courses, but nevertheless an important one.A trie (also known as a digital tree) and sometimes even radix tree or prefix tree (as they can be searched by prefixes), is an ordered tree structure, which takes advantage of the keys that it stores – usually strings.
* A node's position in the tree defines the key with which that node is associated, which makes tries different in comparison to binary search trees, in which a node stores a key that corresponds only to that node.All descendants of a node have a common prefix of a String associated with that node, whereas the root is associated with an empty String.


### ✅ Data Structure Operations Complexity

| Data Structure          | Access    | Search    | Insertion | Deletion  | Comments  |
| ----------------------- | :-------: | :-------: | :-------: | :-------: | :-------- |
| **Array**               | 1         | n         | n         | n         |           |
| **Stack**               | n         | n         | 1         | 1         |           |
| **Queue**               | n         | n         | 1         | 1         |           |
| **Linked List**         | n         | n         | 1         | n         |           |
| **Hash Table**          | -         | n         | n         | n         | In case of perfect hash function costs would be O(1) |
| **Binary Search Tree**  | n         | n         | n         | n         | In case of balanced tree costs would be O(log(n)) |
| **B-Tree**              | log(n)    | log(n)    | log(n)    | log(n)    |           |
| **Red-Black Tree**      | log(n)    | log(n)    | log(n)    | log(n)    |           |
| **AVL Tree**            | log(n)    | log(n)    | log(n)    | log(n)    |           |
| **Bloom Filter**        | -         | 1         | 1         | -         | False positives are possible while searching |

### ⚡ [Continue to Algorithms...](https://github.com/cs-cse/Java-Algorithms)
