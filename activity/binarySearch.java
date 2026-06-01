import java.util.*;

public class binarySearch {
    public static int binarySearch(int[]list,int target){
        int left=0;
        int right=list.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(list[mid]==target){
                return mid;
            } else if(list[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] onlist={18,29,39,20,12,49};
            boolean found=false;
            Arrays.sort(onlist);
            int target=29;
        int    result=binarySearch(onlist,target);
            if(result!=-1){
                found=true;
            }
              if(found){
            System.err.println("The target is found "+target+"at index "+result);
        } else {
            System.out.println("target is not found");
        }
        }
    }

