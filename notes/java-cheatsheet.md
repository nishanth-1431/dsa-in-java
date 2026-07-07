# ☕ Java DSA Cheatsheet

Quick reference for commonly used Java syntax and APIs in DSA problems.

---

## 📦 Arrays

```java
int[] arr = new int[n];              // declare
int[] arr = {1, 2, 3};              // initialize
arr.length                           // size
Arrays.sort(arr);                    // sort ascending
Arrays.sort(arr, (a, b) -> b - a);  // sort descending (Integer[])
Arrays.fill(arr, 0);                 // fill with value
Arrays.copyOfRange(arr, i, j);      // subarray [i, j)
Arrays.toString(arr);               // print array
```

---

## 📋 ArrayList

```java
List<Integer> list = new ArrayList<>();
list.add(val);                       // add to end
list.add(index, val);               // insert at index
list.get(index);                    // access
list.set(index, val);               // update
list.remove(index);                 // remove by index
list.size();                        // size
Collections.sort(list);             // sort
Collections.reverse(list);          // reverse
```

---

## 🗺️ HashMap

```java
Map<Integer, Integer> map = new HashMap<>();
map.put(key, val);                          // insert / update
map.get(key);                               // get value
map.getOrDefault(key, 0);                  // get or default
map.containsKey(key);                       // check key
map.containsValue(val);                     // check value
map.remove(key);                            // remove
map.size();                                 // size
map.keySet();                               // all keys
map.values();                               // all values
map.entrySet();                             // key-value pairs

// Iterate
for (Map.Entry<Integer, Integer> e : map.entrySet()) {
    e.getKey();
    e.getValue();
}
```

---

## 🗂️ HashSet

```java
Set<Integer> set = new HashSet<>();
set.add(val);
set.contains(val);
set.remove(val);
set.size();
```

---

## 📚 Stack

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(val);     // push
stack.pop();         // pop
stack.peek();        // top
stack.isEmpty();     // check empty
```

---

## 🚶 Queue

```java
Queue<Integer> queue = new LinkedList<>();
queue.offer(val);    // enqueue
queue.poll();        // dequeue
queue.peek();        // front
queue.isEmpty();     // check empty
```

---

## 🪣 Priority Queue (Heap)

```java
// Min Heap (default)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// Max Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

minHeap.offer(val);  // insert
minHeap.poll();      // remove min/max
minHeap.peek();      // view min/max
minHeap.size();
```

---

## 🔗 LinkedList (as Deque)

```java
Deque<Integer> dq = new ArrayDeque<>();
dq.addFirst(val);    // add front
dq.addLast(val);     // add end
dq.removeFirst();    // remove front
dq.removeLast();     // remove end
dq.peekFirst();      // view front
dq.peekLast();       // view end
```

---

## 🔤 String

```java
String s = "hello";
s.length();
s.charAt(i);
s.substring(i, j);          // [i, j)
s.indexOf("el");
s.contains("ell");
s.equals("hello");
s.toLowerCase();
s.toUpperCase();
s.trim();
s.split(" ");
s.toCharArray();
String.valueOf(123);        // int to String
Integer.parseInt("123");   // String to int
```

---

## 🧵 StringBuilder

```java
StringBuilder sb = new StringBuilder();
sb.append("hello");
sb.append(123);
sb.insert(0, "start");
sb.delete(i, j);
sb.reverse();
sb.toString();
sb.length();
```

---

## 🔢 Math Utilities

```java
Math.max(a, b);
Math.min(a, b);
Math.abs(a);
Math.pow(base, exp);    // returns double
Math.sqrt(n);           // returns double
Math.floor(d);
Math.ceil(d);
Integer.MAX_VALUE;      // 2^31 - 1
Integer.MIN_VALUE;      // -2^31
```

---

## 🔁 Useful Patterns

```java
// Swap
int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;

// Check if char is digit / letter
Character.isDigit(c);
Character.isLetter(c);
Character.isLetterOrDigit(c);
Character.toLowerCase(c);

// Char to int (0-9)
int d = c - '0';

// Char frequency array
int[] freq = new int[26];
freq[c - 'a']++;
```
