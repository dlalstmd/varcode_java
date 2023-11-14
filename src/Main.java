public class Main {
    public static void main(String[] args) {
        sub1 s = new sub1(); // 객체 s생성
        int[] list = new int[10]; // 크기 10인 배열 생성

        for(int i = 0 ; i < 10 ; i++){ // 배열 초기화
            list[i] = i + 1;
        }

        s.sort(list); // 메소드 호출
        s.print(list);
    }
}

class sub1{
    public void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i]; // 인덱스 i값을 변수 tmp에 저장
            int j = i - 1; // 삽입정렬을 위해 비교할 인덱스i-1을 j로 설정해줌

            while (j >= 0 && arr[j] > tmp) { // 배열 범위가 벗어나지 않을 때 && tmp가 이전 요소보다 작을 때
                arr[j + 1] = arr[j]; // tmp보다 큰 요소 한 칸씩 오른쪽으로 이동
                j--; // 이전 요소로 이동
            }
            arr[j + 1] = tmp; // tmp값을 적절한 위치에 끼워넣음
        }
    }
    public void print(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}