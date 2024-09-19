
# Results

## Test Input 1 (Optimal Solution)

**Input:** `20 7 12 4 8 15 3 1 10`

- **Bin Capacity:** 20
- **Number of Items:** 7
- **Items:** 12, 4, 8, 15, 3, 1, 10

**My Results:**

- Bin 1: [15, 4, 1]
- Bin 2: [12, 8]
- Bin 3: [10, 3]

**Optimal Solution:**

- Bin 1: [15, 4, 1]
- Bin 2: [12, 8]
- Bin 3: [10, 3]

## Test Input 2 (Optimal Solution)

**Input:** `20 8 18 4 8 15 9 3 1 10`

- **Bin Capacity:** 20
- **Number of Items:** 8
- **Items:** 18, 4, 8, 15, 9, 3, 1, 10

**My Results:**

- Bin 1: [18, 1]
- Bin 2: [15, 4]
- Bin 3: [10, 9]
- Unpacked Items: [8, 3]

**Optimal Solution:**

- Bin 1: [18, 1]
- Bin 2: [15, 4]
- Bin 3: [10, 9]
- Unpacked Items: [8, 3]

## Test Input 3 (Non-Optimal Solution)

**Input:** `20 7 19 18 17 16 15 8 9 5`

- **Bin Capacity:** 20
- **Number of Items:** 8
- **Items:** 19, 18, 17, 16, 15, 8, 9, 5

**My Results:**

- Bin 1: [19]
- Bin 2: [18]
- Bin 3: [17]
- Unpacked Items: [16, 15, 9, 8, 5]

**Optimal Solution:**

- Bin 1: [19]
- Bin 2: [18]
- Bin 3: [15, 5]
- Unpacked Items: [17, 16, 9, 8]

## Input 3 Non-Optimal Solution Analysis

- Calculate the difference in used space:
  - Difference: 57 (optimal) - 54 (my results) = 3
- Calculate the percentage difference relative to the total space:
  - Percentage difference: (3/60) * 100 = 5%

**Justification**
The maximal difference between my algorithm's solution and the optimal one is 5% of the total space. This is calculated based on the difference in the amount of used space between my solution and the optimal solution, relative to the total available space.

## Algorithm Analysis

**Mergesort:** The merge sort algorithm is used to sort the items in decreasing order. The time complexity of merge sort is O(n*log(n)), where \(n\) is the number of items.

**Packing Items Into Bins:** The packing process involves iterating over each item and attempting to place it into one of the existing bins. The time complexity of this part depends on the number of items and the number of bins.

1) Iterating over Items:
   - There are \(n\) items to iterate over, so this part has a time complexity of O(n).

2) Placing Items Into Bins:
   - For each item, the algorithm checks each bin to see if the item can be placed in it. In the worst case, the algorithm checks all bins for each item.
   - The maximum number of bins is a constant 3, so this part has a time complexity of O(1) for each item.
   - Therefore, the total time complexity for placing items into bins is O(n).

**Summing Bin Contents:** My algorithm uses `bin.stream().mapToInt(Integer::intValue).sum()` to calculate the sum of the contents of each bin. This operation is performed for each item and each bin.

- The time complexity of summing the contents of a bin is O(k), where \(k\) is the number of items in the bin.
- Since the maximum number of bins is constant, the total time complexity for summing bin contents is O(n).

**Overall Time Complexity** Combining the time complexities of each part, we get the overall time complexity of the algorithm:

- Merge sort: O(n*log(n))
- Packing items into bins: O(n)
- Summing bin contents: O(n)

The overall time complexity is dominated by the merge sort step, so the worst-case and average runtime of the algorithm is: O(n*log(n))

### Runtime Summary

- **Worst-case runtime:** O(n*log(n))
- **Average runtime:** O(n*log(n))
