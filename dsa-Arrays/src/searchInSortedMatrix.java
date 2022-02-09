public class searchInSortedMatrix {
    public static void search(int[][]matrix,int n,int x){
        int i=0;
        int j=n-1;
        while (i<n &&j>=0){
            if(matrix[i][j]==x){
                System.out.println("Found at: "+i+","+j+" (i,j)");
                return;
            }
            if (matrix[i][j]>x){
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int [][]matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        search(matrix,3,4);
    }
}
