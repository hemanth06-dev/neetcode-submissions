class Solution {
    
    int getAsciiOfChar(char c){
        int asciiVal = (int) c;
        if( (asciiVal >= 65 && asciiVal <= 90) || (asciiVal >=97 && asciiVal <= 122) || (asciiVal >=48 && asciiVal <=57)){
            return (c -'a') >=0?c -'a':((c -'A') >=0 ?c -'A':((c -'0') >=0 ? c -'0':-1));
        }
        return -1;
    }

    public boolean isPalindrome(String s) {
        

        // check for char in range [A-Z] || [a-z] [0-9]
        int i = 0; 
        int j = s.length() -1;

        while( i < j){
            int startAscii = getAsciiOfChar(s.charAt(i));
            int endAscii = getAsciiOfChar(s.charAt(j));

            if(startAscii == -1){
                i++;
                continue;
            }
            if(endAscii == -1){
                j--;
                continue;
            }
            System.out.print(s.charAt(i)+" : "+s.charAt(j));
            System.out.println("  : "+startAscii + " - "+endAscii);
            if(startAscii != endAscii){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
