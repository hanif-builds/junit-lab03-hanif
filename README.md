# Lab Task 03 — JUnit Unit Testing

**Course:** Software Construction and Development — 5th Semester Software Engineering
**University:** University of Engineering and Technology, Abbottabad Campus
**Instructor:** Engr. Rizwan Shah

## Objective

This lab introduces unit testing in Java using the JUnit 5 framework — writing JUnit
tests for several small classes, interpreting the results of automated test runs,
and using more advanced JUnit features (`@BeforeEach`/`@AfterEach`, `assertThrows`,
`@DisplayName`) in the homework extensions.

## What was implemented

### Lab Tasks

Each class lives in `src/main/java`, with a matching JUnit 5 test class in
`src/test/java`.

| # | Class | Tested for |
|---|-------|------------|
| 1 | `TemperatureConverter` | Known conversion pairs (0°C/32°F, 100°C/212°F), Kelvin conversion |
| 2 | `BankAccount` | Deposit/withdraw balance updates, overdraft exception, negative-deposit exception |
| 3 | `StringUtil` | Palindrome detection (case-insensitive), null input, and an empty-string edge case discovered while testing |
| 4 | `TimerUtil` | Normal elapsed time, zero-boundary case, invalid input exception |
| 5 | `ShoppingCart` | Add/remove/clear item counts, removing a non-existent item |

### Homework

| # | Class | Notes |
|---|-------|-------|
| 1 | `Calculator1` | Basic operations plus `power(base, exp)` and `modulus(a, b)` (throws on `b == 0`); tests use `@BeforeEach`/`@AfterEach` |
| 2 | `BankAccountHomework` | Adds `isActive()` — account becomes inactive once balance drops below 100 after a withdrawal |
| 3 | `StringAnalyzer` | `isPalindrome`, `countVowels`, `isAnagram`, with `@DisplayName` on every test |

## How to run the code and tests

**NetBeans:** Open Project → right-click the project → **Test** to run all JUnit tests.

**Maven (command line):**
```bash
mvn test
```

## Reflection

This lab was a hands-on introduction to JUnit 5 and unit testing fundamentals —
writing tests for normal cases, boundary conditions, and exceptional inputs across
eight classes in total (five lab tasks plus three homework extensions).

The most interesting moment was in `StringUtil.isPalindrome`: the lab handout's test
ideas imply an empty string should return `false`, but tracing through the given
implementation line by line showed that stripping non-letters from `""` still leaves
`""`, which is trivially equal to its own reverse — so the method actually returns
`true` for an empty string. Rather than forcing the test to match the handout's
wording, I traced the logic, confirmed the real behavior, and wrote the test to match
what the code does, documenting the discrepancy with a comment. For `StringAnalyzer`
in Homework 3, I corrected that same edge case so empty strings return `false` — one
concrete example of how the original implementation could be improved.

Writing tests with `@BeforeEach`/`@AfterEach` for `Calculator1` also reinforced how
much repetition setup code removes from a test class, and `assertThrows` made it
clear that verifying an exception is thrown is just as much a "test" as checking a
return value. Going forward, I'd like to add more edge-case coverage (very long
strings, special characters, extreme numeric values) across all of these classes.
