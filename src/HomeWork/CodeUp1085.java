package HomeWork;

import java.io.*;

public class CodeUp1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] a = br.readLine().split(" ");
        int h = Integer.valueOf(a[0]);
        int b = Integer.valueOf(a[1]);
        int c = Integer.valueOf(a[2]);
        int s = Integer.valueOf(a[3]);

        float num=(float)h*b*c*s/8/1024/1024;

        System.out.format("%.1f MB", num);
    }
}


