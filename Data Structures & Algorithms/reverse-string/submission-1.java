class Solution {
    public void reverseString(char[] s) {
        reverseStringRecr(0,s.length-1,s);
        // int i =0, j = s.length-1;
        // while(i < j){
        //     char t = s[i];
        //     s[i] = s[j];
        //     s[j]= t;
        //     i++;
        //     j--;
        // }
    }

    void reverseStringRecr(int start, int end, char[] s){
        if(end <= start) return;

        char t = s[start];
        s[start]= s[end];
        s[end] = t;
        reverseStringRecr(start+1,end -1,s);
    }
}