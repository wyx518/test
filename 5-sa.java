class Solution {
public String longestPalindrome(String s) {
        String t ="$#";
        for (int i = 0; i < s.length(); ++i) {
            t += s.charAt(i);
            t += '#';
        }
        int []p=new int[t.length()];
        int id = 0, mx = 0, resId = 0, resMx = 0;
        for (int i = 0; i < t.length(); ++i) {
            p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 1;
            while (i+p[i]<t.length()&&i-p[i]>0&&t.charAt(i + p[i]) == t.charAt(i - p[i])) 
                ++p[i];
            if (mx < i + p[i]) {
                mx = i + p[i];
                id = i;
            }
            if (resMx < p[i]) {
                resMx = p[i];
                resId = i;
            }
        }
        System.out.println(resId);
        System.out.println(resMx);
        return s.substring((resId - resMx) / 2, (resId - resMx) / 2+resMx - 1);
    }
}