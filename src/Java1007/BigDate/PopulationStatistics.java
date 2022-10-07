package Java1007.BigDate;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    // 한글자씩
    public void readByChar(String filename) throws IOException {
        // 파일 위치
        FileReader fileReader = new FileReader(filename);
        // 파일 읽지 않는다.

        String fileContents ="";
        while(fileContents.length() < 1_000_000) {
            // read 사용했을 때 읽음
            char c = (char)fileReader.read(); // 한글자만 읽어오는 것
            fileContents += c; // 1바이트씩 쌓기위해
        }
        System.out.println("filename" + fileContents);

    }

    // 파일의 주소를 파라미터로 받는 메서드
    public List<PopulationMove> readByLine(String filename) throws IOException {
        //읽어온 데이터를 List에 담아 줄 것
        List<PopulationMove> pml = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(filename) // 파일name에 해당하는 file의 경로로
       );

        String str ="";
        while((str = reader.readLine()) != null) {
            System.out.println(str);
            PopulationMove pm = parse(str); //한 줄씩 들어오는 str parsing
            pml.add(pm);
        }
        reader.close();
        return pml;

    }

    // 자바 8스타일 파일 가져오기
    public void readByLine2(String filename) throws IOException {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line); // 읽어온 파일 콘솔에 찍어주기
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public PopulationMove parse(String data) {

        String[] cityArr = data.split(",");
        int inCity = Integer.parseInt(cityArr[0]);
        int toCity = Integer.parseInt(cityArr[6]); // 생성자 오버로딩

        return new PopulationMove(inCity,toCity);
    }

    // 파일 생성 메서드
    public  void  createFile(String filename){
        File file = new File(filename);
        try{
            System.out.println("파일 생성성");
           file.createNewFile(); // 이 함수까지 실행해줘야 파일이 생긴다
        }catch (IOException e){
            System.out.println("파일 생성 못함");
            throw new RuntimeException();
        }
    }

    public void write(List<String> strs, String filename) throws IOException{

        // 1.파일 객체 생성
        File file = new File(filename);
        // 2. 파일 존재여부 체크 및 생성
        if(!file.exists()){
            file.createNewFile();
        }

        // 3. Buffer를 사용해서 File에 write할 수 있는 BufferedWrite 생성
        FileWriter fw = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fw);

        // 4. 파일에 쓰기
        for (String str : strs) {
            writer.write(str);
        }

        // 5. BufferedWrite close
        writer.close();
    }

    // PopulationMove -> "11,11" // from, to
    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public static void main(String[] args) throws IOException {

        String address = "D:\\Users\\LEEAJIN\\Desktop\\2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
//        populationStatistics.readByChar(address);
//        populationStatistics.readByLine(address);
        List<PopulationMove> pml = populationStatistics.readByLine(address);
        List<String> strings = new ArrayList<>();

        for (PopulationMove pm : pml) {
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
        }
    }
}