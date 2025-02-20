# Kotlin MutableList removeIf Unexpected Behavior

This repository demonstrates a subtle bug that can occur when using the `removeIf` function on a `MutableList` in Kotlin. The bug is related to the way `removeIf` iterates and removes elements, potentially leading to unexpected results if not handled carefully. The bug and its solution are explained below.

## Bug Description
The provided Kotlin code attempts to remove even numbers from a mutable list. While the intention is clear, the direct use of `removeIf` can result in unexpected behavior due to the modification of the list during iteration. 

## Bug Solution
The provided solution demonstrates a correct way to remove even numbers, either using an iterator or creating a new list. These alternatives avoid the pitfalls of modifying the list while iterating directly.

## How to Reproduce
1. Clone this repository.
2. Run the `bug.kt` file. Observe the unexpected output. 
3. Run the `bugSolution.kt` file to see the corrected behavior.