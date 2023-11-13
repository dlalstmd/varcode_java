public class Main {
    public static void main(String[] args) {
        sub1 s = new sub1();
        int[] list = new int[10];

        for(int i=0 ; i<10 ; i++){
            list[i] = i+1;
        }
        s.sort(list);
        s.print(list);
    }
}

class sub1{
    public void sort(int[] arr){
        // 버블 정렬

        // 배열의 요소 순회
        for (int i = 0; i < arr.length - 1; i++) {
            // 마지막 요소 빼고 나머지 요소 순회
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 현재 요소가 뒤의 요소보다 크다면
                if (arr[j] > arr[j + 1]) {
                    // 두 요소의 위치를 바꿈 -> swap 메서드
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    // 두 요소의 위치를 바꾸는 메서드
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //버블 정렬 = 인접한 두 요소를 비교하여 정렬하는 방식.
    //bubbleSort 함수는 정수 배열 인자로 받고, 첫 번째 루프는 배열의 요소들을 전부 살핌
    //두 번째 루프에서 마지막 요소를 제외한 나머지 요소들 비교
    //이 때, 앞 요소가 뒤에 오는 요소보다 크면 두 요소의 위치를 바꾸는 함수를 호출
    //반복해서 오름차순으로 정렬 = 시간 복잡도 O(n^2)

    public void print(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}