# Lab Activity: Stack
# Purpose: Demonstrate a stack using Python
# Operations: push elements, pop elements (LIFO), check if stack is empty

stack = []  # Initialize empty stack

# Push elements onto the stack
stack.append("Alice")
stack.append("Bob")
stack.append("Charlie")

# Pop elements and print to show LIFO order
print(stack.pop())  # Charlie
print(stack.pop())  # Bob
print(stack.pop())  # Alice

# Check if the stack is empty
print(len(stack) == 0)  # True
