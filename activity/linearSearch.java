import java.util.Arrays;

public class linearSearch {
    public static int linearSearch(int[]list,int target){
for(int i=0;i<list.length;i++){
    if(list[i]==target){
         return i;
        
    }
}

return -1;
    }
    public static void main(String[] args) {
        int[] onlist={18,29,39,20,12,49};
        boolean found=false;
        Arrays.sort(onlist);
        int target=18;
        int result=linearSearch(onlist,target);
        if(result!=-1){
            found=true;
        }
        if(found){
            System.err.println("The target is found "+target+" at index "+result);
        } else {
            System.out.println("target is not found");
        }
    }
}
