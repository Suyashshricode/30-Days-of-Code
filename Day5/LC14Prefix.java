package Day5;
public class LC14Prefix {
  public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length==0)
        {
            return "";
        }
        // now lets find minimum length to handle edge case 
        int minLength = strs[0].length();

        for(int i=1; i<strs.length; i++)
        {
            if(strs[i].length() < minLength)
            {
                minLength = strs[i].length();
            }
        }
        int i = 0;
        while(i<minLength)
        {
            char ch = strs[0].charAt(i);

            for(int j=1; j<strs.length; j++)
            {
                if(strs[j].charAt(i) != ch)
                {
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }
        return strs[0].substring(0,i);
    }

  public static void main(String[] args) {
    String[] strs = {"flower", "flow", "flight"};

    String result = longestCommonPrefix(strs);

    System.out.println("Longest Common Prefix: " + result);
  }
}
