package Day5;
public class LC13RomanToInteger {

    public static int romanToInt(String s) {
        int total = 0;

        for(int i = 0; i < s.length(); i++) {

            int curr = romanToIntHelp(s.charAt(i));

            if(i < s.length() - 1 && curr < romanToIntHelp(s.charAt(i + 1))) {
                total -= curr;
            }
            else {
                total += curr;
            }
        }

        return total;
    }

    public static int romanToIntHelp(char ch)
    {
        if(ch == 'I') return 1;
        else if(ch == 'V') return 5;
        else if(ch == 'X') return 10;
        else if(ch == 'L') return 50;
        else if(ch == 'C') return 100;
        else if(ch == 'D') return 500;
        else if(ch == 'M') return 1000;

        return 0;
    }

    public static void main(String[] args) {

        String s1 = "III";
        String s2 = "IV";
        String s3 = "IX";
        String s4 = "MCMXCIV";

        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
        System.out.println(romanToInt(s3));
        System.out.println(romanToInt(s4));
    }
}
