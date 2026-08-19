class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        s=[]
        i,j=0,0
        while i<len(word1) and j< len(word2):
            s.append(word1[i])
            s.append(word2[j])
            i+=1
            j+=1
        if i<len(word1):
            s.append(word1[i:])
        if j<len(word2):
            s.append(word2[j:])

        return "".join(s)
        