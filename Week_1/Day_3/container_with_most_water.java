package Day_3;

public class container_with_most_water {

    public int maxArea(int[] height) {
        int n =height.length;
        //making two pointers
        int left =0;
        int right =n-1;
        int newarea=0;


        // calculate area which is= l*h

        while(left<right){
            //length =final index=intial and height =min hegight of (initial ,final)
            int length=right-left;
            int breadth = Math.min(height[left], height[right]);
            int area = length*breadth;
            newarea = Math.max(area, newarea);

            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }



        }




        return newarea;


    }
}
