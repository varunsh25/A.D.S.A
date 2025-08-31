public class MostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = currentHeight * width;
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        MostWater solution = new MostWater();
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(heights);
        System.out.println("Maximum area: " + result);
    }
}