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
        		int[] arr = {10,2,33,4,5,6,1,22,3,7};
		//배열 선언 
		for(int i = 0; i < arr.length; i++) { //i 번째 숫자 선택
			int minIdx =i; //선택된 숫자의 index 저장
			for(int j = i + 1;  j < arr.length; j++) { // i 번째 이후 숫자들과 비교
				if(arr[j] < arr[minIdx]) {
					minIdx  = j;
				}
			}// i 번째 이후 숫자들 중에 가장 작은 숫자의 index 저장
			int tmp = arr[i];
			arr[i] = arr[minIdx]; 
			arr[minIdx] = tmp;
			//swap i 와 minIdx 의 위치를 바꿈 
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ",arr[i]);	
		}
		//배열이 제대로 sort 되었는지 확인
		/*
		 * 앞에부터 차례로 작은 수를 정렬하는 방식
		 */
    }
    public void print(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
