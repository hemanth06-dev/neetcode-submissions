class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        num_dic = {}
        for i,v in enumerate(nums):
            res = target - v
            if res in num_dic:
                return [num_dic[res],i]
            num_dic[v] = i
        
        