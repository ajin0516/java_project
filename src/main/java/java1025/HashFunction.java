package java1025;

public class HashFunction {

    public int hash(String key){
        int asciisum = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int ascii = c;
            System.out.printf("%s %d\n",c, ascii);
            asciisum += ascii;
        }
        System.out.println("asciisum : " +asciisum);

//        나머지 왜 구해?
        return asciisum % 90;
    }


    public static void main(String[] args) {
        HashFunction hashFunction = new HashFunction();
        hashFunction.hash("leeajin");
    }
}
