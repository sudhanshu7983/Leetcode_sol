package hasing;

import java.util.Scanner;

public class character_hash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String s = sc.next();
        int hash[]=new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++;

        }
        int query=sc.nextInt();
     while(query-->0){
         char c=sc.next().charAt(0);
         System.out.println(hash[c-'a'] );
     }
    }

}
