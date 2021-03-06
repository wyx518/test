class Solution {
    public int[] plusOne(int[] digits) {
        int carries = 1;
        for(int i = digits.length-1; i>=0 && carries > 0; i--)
        {  // fast break when carries equals zero
            int sum = digits[i] + carries;
            digits[i] = sum % 10;
            carries = sum / 10;
        }
        if(carries == 0)
            return digits;
            
        int[] rst = new int[digits.length+1];
        rst[0] = 1;
        for(int i=1; i< rst.length; i++){
            rst[i] = digits[i-1];
        }
        return rst;
        //         int[] tmp=new int[2];
//         tmp[0]=1;
//         tmp[1]=0;
//         if(digits.length==1)
//         {
//             if(digits[digits.length-1]==9)
//             {
//                 return tmp;
//             }
//             digits[digits.length-1]++;
//             return digits;

//         }
//         int flag=digits.length-1;
//         while(digits[flag]==9)
//         {
//             digits[flag]=0;
//             flag--;
//         }
//         digits[flag]++;
//         return digits;
    }
}