class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        double mid;
        //if(nums1.length>nums2.length)
    //    {
            for(i=0;i<=nums1.length-1;)
            {
               // System.out.println(nums1.length);
                if (nums2.length==0)
                    nums3[k]=nums1[i];
                else
                while(nums1[i]>nums2[j])
                {
                    //System.out.println(nums1.length); 
                    nums3[k++]=nums2[j++];
                  //    System.out.println(nums3[0]);
                //    System.out.println(nums3[1]);
                 //    System.out.println(nums3[2]);
                    while(j==nums2.length&&i<nums1.length)
                    {
                        
                        if(k==nums1.length+nums2.length)
                        break;
                        nums3[k++]=nums1[i++];
                        //j--;
                       // System.out.println("11111111");
                    }
                    if(k==nums1.length+nums2.length)
                        break;
                }
                if(k==nums1.length+nums2.length)
                        break;
                nums3[k++]=nums1[i++];
               
                while(i==nums1.length&&j<nums2.length)
                {
                    nums3[k++]=nums2[j++]; 
                    System.out.println("i="+i);
                    System.out.println("j="+j);
                    System.out.println("k="+k);
                  
                }
                
                
            }
        while(nums1.length==0&&j<nums2.length)
        nums3[k++]=nums2[j++];
        // System.out.println(nums3[0]);
        //  System.out.println(nums3[1]);
       // }
        if((nums1.length+nums2.length)%2!=0)
         mid=nums3[(nums1.length+nums2.length-1)/2];
         //   System.out.println(mid);}
        else
            //return nums3[(nums1.length+nums2.length)/2-1]*1.0+nums3[(nums1.length+nums2.length)/2]*1.0)/2;
        
        mid=(nums3[(nums1.length+nums2.length)/2-1]*1.0+nums3[(nums1.length+nums2.length)/2]*1.0)/2;
       //  System.out.println(nums3[(nums1.length+nums2.length)/2-1]);
      //   System.out.println(nums3[(nums1.length+nums2.length)/2]);
      //   System.out.println(mid);}
        return mid;
            //return nums3[(nums1.length+nums2.length-1)/2];
        //else return (nums3[(nums1.length+nums2.length)/2-1]+nums3[(nums1.length+nums2.length)/2])/2;
        
    }
}