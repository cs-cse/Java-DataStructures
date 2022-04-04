public class PreviousNumberInOneSwapGFG {

    static void swap(int i,int j,char[] arr){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static String previousNumber(String S){
        char[] arr=S.toCharArray();
        int n=arr.length;
        int indexPrev=-1,indexNext=-1;
        for(int i=n-1;i>0;i--){
            char prev=arr[i-1];
            char curr=arr[i];
            if(prev>curr){
                indexPrev=i-1;
                break;
            }
        }
        if(indexPrev==-1)
            return "-1";
        for(int i=n-1;i>0;i--){
            if(arr[i]<arr[indexPrev]){
                indexNext=i;
                break;
            }
        }
        char repeated=arr[indexNext];
        for(int i=indexNext-1;i>0;i--){
            if(arr[i]!=repeated){
                indexNext=i+1;
                break;
            }
        }
        if(indexPrev==0 && arr[indexNext]=='0')
            return "-1";
        swap(indexPrev,indexNext,arr);
        return new String(arr);
    }
}
