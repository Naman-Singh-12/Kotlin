# Week-Wise DSA Practice Plan — Pattern Based

> **Goal:** Build strong DSA fundamentals by learning problem-solving patterns rather than memorizing individual solutions.
>
> **Recommended approach:** For every problem, identify the pattern first, solve a brute-force version, optimize it, explain complexity, and connect it to a practical mobile-development use case.

---

## 📚 Plan Overview

| Week | Pattern / Topic | Primary Focus |
|---|---|---|
| Week 0 | Arrays & Strings | Foundation |
| Week 1 | Sliding Window | Window-based optimization |
| Week 2 | Two Pointers | Array/string traversal |
| Week 3 | Hashing (Map / Set) | Fast lookup & frequency |
| Week 4 | Prefix Sum | Cumulative/range calculations |
| Week 5 | Binary Search | Search-space reduction |
| Week 6 | Stack | LIFO & monotonic-stack problems |
| Week 7 | Queue / BFS | Level-order & shortest-path logic |
| Week 8 | Recursion | Recursive thinking |
| Week 9 | Fast & Slow Pointer | Linked lists & cycle detection |
| Week 10 | Dynamic Programming | Memoization & tabulation |
| Week 11 | Backtracking | Explore → choose → undo |
| Week 12 | Greedy | Local optimal decisions |

---

# 🔹 Week 0 — Foundation (28 Sep 2026 - 4 Oct 2026)

## 0.1 Arrays

### 🟢 Easy

- [ ] Find maximum & minimum in an array
- [ ] Reverse an array
- [ ] Check if an array is sorted
- [ ] Remove duplicates from a sorted array

### 🟡 Medium

- [ ] Rotate array by `K` steps
- [ ] Move all zeros to the end
- [ ] Find the second largest element

### 🔴 Hard

- [ ] Maximum subarray sum — **Kadane's Algorithm**
- [ ] Merge two sorted arrays **without extra space**

### 🎯 Goal

Build confidence with:

- Array traversal
- Indexing
- Boundary conditions
- Edge cases
- In-place modifications

---

## 0.2 Strings

### 🟢 Easy

- [ ] Reverse a string
- [ ] Check if a string is a palindrome
- [ ] Count vowels & consonants

### 🟡 Medium

- [ ] Check if two strings are anagrams
- [ ] Find the longest common prefix
- [ ] Remove duplicate characters

### 🔴 Hard

- [ ] String compression
- [ ] Longest substring without repeating characters
- [ ] Minimum window substring — intro level

### 🎯 Goal

Build confidence with:

- Character indexing
- Character frequency
- Substring logic
- String traversal
- Edge cases

---

# 🔥 Core Pattern Practice

# 1. Sliding Window — Week 1

> **Key idea:** Maintain a moving window instead of repeatedly processing overlapping ranges.

### 🟢 Easy

- [ ] Maximum sum subarray of size `K`
- [ ] Average of subarrays of size `K`

### 🟡 Medium

- [ ] Longest substring without repeating characters
- [ ] Longest substring with at most `K` distinct characters
- [ ] Minimum size subarray with sum `≥ S`

### 🔴 Hard

- [ ] Sliding window maximum
- [ ] Minimum window substring
- [ ] Longest repeating character replacement

### 🎯 Pattern Goal

Learn when a repeated range operation can be reduced from brute-force traversal to an efficient moving window.

### 💡 Why It Matters

Mastering Sliding Window can significantly improve confidence with array and string problems.

---

# 2. Two Pointers — Week 2

> **Key idea:** Use two indices that move according to the problem's constraints.

### 🟢 Easy

- [ ] Reverse an array
- [ ] Check palindrome

### 🟡 Medium

- [ ] Two Sum — sorted array
- [ ] Remove duplicates from sorted array
- [ ] Square of a sorted array

### 🔴 Hard

- [ ] Container With Most Water
- [ ] 3Sum
- [ ] Trapping Rain Water

### 🎯 Pattern Goal

Understand how pointer movement can eliminate unnecessary nested loops.

---

# 3. Hashing — Map / Set — Week 3

> **Key idea:** Trade extra memory for faster lookup, counting, and membership checks.

### 🟢 Easy

- [ ] Two Sum
- [ ] First non-repeating character
- [ ] Count frequency of elements

### 🟡 Medium

- [ ] Group anagrams
- [ ] Longest consecutive sequence
- [ ] Subarray sum equals `K`

### 🔴 Hard

- [ ] Longest substring without repeating characters
- [ ] Top `K` frequent elements

### 🎯 Pattern Goal

Become comfortable with:

