
public class da {
public static void main(String[] args) {
    int[] a={6,2,9,1,5,7};
    int carry=1;
    int sum=0;
    for(int i=0; i<a.length;i++){
       int v =a[i]+carry;
       carry=(v%3)+1;
       int add=(v+carry*(i+1))%10;
       if(i %2==0)add=add+2;
       sum =sum+add;
       
        
        System.out.println("i="+i+" v="+v+" carry="+carry+" add="+add+" sum="+sum);
    }
    System.out.println("FINAL "+sum);
}}
