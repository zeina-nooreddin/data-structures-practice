# Insertion Sort

## Overview

Insertion Sort is a comparison-based sorting algorithm that builds the final sorted array one item at a time, much like sorting a hand of playing cards by inserting each new card into its correct position among the already-sorted cards.

## How It Works

1. Assume the first element (at index 0) is already sorted.
2. Pick the next element in the array, known as the "key".
3. Compare the key with the elements in the sorted portion, moving backwards from right to left.
4. Shift any element that is greater than the key one position to the right.
5. Insert the key into its correct position.
6. Repeat until the array is fully sorted.

## Example

```text
Unsorted:
[6, 3, 8, 2, 7, 1, 5, 4]

After each pass: (length-1 passes in total)
[3, 6, 8, 2, 7, 1, 5, 4]
[3, 6, 8, 2, 7, 1, 5, 4]
[2, 3, 6, 8, 7, 1, 5, 4]
[2, 3, 6, 7, 8, 1, 5, 4]
[1, 2, 3, 6, 7, 8, 5, 4]
[1, 2, 3, 5, 6, 7, 8, 4]
[1, 2, 3, 4, 5, 6, 7, 8]
```

## Complexity Analysis

| **Metric / Property** | **Value** | **Details** |
| :--- | :--- | :--- |
| **Best-Case Time** | O(n) | Occurs when the array is already sorted; only one comparison per element and no shifts. |
| **Average-Case Time** | O(n²) | On average, elements are shifted halfway through the sorted portion. |
| **Worst-Case Time** | O(n²) | Occurs when the array is sorted in reverse order, requiring maximum comparisons and shifts. |
| **Space Complexity** | O(1) | Sorts the array in place without requiring extra memory. |
| **Stability** | Stable | Equal elements retain their relative original order because elements are only shifted when strictly greater than the key. |

## Characteristics

- In-place sorting algorithm
- Comparison-based
- **Adaptive**: Extremely efficient for small datasets or data that is already substantially sorted
- Online algorithm (can sort a list as it receives it)

## Notes / Mistakes

Add notes here after completing the implementation and testing it.