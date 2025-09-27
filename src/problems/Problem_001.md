# Problem 001 - Alphabet Shifting Operations

## 📌 Problem Statement
You are given a **string** `input` consisting of lowercase English letters, and a **list of operations**.  
Each operation is in the format:


- `start` → starting index of the substring (0-based)
- `end` → ending index of the substring (0-based, inclusive)
- `D` → direction of shift:
    - `L` → shift characters **forward** in the alphabet (e.g., `'a' → 'b'`).
    - `R` → shift characters **backward** in the alphabet (e.g., `'b' → 'a'`).

### Shifting Rules
- For **L**:
    - `'z'` wraps around to `'a'`
    - All other letters increase by 1
- For **R**:
    - `'a'` wraps around to `'z'`
    - All other letters decrease by 1

Apply all operations **in the given order**, and return the final modified string.

---

## ✨ Example Input/Output

**Input:**  
input = "teacher"
operations = ["0 1 L", "2 4 R"]


**Explanation:**
1. `"0 1 L"` → shift indices 0 and 1 left → `t → u`, `e → f` → `"ufacher"`
2. `"2 4 R"` → shift indices 2 to 4 right → `a → z`, `c → b`, `h → g` → `"ufzbger"`

---

## ⚡ Constraints
- `1 ≤ input.length ≤ 10^5`
- `1 ≤ operations.length ≤ 10^5`
- `0 ≤ start ≤ end < input.length`
- `D ∈ {L, R}`

---

## 💻 Solution File
See [Problem_001.java](../solutions/Problem_001.java)
