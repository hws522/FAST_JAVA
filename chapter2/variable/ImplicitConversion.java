package chapter2.variable;

public class ImplicitConversion {
    public static void main(String[] args) {
        
        byte bNum = 10;
        int iNum = bNum; //묵시적 형변환. 따로 해줄 것 없음.

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum; //두번의 형변환이 일어남. 더할 때 정수에서 실수로, 대입할 때 foat -> double 로.

        System.out.println(dNum);

    }
}