# Big O Notation

![Big O Complexity Chart](docs/big-o.jpeg)
Source : https://www.bigocheatsheet.com/

> Big-O notation is a way of converting the overall steps of an algorithm into algebraic terms, then excluding lower order constants and coefficients that don’t have that big an impact on the overall complexity of the problem.

In plain words, Big O notation describes the complexity of your code using algebraic terms. Big O only look at the
factors that have the most impact on the value generated by the algorithm.

Example :

```
Regular       Big-O
2             O(1)   --> It's just a constant number
2n + 10       O(n)   --> n has the largest effect
5n^2          O(n^2) --> n^2 has the largest effect
```

Big O is also divided into two, namely time complexity and space complexity.

There are several kinds of Big O complexity, including:

## 1. Constant or Big O(1)

See example code [here.](src/main/java/aryahmph/BigOImpl.java)

```java
public class BigOImpl implements BigO {
    public void constant() {
        System.out.println("Learn");
        System.out.println("Data Structure");
        int x = 10;
        x *= 100;
        System.out.println(x);
    }
}
```

The above function has the time complexity O(1), because the code is only done one way, even if there are 5 processes in
the code that is calculated O(5) but can be simplified to O(1) because it is only calculated the outline is not the
number of steps.

```text
Output :
Learn
Data Structure
1000
```

<br>

![Big O(1)](docs/constant-big-o.png)

## 2. Linear or Big O(n)

See example code [here.](src/main/java/aryahmph/BigOImpl.java)

```java
public class BigOImpl implements BigO {
    public void linear(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
```

The above function has the time complexity O(n), because it will do as many commands as n. If linear(5) it will provide
output as follows:

```text
Output :
0
1
2
3
4
```

And the greater the n value the greater the time or step it takes.

<br>

![Big O(n)](docs/linear-big-o.png)

## 3 O(log n)

First, what is logarithm?

![Logarithm](docs/logarithm.png)

The base of logarithm is always taken as 2 in finding time complexity of algorithms, because Conversion between
logarithm bases is equivalent to multiplying by some constant. Constant multiplication does not affect big O complexity
class. So the logarithm base has no effect on the analysis.

Source : https://stackoverflow.com/questions/45222185/why-is-that-the-base-of-the-logarithm-is-always-taken-as-2-in-finding-time-comp

Then what is O(log n) mean?

![Olog(n)](docs/o-log-n.png)

<br>

The example of O log(n) is Binary Search :

```java
public class BigOImpl implements BigO {
    public int binarySearch(int[] array, int start, int end, int target) {
        if (start > end) return -1;
        int midIdx = (start + end) / 2;

        if (array[midIdx] == target) return midIdx;
        else if (array[midIdx] > target) return binarySearch(array, start, midIdx - 1, target);
        else return binarySearch(array, midIdx + 1, end, target);
    }
}
```

<br>
If the array data is {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, then it would like this :

![Binary Search](docs/Binary-Search.png)

The time complexity is, log 10 = 3, it takes 3 step for Worst Case or Average case, and the best case are O(1).

## 4. Square or Big O(n²)

See example code [here.](src/main/java/aryahmph/BigOImpl.java)

```java
public class BigOImpl implements BigO {
    public void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + "," + j);
            }
        }
    }
}
```

The above function has the time complexity O(n²), because it will do as many commands as n*n. If square(4) it will
provide output as follows:

![Big O(n)](docs/square-big-o.png)