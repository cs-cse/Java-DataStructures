public class productArray {
//    return an array containing product of all elements of array
//    except ith index
//    Ex:arr1=[1,2,3,4]     Ex2:arr2=[-1,1,0,-3,3]
//       ans1=[24,12,8,6]       ans2=[0,0,9,0,0]

    public static void productElement(int []a){
        int temp=1;
        int []result=new int[a.length];
        for(int i=0;i< a.length;i++){
            result[i]=temp;
            temp=temp*a[i];
        }
        temp=1;
        for (int i=a.length-1;i>=0;i--){
            result[i]=result[i]*temp;
            temp=temp*a[i];
        }
        for(int c:result){
            System.out.print(c+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        productElement(arr1);
        System.out.println();
        int arr2[]={-1,1,0,-3,3};
        productElement(arr2);

    }
}
