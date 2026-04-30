class Solution {
    public boolean isAnagram(String s, String t) {
        //base condition
        if( s.length() != t.length() ) return false;
        Map<Character,Integer> sMap = new HashMap<>();

        int l = s.length();

        for(int i =0; i < l; i++){
            // System.out.println("char: "+s.charAt(i) + " value: "+ sMap.getOrDefault(s.charAt(i), 0) );
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i =0; i < l; i++){
            if(!sMap.containsKey(t.charAt(i))) return false;
            sMap.put(t.charAt(i),sMap.get(t.charAt(i)) - 1);
        }
        // sMap.forEach((k,v)-> System.out.println(k + " " +v));
        for(Map.Entry<Character,Integer> entry: sMap.entrySet()){
            if(entry.getValue() != 0) return false;
        }
        return true;
    }
}
