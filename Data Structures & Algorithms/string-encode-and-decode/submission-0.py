class Solution:

    def encode(self, strs: List[str]) -> str:
        # delimator : /:
        encoded_str = ''
        for s in strs:
            s = s.replace('/','//')
            encoded_str += s + '/:'
        return encoded_str



    def decode(self, s: str) -> List[str]:
        i = 0
        current_str = ''
        output = []
        # tesst/:hello//world/:
        while i < len(s):

            if s[i: i + 2] == '//':
                current_str += '/'
                i += 2
            elif s[i: i + 2] == '/:':
                output.append(current_str)
                current_str = ''

                i += 2
            else:
                current_str += s[i]
                i += 1
        return output


