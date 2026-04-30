class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_hashset = set(nums)
        longest_streak = 0

        for num in num_hashset:
            if num -1 not in num_hashset:
                current_streak = 1
                curr_num = num
                while curr_num + 1 in num_hashset:
                    current_streak += 1
                    curr_num += 1
                longest_streak = max(longest_streak,current_streak)
        return longest_streak
