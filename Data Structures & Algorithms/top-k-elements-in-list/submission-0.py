class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        num_freq_dict = {}
        for i in nums:
            if i not in num_freq_dict:
                num_freq_dict[i] = 0
            num_freq_dict[i] += 1
        
        freq_arr = []
        for i,v in num_freq_dict.items():
            freq_arr.append([v,i])
        freq_arr.sort()
        result = []
        while len(result) < k:
            result.append(freq_arr.pop()[1])
        return result
        