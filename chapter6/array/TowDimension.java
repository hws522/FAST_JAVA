package chapter6.array;

public class TowDimension {
    
    public static void main(String[] args) {
        
        int[][] arr = { {1,2,3}, {4,5,6,7} };

        System.out.println(arr.length); //2차원배열 전체에서는 행의 개수를 생각하면 된다. 중괄호 기준으로 뭉쳐서 생각하면 이해됨.
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        //2, 3, 3

        for(int i = 0; i < arr.length; i++) //모두 출력할려면, 행을 기준으로 열을 돌리면 된다.
        {
            for(int j = 0; j < arr[i].length; j++) //각 행의 길이만큼.
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //1 2 3
        //4 5 6 7
    }
}
