class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group_anagrams = {}

        for word in strs:
            key = ''.join(sorted(word))
            if key not in group_anagrams:
                group_anagrams[key] = []
            group_anagrams[key].append(word)
        result = []
        for val in group_anagrams.values():
            result.append(val)
        return result
        