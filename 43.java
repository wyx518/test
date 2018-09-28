class Solution {
    public String multiply(String num1, String num2) {
        if(num1=="0"||num2=="0")
            return "0";
        if (num1 == null || num2 == null) 
            return null;
        int m=num1.length();
        int n=num2.length();
        int[] num3 = new int[m+n];
        int product=0;
        int carry=0;
        int i,j;
       // System.out.println(m);
        for(i =m-1;i>=0;i--)
        {
            carry=0;
            for(j = n-1;j>=0;j--)
            {
               // System.out.println("----");
            //    System.out.println(num1.charAt(i));
                //System.out.println(x);
                product=carry+num3[i+j+1]+(num2.charAt(j)-'0')*(num1.charAt(i)-'0');
                num3[i+j+1]=product%10;
                carry=product/10;
           //     System.out.println(res);
            }
            num3[i+j+1]=carry;
        }
        StringBuilder sb = new StringBuilder();
        i = 0;

        while (i < m+n - 1 && num3[i] == 0) {
            i++;
        }

        while (i < m+n) {
            sb.append(num3[i++]);
        }

        return sb.toString();
    }
}