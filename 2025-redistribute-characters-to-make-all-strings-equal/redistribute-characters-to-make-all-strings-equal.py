class Solution:
    def makeEqual(self, words):
        freq = [0] * 26   
        
        for word in words:
            for ch in word:
                index = ord(ch) - ord('a')
                freq[index] += 1
        
        n = len(words)
        
        for count in freq:
            if count % n != 0:
                return False
        
        return True