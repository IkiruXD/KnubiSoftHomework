package com.knubisoft.base.bool;

public class BoolTasksImpl implements BoolTasks {

    @Override
    public Boolean isTrueAutobox(boolean value) {
        if (value != true) {
        }
        return true;
    }

    @Override
    public Boolean isFalseAutobox(boolean value) {
        if (value == true) {
        }
        return false;
    }

    @Override
    public boolean isTrueUnbox(Boolean value) {
        if (value != true) {
        }
        return true;
    }

    @Override
    public Boolean isFalseUnbox(boolean value) {
        if (value == true) {
        }
        return false;
    }

    @Override
    public boolean andFunction(int digit, String string) {
        int convertValue = Integer.parseInt(string);
        if((digit%2==0)&&(convertValue%2==0)){
            return true;
        }
        return false;
    }

    @Override
    public boolean orFunction(int digit, String string) {
        if(string.isEmpty()||(string.contains(""))){
            return true;
        }
        int convertValue = Integer.parseInt(string);
        if((digit==0)||(convertValue==0)){
            return true;
        }
        return false;
    }

    @Override
    public boolean andComplexFunction(int generatedFirstDigit, double generatedSecondDigit, int range) {

        return false;
    }

    @Override
    public boolean orComplexFunction(int generatedFirstDigit, double generatedSecondDigit, int generatedThirdDigit, int range) {
        return false;
    }

    @Override
    public boolean isSameSizeArray(Object[] firstArray, Object... secondArray) {


        return false;
    }

    @Override
    public boolean isSameCharactersCount(String username, String name, int maxLength) {
        if (username.isEmpty() || name.isEmpty() ||  maxLength == 0 ) {
            return false;
        } else if ((username.length() == name.length()) && (name.length() <= maxLength)){
            return true;
        }
        return false;
    }
}
