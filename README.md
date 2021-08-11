# Big O Notation

![Big O Complexity Chart](docs/big-o.jpeg)
Source : https://www.bigocheatsheet.com/

> Big-O notation is a way of converting the overall steps of an algorithm into algebraic terms, then excluding lower order constants and coefficients that don’t have that big an impact on the overall complexity of the problem.

In plain words, Big O notation describes the complexity of your code using algebraic terms. Big O is also divided into
two, namely time complexity and space complexity.

There are several kinds of Big O complexity, including:

## 1. Constant or Big O(1)

## 2. Linear or Big O(n)

See example code [here](src/main/java/aryahmph/BigOImpl.java).

```java
public class BigOImpl implements BigO {
    public void linear(int[] array) {
        // O(n) time
        for (int i = 0; i < array.length; i++) {
            // Constant time
            System.out.println("Step : " + i + 1);
            System.out.println("Step : " + i + 1);
            System.out.println("Step : " + i + 1);
        }
    }
}
```

The above function has the time complexity O(n), because it will do as many commands as n.