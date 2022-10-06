package Java1006;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FIleExercise2 {
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
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

    public static void main(String[] args) throws IOException {
        // ./
        FIleExercise2 fIleExercise = new FIleExercise2();

        String str = fIleExercise.readNChars("aa_file.txt",10);
        System.out.println(str);
    }
}
