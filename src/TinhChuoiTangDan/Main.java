package TinhChuoiTangDan;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();

        for(int i=0; i < str.length(); i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i+1; j < str.length(); j++){
                if(str.charAt(j) > list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for(Character character : max){
            System.out.println(character);
        }
        System.out.println();
    }
}
