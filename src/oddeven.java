public class oddeven {
    public static void main(String[] args) {
        int cnt1=0, cnt2=0;
        int [] marks = new int[6];
        marks[0] = 42;
        marks[1] = 88;
        marks[2] = 73;
        marks[3]=  89;
        marks[4] = 81;
        marks[5] = 91;
        for (int i =0;i<marks.length;i++)
            if (marks[i]%2 == 0) cnt1=cnt1+1;
        else cnt2=cnt2+1;
        System.out.println("Even:" + cnt1);
        System.out.println("Odd:" + cnt2);

    }
}
