package chapter6.array;

public class ArrayCopy {
    
    public static void main(String[] args) {
        
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5};

        //한곳에서 다른곳으로 배열을 복사하려면,
        System.arraycopy(arr1, 0, arr2, 1, 3); // arr1에서, 0번째부터, arr2에, 1번위치에, 3개.
                                                //범위를 조심.
        
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
