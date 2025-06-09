public class Sprialpattern
{
    public static void main(String[]args)
    {
        int [][] a =
                {
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };
        isSpringPattern(a);
    }
    public static void isSpringPattern(int [][]a)
    {
        int j =0;
        int left = j, right =a.length-1,top=j,bottom= a.length-1;
        //left to right
        while (left <= right && top <= bottom)
        {
            for (int i = left; i <= right ; i++)
            {
                System.out.print(a[top][i]+" ");
            }
            top++;
            //top to botton
            for (int i = top; i <= bottom ; i++)
            {
                System.out.print(a[i][right]+" ");

            }
            right--;
            //right to left
            for (int i = right; i >= left ; i--) {
                System.out.print(a[bottom][i]+" ");

            }
            bottom--;

            //bottom to top

            for (int i = bottom; i >= top ; i--)
            {
                System.out.print(a[i][left]+ " ");
            }
            left++;
        }
    }
}