# Lab Activity: Trees (conceptually using a stack)
# Purpose: Check if parentheses in a string are balanced
# Idea: Similar to tree traversal (matching pairs)

def is_balanced(s):
    stack = []  # Use stack to keep track of open parentheses

    for char in s:
        if char == '(':
            stack.append(char)  # Push opening parenthesis
        elif char == ')':
            if not stack:
                return False  # Extra closing parenthesis
            stack.pop()  # Pop matched opening

    return len(stack) == 0  # True if all parentheses matched

# Test examples
parentheses1 = "((()))"
parentheses2 = "(()())"
parentheses3 = "(()"
parentheses4 = "())"

# Output results
print(is_balanced(parentheses1))  # True
print(is_balanced(parentheses2))  # True
print(is_balanced(parentheses3))  # False
print(is_balanced(parentheses4))  # False