- `HashMap`
- `HashSet`
- Frequency counting
- Constant-time average lookup
- Mapping relationships between values

### 📱 Mobile Development Relevance

Hashing is especially useful in mobile development for:

- Deduplication
- Caching
- Fast lookups
- Mapping IDs to objects
- Local data processing

---

# 4. Prefix Sum — Week 4

> **Key idea:** Precompute cumulative information so repeated range calculations become cheap.

### 🟢 Easy

- [ ] Range sum query
- [ ] Running sum of an array

### 🟡 Medium

- [ ] Subarray sum equals `K`
- [ ] Find pivot index

### 🔴 Hard

- [ ] Maximum-size subarray with sum equal to `K`
- [ ] Continuous subarray divisible by `K`

### 🎯 Pattern Goal

Learn how preprocessing can reduce repeated calculations.

---

# 5. Binary Search — Week 5

> **Key idea:** Repeatedly eliminate half of the search space.

### 🟢 Easy

- [ ] Binary search — classic
- [ ] First & last occurrence

### 🟡 Medium

- [ ] Search in a rotated sorted array
- [ ] Find square root of a number
- [ ] Find peak element

### 🔴 Hard

- [ ] Koko Eating Bananas
- [ ] Minimum Days to Make Bouquets
- [ ] Binary Search on Answer — concept

### 🎯 Pattern Goal

Understand both:

1. Binary search on a sorted data structure
2. Binary search on a **monotonic answer space**

---

# 6. Stack — Week 6

> **Key idea:** Use LIFO behavior to process nested, ordered, or "next greater/smaller" relationships.

### 🟢 Easy

- [ ] Valid parentheses
- [ ] Implement stack using an array

### 🟡 Medium

- [ ] Next greater element
- [ ] Stock span problem

### 🔴 Hard

- [ ] Largest rectangle in histogram
- [ ] Daily temperatures
- [ ] Remove `K` digits

### 🎯 Pattern Goal

Learn:

- LIFO behavior
- Monotonic stacks
- Previous/next greater element patterns
- Nested structure processing

### 📱 Mobile Development Relevance

Stack-based thinking is useful in Android interviews and in problems involving navigation/history, parsing, nested UI/data structures, and undo-like operations.

---

# 7. Queue / BFS — Week 7

> **Key idea:** Process elements level-by-level using FIFO behavior.

### 🟢 Easy

- [ ] Implement a queue
- [ ] Level-order traversal of a binary tree

### 🟡 Medium

- [ ] Number of Islands
- [ ] Rotting Oranges

### 🔴 Hard

- [ ] Shortest Path in Binary Matrix
- [ ] Word Ladder — intro

### 🎯 Pattern Goal

Understand:

- Queue-based traversal
- BFS
- Level processing
- Visited tracking
- Shortest path in unweighted graphs

---

# 8. Recursion — Week 8

> **Key idea:** Solve a problem by reducing it to smaller instances of the same problem.

### 🟢 Easy

- [ ] Print numbers using recursion
- [ ] Factorial

### 🟡 Medium

- [ ] Reverse a linked list
- [ ] Fibonacci with memoization

### 🔴 Hard

- [ ] Tree traversals — Inorder / Preorder
- [ ] Recursion vs. iteration — explanation

### 🎯 Pattern Goal

Build an intuitive understanding of:

- Base cases
- Recursive cases
- Call stack
- Recursive state
- When iteration is preferable

---

# 9. Fast & Slow Pointer — Week 9

> **Key idea:** Move two pointers at different speeds to detect cycles or locate positions efficiently.

### 🟢 Easy

- [ ] Find the middle of a linked list

### 🟡 Medium

- [ ] Detect cycle in a linked list
- [ ] Happy number

### 🔴 Hard

- [ ] Find the start of a cycle
- [ ] Palindrome linked list

### 🎯 Pattern Goal

Understand how pointer speed differences can reveal structural information without extra memory.

---

# 10. Dynamic Programming — Week 10

> **Key idea:** Break a problem into overlapping subproblems and reuse previously computed results.

### 🟢 Easy

- [ ] Fibonacci — memoization + tabulation

### 🟡 Medium

- [ ] Climbing Stairs
- [ ] House Robber

### 🔴 Hard

- [ ] Coin Change
- [ ] Longest Increasing Subsequence

### 🎯 Pattern Goal

Focus on **basic DP needed for mobile-development interviews**:

1. Identify the state
2. Define the recurrence
3. Establish base cases
4. Choose memoization or tabulation
5. Analyze time and space complexity

---

# 11. Backtracking — Week 11

> **Key idea:** Make a choice, explore it, undo the choice, and explore another possibility.

