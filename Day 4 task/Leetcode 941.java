class Leetcode941 {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3) return false;
        int index=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                index=i;
                break;
            }
        }
        if(index == -1 || index==0 || index == n - 1) return false;
        for(int i=0;i<index;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        for(int i=index;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}