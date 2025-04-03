class Solution:
    def kthCharacter(self, k: int) -> str:
        s="a"
        while(len(s)<k):
            gs=""
            for i in s:
                if i=='z':
                    gs+='a'
                else:
                    gs+=chr(ord(i)+1)
            s+=gs
        return s[k-1]