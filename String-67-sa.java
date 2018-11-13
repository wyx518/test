class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--){
            int x = i < 0 ? 0 : a.charAt(i) - '0';
            int y = j < 0 ? 0 : b.charAt(j) - '0';
            sb.append((x + y +carry) % 2);
            carry = (x + y +carry) / 2;
        }
        if(carry!=0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}