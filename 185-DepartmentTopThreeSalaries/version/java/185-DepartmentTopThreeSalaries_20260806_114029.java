// Last updated: 8/6/2026, 11:40:29 AM
1/**
2 * Sliding Window solution using Buckets
3 *
4 * Time Complexity: O(N)
5 *
6 * Space Complexity: O(min(N, K+1))
7 *
8 * N = Length of input array. K = Input difference between indexes.
9 */
10class Solution {
11    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
12        if (nums == null || nums.length < 2 || k < 1 || t < 0) {
13            return false;
14        }
15
16        HashMap<Long, Long> buckets = new HashMap<>();
17        // The bucket size is t+1 as the ranges are from 0..t, t+1..2t+1, ..
18        long bucketSize = (long) t + 1;
19
20        for (int i = 0; i < nums.length; i++) {
21            // Making sure only K buckets exists in map.
22            if (i > k) {
23                long lastBucket = ((long) nums[i - k - 1] - Integer.MIN_VALUE) / bucketSize;
24                buckets.remove(lastBucket);
25            }
26
27            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
28            long bucket = remappedNum / bucketSize;
29
30            // If 2 numbers belong to same bucket
31            if (buckets.containsKey(bucket)) {
32                return true;
33            }
34
35            // If numbers are in adjacent buckets and the difference between them is at most
36            // t.
37            if (buckets.containsKey(bucket - 1) && remappedNum - buckets.get(bucket - 1) <= t) {
38                return true;
39            }
40            if (buckets.containsKey(bucket + 1) && buckets.get(bucket + 1) - remappedNum <= t) {
41                return true;
42            }
43
44            buckets.put(bucket, remappedNum);
45        }
46
47        return false;
48    }
49}