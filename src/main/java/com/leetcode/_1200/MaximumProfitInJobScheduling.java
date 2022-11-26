package com.leetcode._1200;

import java.util.Arrays;

class MaximumProfitInJobScheduling {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = profit.length;
        Job[] jobs = new Job[n];
        for (int i = 0; i < startTime.length; i++) {
            jobs[i] = (new Job(startTime[i], endTime[i], profit[i]));
        }

        int dp[] = new int[jobs.length];
        Arrays.sort(jobs, (a, b)->(a.end - b.end));

        Arrays.stream(jobs).forEach(System.out::println);

        dp[0] = jobs[0].profit;
        for (int i = 1; i < jobs.length; i++){
            dp[i] = Math.max(jobs[i].profit, dp[i-1]);
            for(int j = i-1; j >= 0; j--){
                if(jobs[j].end <= jobs[i].start){
                    dp[i] = Math.max(dp[i], jobs[i].profit + dp[j]);
                    break;
                }
            }
        }

        Arrays.stream(dp).forEach(System.out::println);

        int max = Integer.MIN_VALUE;
        for (int val : dp) {
            max = Math.max(val, max);
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumProfitInJobScheduling maximumProfitInJobScheduling = new MaximumProfitInJobScheduling();
        int[] start = new int[]{1, 2, 3, 4,6};
        int[] end = new int[]{3, 5,10,6,9};
        int[] profit = new int[]{20,20,100,70,60};
        int maxProfit = maximumProfitInJobScheduling.jobScheduling(start, end, profit);
        System.out.println(maxProfit);
    }

    class Job {
        int start, end, profit;

        public Job(int s, int e, int p) {
            this.start = s;
            this.end = e;
            this.profit = p;
        }

        @Override
        public String toString() {
            return "Job{" +
                    "start=" + start +
                    ", end=" + end +
                    ", profit=" + profit +
                    '}';
        }
    }
}
