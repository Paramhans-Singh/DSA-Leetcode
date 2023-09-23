class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        return myAtoi(s, 0, -1, 0);
    }

    private int myAtoi(String s, int i, int sign, int result) {
        if(i >= s.length()) return result;

        char ch = s.charAt(i);
        if(sign != -1) {
            if(Character.isDigit(ch)) {
                int dig = ch - '0';
                if(sign == 1) {
                    if((result < Integer.MIN_VALUE / 10) || ((result == Integer.MIN_VALUE / 10) && dig >= 8))
                        return Integer.MIN_VALUE;
                    result = result * 10 - dig;
                    return myAtoi(s, i + 1, sign, result);
                }
                if((result > Integer.MAX_VALUE / 10) || ((result == Integer.MAX_VALUE / 10) && dig >= 7))
                    return Integer.MAX_VALUE;
                result = result * 10 + dig;
                return myAtoi(s, i + 1, sign, result);
            }
            return result;
        } else {
            if(ch >= '1' && ch <= '9') {
                int dig = ch - '0';
                if((result >= Integer.MAX_VALUE / 10) && dig >= 8)
                    return Integer.MAX_VALUE;
                result = result * 10 + dig;
                return myAtoi(s, i + 1, 0, result);
            }
            else if(ch == ' ') return myAtoi(s, i + 1, sign, result);
            else if(ch == '0') return myAtoi(s, i + 1, 0, result);
            else if(ch == '-') return myAtoi(s, i + 1, 1, result);
            else if(ch == '+') return myAtoi(s, i + 1, 0, result);
            else return result;
        }
    }
}