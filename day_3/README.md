# Theory Questions

1. *What is the difference between a stack and a queue ? Can you give an example 
   of when you would use each ?*
   - A stack is a data structure the follows Last in First Out (LIFO) structure.
   - A queue follows First in First Out (FIFO).
   - A queue to used to order requests to a resource and ensure the earlier requests
     are stored first.
   - Function calls withing other functions are stored on a stack to kep track of 
     the execution order.
   - In a web browser the page history is stored on a stack the users can flip 
     through.
2. *What are the time complexities of the main operations (push, pop, peek) 
   and (enqueue, dequeue, peek) in a stack and a queue ?*
   - O(1)
3. *Can you explain stack overflow to me ?* 
   - It is an overflow error which occurs when a program tries to use more memory
     in the call stack than what it was provided.
4. *Can you explain queue underflow to me ?*
   - Queue under flow occurs when you try to deque from and empty queue.
5. *What is the difference between the stack and the heap in the JVM ? 
   How are they used for storing data and managing memory ?*
   - Stack memory is used to stock the method execution order and local variables.
     It is also used to store the references to objects stored on the heap.
   - The Heap is used for dynamic memory allocation and storing objects that
     are created during runtime.
6. *What is the purpose of garbage collection in the JVM ?
   How does it help manage memory in a Java application ?*
   - The garbage collector is responsible for freeing up memory on heap. It frees
     up memory from objects that have no references to it.
7. *(Medium/Hard) Describe the process of garbage collection in the JVM. What are 
   the main steps involved in identifying and reclaiming unused memory ?*
   - During garbage collection objects which have a reference have their mark bit
     set to 1. (The mark phase).
   - The next phase; the sweep phase, all object which have their mark bit set to
     zero are removed to free up memory.
8. *(Hard) Explain the concept of generational garbage collection. 
   How does it improve the efficiency of memory management in the JVM ?*
   - With generational garbage collection the heap is split into different spaces.
   - Each sections stores objects based on the expected lifetime of the object and
     other parameters.
   - This way the garbage collector does not need to traverse the entire heap during
     garbage collection.
9. *(Hard) What are the different garbage collection algorithms used in the JVM ?
   How do they differ in terms of performance and memory management ?*
   - Serial garbage collector
   - Parallel garbage collector (default)
   - Concurrent mark-and-sweep
   - Garbage first (G1) garbage collector
10. *Why do we have stack and heap memory ?*