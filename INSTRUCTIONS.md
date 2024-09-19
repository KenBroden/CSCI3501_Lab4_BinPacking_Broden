# Instructions

## Overview

This project implements a bin packing algorithm that attempts to pack a given set of items into a fixed number of bins with a specified capacity.
*Lab 4 Bin Packing by Ken Broden*

## Files

- [`Main.java`]: The main entry point of the application. It handles user input, initializes the bin packing algorithm, and outputs the results.
- [`BinPacker.java`]: Contains the implementation of the bin packing algorithm.
- [`INSTRUCTIONS.md`]: This instruction file.
- [`README.md`]: General information about the project.
- [`RESULTS.md`]: Contains test inputs and results of the bin packing algorithm.

## How to Run

1. **Compile the Project:**
   Ensure you have Java installed on your machine. Open a terminal and navigate to the project directory. Compile the Java files using the following command:

```sh
   javac Main.java BinPacker.java
```

2. **Run the Application:**
   Execute the compiled [`Main`] class using the following command:

```sh
   java Main
```

3. **Provide Input:**
   When prompted, enter the bin size, number of items, and the items themselves, separated by spaces. For example:

```sh
   Enter the bin size, number of items, and then the items separated by spaces:
   20 8 12 4 8 15 3 1 10
```

4. **View the Results:**
   The application will output the contents of each bin. For example:

```sh
   Bin 1: [15, 4, 1]
   Bin 2: [12, 8]
   Bin 3: [10, 3]
```

## Example Inputs and Outputs

### Example 1

**Input:**

```sh
20 7 12 4 8 15 3 1 10
```

**Output:**

```sh
Bin 1: [15, 4, 1]
Bin 2: [12, 8]
Bin 3: [10, 3]
```

### Example 2

**Input:**

```sh
20 8 18 4 8 15 9 3 1 10
```

**Output:**

```sh
Item 8 was not placed in any bin.
Item 3 was not placed in any bin.
Bin 1: [18, 1]
Bin 2: [15, 4]
Bin 3: [10, 9]
```

## Notes

- The maximum number of bins is fixed at 3.
- If an item cannot be placed in any bin, it will be reported as not placed.

## Troubleshooting

- Ensure the number of items specified matches the actual number of items provided.
- Ensure all inputs are valid integers.
