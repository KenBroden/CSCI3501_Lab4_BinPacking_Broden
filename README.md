# README overview

- *Lab 4 Bin Packing by Ken Broden*

This README is going to be the lab write up for my usage while programming the lab. It will be mostly information available from the lab instructions from canvas, along with my own notes that help me understand the goal. I plan on creating a separate INSTRUCTIONS.md file which details how to run the program, as well as a RESULTS.md to detail results and answer any questions asked in the lab write up.

## Lab Overview

The goal of the lab is to develop and implement an approximation algorithm to solve a Bin Packing Problem.

### Bin Packing Problem

Find a way to pack N items of different fixed sizes into 3 bins, each with capacity B. The algorithm should try to minimize the amount of unused bin space. Equivalently, the algorithm should minimize the total unpacked amount.  Essentially, pack as much as possible into the 3 bins.

#### Example

Given B=20 and items sized:
12, 4, 8, 15, 9, 3, 1, 10
you can pack the bins as [12,8],[1,4,15], and [9,10], with the total unpacked amount of size 3.

### Solution Consideration

To find the optimal solution, one needs to consider all possibilities of packing, which is **exponential** in *n*. However, there are good approximation algorithms that find a solution close to optimal in times **polynomial** in *n*.
Your goal is to develop such an approximation algorithm, implement it, test it, and **analyze its efficiency** in the worst case. Prove the &Theta;*(f(n))* approximation, where *f(n)* is in *O(n^k)* for a particular *k* (*n* is the number of items).

### Specific Requirements

- Must be an approximation algorithm.  It is **not** allowed to check all possibilities.
- Your algorithm does not have to find the optimal solution for all cases but it should find a good solution for most cases.
- The **input** includes the capacity of the bins followed by the number of items N followed by the items themselves, separated by spaces. For instance, the input for the above problem is [20 8 12 4 8 15 3 1 10]. Here B=20, N=8, and the 8 items follow. If writing in Java(which I am) use the Scanner class, which allows you to read data from the Java console (standard input). Your output should be the list of elements in each bin, the list of the unpacked items, and the amount of unused space. PLEASE LABEL YOUR ANSWERS.
- You may use any of the algorithms included in the language of your choice. In Java, take a look at the Collections class.
- Show at least two examples for which your algorithm returns an optimal solution, and at least one for which it does not (i.e. there exists another solution with less leftover volume than the one that your algorithm produces).
- **Extra credit** Compute the maximum difference between your solution and the optimal one (in percentage of the total space), show and justify your computations.
