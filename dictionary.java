public class dictionary {
    public static void main(String[] args) {
        String s = "leetcode";
        String[] wordDict = {"leet","code"};
       
        for (int i = 0; i < wordDict.length; i++) {
            if (s.contains(wordDict[i])) {
              s= s.replace(wordDict[i], "");
  
            } 
        }
        if (s=="") {
        
            System.out.println("true");
        }else{
            
            System.out.println("false");
        }
    }
}
