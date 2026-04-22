class Solution:
    def decodeString(self, s: str) -> str:
        count_stack = []
        string_stack = []
        current_string = ""
        k = 0

        for ch in s:
            if ch.isdigit():
                k = k * 10 + int(ch)   
                
            elif ch == '[':
                count_stack.append(k)
                string_stack.append(current_string)
                current_string = ""
                k = 0
                
            elif ch == ']':
                count = count_stack.pop()
                prev_string = string_stack.pop()
                current_string = prev_string + current_string * count
                
            else:
                current_string += ch

        return current_string