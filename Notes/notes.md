# JAVA NOTES

## 1. Difference Between `do-while` and `while` in Java

| Feature                    | `do-while` Loop                                  | `while` Loop                                   |
|----------------------------|--------------------------------------------------|-----------------------------------------------|
| **Syntax**                 | ```                                              |
|                            | do {                                             |
|                            |     // code block                                |
|                            | } while (condition);                             |
|                            | ```                                              |
|                            | ```                                              |
|                            | while (condition) {                              |
|                            |     // code block                                |
|                            | }                                                |
|                            | ```                                              |
| **Condition Evaluation**   | The condition is evaluated **after** the code block executes (post-test loop). | The condition is evaluated **before** the code block executes (pre-test loop). |
| **Execution Guarantee**    | Executes the code block **at least once**, regardless of the condition. | May not execute at all if the condition is initially `false`. |
| **Use Case**               | Useful when the code block must run at least once before checking the condition. | Useful when the code block should run only if the condition is `true`. |
| **Example**                | ```java                                         |
|                            | int i = 1;                                      |
|                            | do {                                            |
|                            |     System.out.println(i);                      |
|                            |     i++;                                        |
|                            | } while (i <= 5);                               |
|                            | ```                                              |
|                            | ```java                                         |
|                            | int i = 1;                                      |
|                            | while (i <= 5) {                                |
|                            |     System.out.println(i);                      |
|                            |     i++;                                        |
|                            | }                                               |
|                            | ```                                              |

## Key Takeaways
1. Use `do-while` when the code must execute at least once before checking the condition.
2. Use `while` when the condition determines whether the loop executes at all.
