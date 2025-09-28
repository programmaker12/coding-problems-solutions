# Problem 002 – Currency Rate Formatter

## Problem Statement

Create a utility class **`Problem_002`** that handles **currency value formatting and conversion results**.

The class should implement three **overloaded methods** named `rate` with the following specifications:

---

### 1. `rate(double localCurrency, String foreignCurrency)`
- Accepts a currency value (`double`) and a currency unit (`String`).
- Rounds the numeric value to **2 decimal places** using `RoundingMode.HALF_UP`.
- Removes unnecessary trailing zeros (e.g., `2.200000…` → `2.2`).
- Returns a formatted string concatenating the value with the currency unit.

**Example:**
```java
rate(2.2000000000000001776, "dollar") → "2.2dollar"
```
### 2. `rate(double localCurrency, double foreignCurrency)`
- Accepts two numeric currency values (double).
- Computes the sum of the two.
- Rounds the result to 2 decimal places using RoundingMode.HALF_UP.
- Returns the formatted value as a string.
**Example:**
```java
rate(10.456, 5.234) → "15.69"
```
### 3. `rate(String localCurrency, String foreignCurrency)`
- Accepts two string values representing currencies.
- Returns their concatenation.
  **Example:**
```java
rate("rupee", "dollar") → "rupeedollar"
```

## 💻 Solution File
See [Problem_002.java](../solutions/Problem_002.java)