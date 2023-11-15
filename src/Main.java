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
        for (int i= 1; i < arr.length; i++) { // 배열 탐색 i = 배열의 인덱스, j 설정을 위해 i는 1부터 시작
            int temp = arr[i]; // 뒤의 원소들을 위해 비교 대상이 되는 원소의 현재값 저장
            int j = i - 1; // 이미 정렬 완료된 인덱스를 나타내기 위함
            while (j >= 0 && temp < arr[j]){ // 조건 : 범위 설정 + 현재값이 정렬된 부분보다 작은지 값 비교
                arr[j + 1] = arr[j]; // 조건 만족 시 오른쪽으로 한 칸 이동
                j--; // 순차적인 비교를 위한 감소
            }
            arr[j + 1] = temp; // 해당 위치에 값 삽입
        }
    }
    public void print(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}