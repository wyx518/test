class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }

        Arrays.sort(nums); // 对数组进行排序

        for (int i = 0; i < nums.length - 3; i++) { // 第一个加数
            if ( i > 0 && nums[i] == nums[i - 1]) { // 第一个加数使用不重复
                continue;
            }

            for (int j = nums.length - 1; j > i + 2 ; j--) { // 第四个加数
                if (j < nums.length - 1 && nums[j] == nums[j + 1]) { // 第四个加数使用不重复
                    continue;
                }

                int start = i + 1; // 第二个加数
                int end = j - 1; // 第三个加数
                int n = target - nums[i] - nums[j];

                while (start < end) {
                    if (nums[start] + nums[end] == n) {
                        List<Integer> four = new ArrayList<>(4);
                        four.add(nums[i]);
                        four.add(nums[start]);
                        four.add(nums[end]);
                        four.add(nums[j]);

                        result.add(four);

                        do {
                            start++;
                        } while (start< end && nums[start] == nums[start - 1]); // 保证再次使用第二个数不重复

                        do {
                            end--;
                        } while (start < end && nums[end] == nums[end + 1]); // 保证再次使用第三个数不重复
                    } else if (nums[start] + nums[end] < n) {
                        do {
                            start++;
                        } while (start< end && nums[start] == nums[start - 1]); // 保证再次使用第二个数不重复
                    } else {
                        do {
                            end--;
                        } while (start < end && nums[end] == nums[end + 1]); // 保证再次使用第三个数不重复
                    }
                }
            }
        }
        return result;
    }
}