### 🟢 Easy

- [ ] Generate subsets

### 🟡 Medium

- [ ] Permutations
- [ ] Combinations

### 🔴 Hard

- [ ] N-Queens — conceptual
- [ ] Word Search

### 🎯 Pattern Goal

Understand the standard backtracking structure:

```text
choose
  ↓
explore
  ↓
undo
  ↓
try next choice
```

---

# 12. Greedy — Week 12

> **Key idea:** Make the best available local decision while relying on the problem's properties to achieve a globally valid solution.

### 🟢 Easy

- [ ] Assign Cookies

### 🟡 Medium

- [ ] Jump Game
- [ ] Activity Selection

### 🔴 Hard

- [ ] Gas Station
- [ ] Minimum Platforms

### 🎯 Pattern Goal

Learn to identify when a problem allows local decisions instead of exhaustive exploration.

---

# ✅ Weekly Practice Method

Use the same workflow for **every problem**.

## Step 1 — Identify the Pattern

Before writing code, ask:

- What type of problem is this?
- Which pattern does it resemble?
- What clues in the problem statement indicate that pattern?

**Do not immediately start coding.**

---

## Step 2 — Write the Brute-Force Solution

First understand the straightforward solution.

Ask:

- What is the simplest correct approach?
- What is its time complexity?
- What is its space complexity?
- Why is it too slow or inefficient?

---

## Step 3 — Optimize

Now ask:

- Can I eliminate repeated work?
- Can I use a `HashMap` / `HashSet`?
- Can I use two pointers?
- Can I maintain a sliding window?
- Can preprocessing help?
- Can binary search reduce the search space?
- Can I reuse previous computation?

---

## Step 4 — Explain Time & Space Complexity

For every solution, explicitly write:

```text
Time Complexity: O(...)
Space Complexity: O(...)
```

Do not move on until you can explain **why**.

---

## Step 5 — Explain a Real Mobile Use Case

For every problem, answer:

> **"Where could this kind of thinking be useful in mobile development?"**

Examples:

- Hashing → cache / ID lookup / deduplication
- Sliding Window → rolling metrics / recent events
- Queue → background task processing
- Stack → navigation/history-like operations
- Binary Search → efficient lookup
- Prefix Sum → fast cumulative calculations
- BFS → graph/navigation-style problems
- DP → optimization problems with repeated states

---

# 🧠 Problem-Solving Template

Use this template for every DSA problem:

```text
Problem:
Pattern:

1. Understand the problem
- Input:
- Output:
- Constraints:
- Edge cases:

2. Brute Force
- Approach:
- Time:
- Space:

3. Optimized Approach
- Pattern:
- Key observation:
- Approach:

4. Complexity
- Time:
- Space:

5. Dry Run
- Example input:
- Step-by-step execution:

6. Kotlin Implementation
- Code:

7. Mobile Use Case
- Where could this pattern be useful in Android/mobile development?

8. Mistakes / Learnings
- What did I miss?
- What should I recognize faster next time?
```

---

# 📈 Weekly Review Checklist

At the end of each week:

- [ ] I can identify the pattern without looking at the solution
- [ ] I can explain the brute-force approach
- [ ] I can explain why the optimized approach is better
- [ ] I can calculate time complexity
- [ ] I can calculate space complexity
- [ ] I can solve at least 2 problems without hints
- [ ] I can explain the solution verbally
- [ ] I can write the solution in Kotlin
- [ ] I can identify at least one practical mobile-development use case

---

# 🏁 Completion Criteria

Do **not** measure progress only by the number of problems solved.

A pattern is considered **learned** when you can:

1. Recognize it from a new problem.
2. Explain why it applies.
3. Derive the approach without memorizing code.
4. Implement it in Kotlin.
5. Analyze `O(n)` / `O(log n)` / `O(n²)` complexity correctly.
6. Handle edge cases.
7. Explain the solution clearly without reading notes.

> **Rule:** If you solved a problem by copying the solution, count it as **practice**, not **mastery**.

---

# 🚀 Final Objective

By the end of Week 12, the target is not to memorize 80+ solutions.

The target is to recognize a relatively small set of **reusable problem-solving patterns** and apply them to unfamiliar problems.

### Core patterns to master

- Arrays & Strings
- Sliding Window
- Two Pointers
- Hashing
- Prefix Sum
- Binary Search
- Stack / Monotonic Stack
- Queue / BFS
- Recursion
- Fast & Slow Pointer
- Basic Dynamic Programming
- Backtracking
- Greedy

**Pattern recognition → Brute Force → Optimization → Complexity → Implementation → Explanation**
