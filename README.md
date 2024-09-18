# README overview

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
Your goal is to develop such an approximation algorithm, implement it, test it, and **analyze its efficiency** in the worst case. Prove the &Theta/*(f(n))* approximation, where *f(n)* is in *O(n^k)* for a particular *k* (*n* is the number of items).


