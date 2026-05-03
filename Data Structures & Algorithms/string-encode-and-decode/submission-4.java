class Solution {
    String DELIMITER = "#";
    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();

        for(String s : strs){// n
            encodedStr.append(s.length() + DELIMITER + s ); // ??
        }
        return encodedStr.toString(); // ??

    }

    public List<String> decode(String str) {
        
        int start = 0;
        int len = 0;
        List<String> decodedStrs= new ArrayList<>();
        // System.out.println("str: "+str);
        // "5#Hello5#World"
        //        ^
        // len = 5
        // 
        // i = 5
        for(int i = 0; i < str.length();){
            // System.out.print(" "+str.charAt(i));
            // System.out.print(" I; "+i);
            if(!DELIMITER.equals(""+str.charAt(i)) ){
                len = Integer.parseInt("" + str.charAt(i)) + len * 10;
                
            }else{
                int j = 0;
                StringBuilder word = new StringBuilder();
                while( j < len){ // j = 5 < 5
                    word.append(str.charAt(j+i+1)); //hell0
                    j++;
                }
                decodedStrs.add(word.toString());
                len = 0;
                i = i + j;
            }
            i++;
        } 
        return decodedStrs;  
    }
}
