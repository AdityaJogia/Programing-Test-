public class jump {
    public static void main(String[] args) {
        int arr[] ={5,2,1,0,4};
        int last = arr.length-1;
        boolean flag = false;
        int i =0;
        while(i!=last){
            
            i = i+arr[i];
            if(i>last){
                break;
            } else if (arr[i]==0) {
                break;
            }else if (i==last) {
              flag=true;
              break;
            }
            
        }
        System.out.println(flag);
    }
}
