public class Main {
    public static void main(String[] args) {
        sub1 s = new sub1();
        int[] list = null;

        for(int i=0 ; i<10 ; i++){
            list[i] = i+1;
        }
        s.sort(list);
        s.print(list);
    }
}

class sub1{
    public void sort(int[] arr){
        //코드 작성
    }
    public void print(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}