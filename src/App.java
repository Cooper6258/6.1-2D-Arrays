public class App {
    public static void main(String[] args) throws Exception {
        boolean[][] nums = new boolean[2][5];
        boolean[][] nums2 = {{false, false, false, false, false},
                             {false, false, false, false, false}};


        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++){
                System.out.println(nums[r][c]);
            }
        }

        nums[1][0] = true;
        System.out.println(nums[1][0]);
    }
}
