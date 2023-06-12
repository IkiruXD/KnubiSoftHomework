package com.knubisoft.base.string;

import java.util.Arrays;
import java.util.HashSet;

public class StringTasksImpl implements StringTasks {

    @Override
    public String reverseString(String original) {
        String newString = "";
        char ch;

        for (int i = 0; i < original.length(); i++) {
            ch = original.charAt(i);
            newString = ch + newString;
        }
        return newString;
    }

    @Override
    public String insertStringInMiddle(String original, String toInsert) {
        String newString = "";
        int middle = original.length() / 2;
        for (int i = 0; i < original.length(); i++) {
            newString += original.charAt(i);
            if (i == middle) {
                newString += toInsert;
            }
        }
        return newString;
    }

    @Override
    public String insertSymbolInString(String original, char toInsert, int position){
        String newString = "";
        for (int i = 0; i < original.length(); i++) {
            newString += original.charAt(i);

            if (i == position-1) {
                newString += toInsert;
            }
        }
        return newString;
    }

    @Override
    public String appendToString(StringBuilder original, String toAppend) {
        StringBuilder newString = original.append(toAppend);
        return newString.toString();

    }

    @Override
    public boolean isPalindrome(String palindrome) {
        String original = palindrome.replaceAll("\\s+", "").toLowerCase();
        int length = original.length();
        int temp = 0;
        int backward = length - 1;
        while (backward > temp) {
            char next = original.charAt(temp++);
            char back = original.charAt(backward--);
            if (next != back)
                return false;
        }
        return true;
    }

    @Override
    public boolean hasLowerCase(String str) {
        String original = str;
        char[] charArray = str.toCharArray();

        for(int i=0; i < charArray.length; i++){

            if( !Character.isLowerCase( charArray[i] ))
                return false;
        }
        return true;
    }

    @Override
    public String uniqueCharacters(String str) {
        HashSet list=new HashSet();

        for(int i=0;i < str.length(); i ++)   {

            char c =str.charAt(i);

            if(!list.add(c)){}
        }
        return list.toString();
    }

    @Override
    public String removeAllCharacters(String str, char charToRemove) {
       //
        return null;
    }

    @Override
    public String toCamelCase(String str) {

        return null;
    }

    @Override
    public String getCountRepeatableString(String str) {
        return null;
    }

    @Override
    public String sortStringCharactersAsc(String str) {

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = new String(chars);
        return str;
    }
}
