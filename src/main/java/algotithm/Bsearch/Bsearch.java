package algotithm.Bsearch;

public class Bsearch {
    private  int low;
    private  int high;
    private  int mid;
    public   int[] arrowToSearch = new int[100];
    private Result result;
    public  Bsearch(){
        low = 0;
        high = 0;
        mid = (low+high)/2;
        result = new Result();
    }
    public  void initArrow(){
        for(int i=0;i<100;i++){
            arrowToSearch[i]=i*i;
        }
    }
    public  Result bSearch(int [] arrowToSearch,int key){
        low = 0;
        high = arrowToSearch.length-1;
        System.out.println(arrowToSearch.length+"len");
        mid = (low+high)/2;
        while (low<=high){
            System.out.println("iam in");
            if (arrowToSearch[mid]==key){
                result.setResult(mid);
                result.setValue(key);
                return result;
            }
            else if(arrowToSearch[mid]>key){
                high = mid-1;
            }
            else {
                low =mid+1;
            }
            mid = (low+high)/2;
        }
        return result;

    }

}


