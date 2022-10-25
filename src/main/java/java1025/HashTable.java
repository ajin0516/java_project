package java1025;

import java.util.HashSet;
import java.util.Set;

public class HashTable {
    private int size = 1000;
    private int[] table = new int[size];
    public HashTable() {
    }
    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }
    // 지정된 크기의 배열에 값을 저장하기 위해 asciiSum % size;
    // ex) 1000이라면 asciiSum % size; 하면 0~999사이의 값이 나와서 벗어나지 않음
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }
    // 데이터 저정하는 함수
    public void insert(String key, Integer value){
        int hashCode = hash(key);
        this.table[hashCode] = value;
        System.out.println(key + " " + hashCode + "방에 저장이 완료되었습니다.");
    }
    public int search(String key){
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTable ht = new HashTable();
        Set<Integer> nameSet = new HashSet<>();
        for (int i = 0; i < names.length; i++) {
            nameSet.add(ht.hash(names[i]));
        }
        System.out.printf("name : %s  nameSet : %s\n", names.length, nameSet.size());


        HashTable ht2 = new HashTable(200);
        for (int i = 0; i < names.length; i++) {
            ht2.insert(names[i], ht2.hash(names[i]));
        }
        System.out.println(ht2.search("DongyeonKang"));
        System.out.println(ht2.search("JiyoungAhn"));

    }
}
