# Prefix Sum (누적 합)  

## 코드

```java

public class Main {

    public static void main(String[] args){
        int[] array = {1, 8, 7, 4, 3, 5, 6};
        int n = array.length;
        int[] prefix_sum = new int[n + 1];
        int x = 1;
        int y = 5;
        
        // 누적합 구하기
        for(int i = 0; i < n; i++) {
            prefix_sum[i + 1] = prefix_sum[i] + array[i];
        }
        
        // 구간합 구하기
        int part_sum = prefix_sum[y] - prefix_sum[x - 1];
    }

}

```

## 시간복잡도

* **총 시간복잡도 O(n) x O(1)** 
* prefix_sum 구하기 -> O(n)   
* prefix_sum을 이용한 x와 y 사이의 구간합 -> O(1)  

## 참고
- 구간 쿼리 -> Prefix Sum (정적 배열), 펜윅트리 (동적 배열)   
- prefix_sum 배열의 0번째 인덱스는 비워두기   
- prefix_sum 배열의 크기 = 원래 배열의 크기 + 1  
