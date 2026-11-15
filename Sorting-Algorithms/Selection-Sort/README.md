# Selection Sort

## Overview

Selection Sort is a comparison-based sorting algorithm that repeatedly finds the smallest element from the unsorted portion of an array and places it at the beginning of that portion.

## How It Works

1. Start at the first position of the array.
2. Assume the current position contains the smallest value.
3. Search the remaining unsorted elements for a smaller value.
4. If a smaller value is found, remember its index.
5. Swap the smallest value with the value at the current position.
6. Move to the next position and repeat.
7. Continue until the array is sorted.

## Example

```text
Unsorted:
[6, 3, 8, 2, 7, 1, 5, 4]

After each pass:
[1, 3, 8, 2, 7, 6, 5, 4]
[1, 2, 8, 3, 7, 6, 5, 4]
[1, 2, 3, 8, 7, 6, 5, 4]
...
```

## Complexity Analysis

| **Metric / Property** | **Value** | **Details** |
|---|---|---|
| **Best-Case Time** | O(n²) | Still scans the entire unsorted section even if already sorted. |
| **Average-Case Time** | O(n²) | Performs roughly n² / 2 comparisons. |
| **Worst-Case Time** | O(n²) | Occurs regardless of the initial order of elements. |
| **Space Complexity** | O(1) | Sorts the array in place without needing extra memory. |
| **Stability** | Unstable | Swapping distant elements can change the relative order of equal items. |

## Characteristics

- In-place sorting algorithm
- Comparison-based
- Simple to implement
- Not efficient for large datasets

## Practice

The implementation in `SelectionSort.java` is my own practice implementation.

## Notes / Mistakes

Add notes here after completing the implementation and testing it.