public class sortedMinMax {
//    sort the array such that first element is the largest element, second element is the smallest,
//    third is second largest so on and so forth...
//    Ex:a={1,2,3,4,5,6,7}
//       Result={7,1,6,2,5,3,4}

    public static int[]sortMinMax(int []a){
                int maxidx=a.length-1;
                int minidx=0;
                int max=a[maxidx]+1;
                for (int i=0;i<a.length;i++){
                    if(i%2==0){
                        a[i]=(a[i]+a[maxidx]%max)*max;
                        maxidx--;
                    }
                    else {
                        a[i]=(a[i]+a[minidx]%max)*max;
                        minidx++;
                    }
        }
                for (int i=0;i<a.length;i++){
                    a[i]=a[i]/max;
                }


        return a;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        int []c=sortMinMax(a);
        for(int d:c){System.out.print(d+" ");}
    }
}
