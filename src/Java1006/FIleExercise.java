package Java1006;

import java.io.*;

public class FIleExercise {
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }

    // 한글자 읽어오기
    public char readAChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    // 두글자 읽어오기
    public String read2Chars(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }

    // n글자 읽어오기
    public String readNChars(String filename, int N) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        for(int i = 0; i < N; i++) {
            // -가 나올 경우 break
            int asciiCd = fileReader.read();
            if(asciiCd == -1){
                return str;
            }
            str += (char) asciiCd;
        }
        return str;
    }

    public String readLine(String filename) throws IOException{
        FileReader reader = new FileReader(filename);
        BufferedReader fileReader = new BufferedReader(reader);
        String result = fileReader.readLine();
        return result;
    }

    public String readAll(String filname) throws IOException{
        BufferedReader fileReader = new BufferedReader(new FileReader(filname));
        String result= "";
//        String tmp;

        // readLine 이 null이 아닐 때 while반복문을 돌려  result에 저장->실패
//        while((tmp=fileReader.readLine())!=null) {
//            result += tmp;
//        }
//        return result;
        while(fileReader.readLine()!=null){
            result += fileReader.readLine();
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        // ./
        FIleExercise fIleExercise = new FIleExercise();
//        char ch = fIleExercise.readAChar("aa_file.txt");
//        String str = fIleExercise.read2Chars("aa_file.txt");
//        String str2 = fIleExercise.readNChars("aa_file.txt",10);
//        System.out.println(ch);
//        System.out.println(str);
//        System.out.println(str2);
//        String result = fIleExercise.readLine("aa_file.txt");
        String result = fIleExercise.readLine("aa_file.txt");
//          System.out.println(result);
          System.out.println(result);
    }

}
