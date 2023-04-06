package com.epam.rd.autotasks.words;

import com.sun.jdi.ByteValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StringUtil {
    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        if(sample==null || words==null || words.length==0){
            return 0;
        }
        String[]arr=new String[words.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=words[i].trim();
        }
         int count=0;
         for(int i=0;i<words.length;i++){
             if(arr[i].equalsIgnoreCase(sample)){
                 count++;
             }
         }
         return count;
    }

    public static String[] splitWords(String t) {
         if(t==null){
             return null;
         }
        ArrayList<String>aa=new ArrayList<>();
        String a="";
        for(int i=0;i<t.length();i++){
            if((t.charAt(i)>=65 && t.charAt(i)<=122)|| (t.charAt(i)>=48 && t.charAt(i)<=57)){
                a=a+t.charAt(i);
            }
            else if(a.length()!=0){
                aa.add(a);
                a="";
            }
        }
        if(a.length()!=0){
aa.add(a);
        }
        String[]b=new String[aa.size()];
        for(int i=0;i<b.length;i++){
            b[i]=aa.get(i);
        }

        if(b.length!=0){
            return b;
        }
        return null;
    }

    public static String convertPath(String path, boolean toWin) {
        throw new UnsupportedOperationException();
    }

    public static String joinWords(String[] words) {
        if( words==null){
            return null;
        }
        if(words.length==1 && !words[0].equals("")){
            return "["+words[0]+"]";
        }
        String a="[";
        for(int i=0;i<words.length;i++){
            if(!words[i].replaceAll(" ","").equals("")){
                a=a+words[i]+", ";
            }
        }

        if(a.equals("")){
            return null;
        }
        String b="";
        for(int i=0;i<a.length()-2;i++){
            b=b+a.charAt(i);
        }
        b=b+"]";
        if(b.equals("]")){
            return null;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS", };
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);

        System.out.println("Test 2: splitWords");
        String text = "   ,, first, second!!!! third";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));

        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);

        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);
    }
}