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
        for (int i = 0; i < arr.length - 1; i++) // 배열의 첫번쩨 인덱스부터 마지막 인덱스까지 반복
            {
                int minIdx = i; // 비교군중 가장 작은 인덱스를 저장할 변수 선언후 현재 요소인 i로 초기화
                for (int j = i + 1; j < arr.length; j++) //현재 인덱스 다음부터 배열 끝까지 반복
                    {
                        if (arr[j] < arr[minIdx]) // 현재 인덱스의 값보다 작을 시
                        {
                            minIdx = j; // 가장 작은 인덱스 저장
                        }
                    }
                swap(arr,i,minIdx); // 최소값과 현재 인덱스의 변경
    }
    public void print(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
