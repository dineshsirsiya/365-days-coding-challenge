class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i =0;//DEfault type
        if(ruleKey.equals("color")){
            i=1;
        }
        if(ruleKey.equals("name")){
            i=2;
        }
       int matches =0;
       for(int j=0;j<items.size();j++){
        if(items.get(j).get(i).equals(ruleValue)){
            matches++;
        }
       }
        return matches;

    }
}
