package com.knubisoft.base.numbers;

import java.math.BigInteger;

public class NumbersTasksImpl implements NumbersTasks {

    @Override
    public void swapTwoNumbersWithoutUsingTemporaryVariable(int firstNumber, int secondNumber) {
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
    }

    @Override
    public boolean isUglyInt(int number) {
        if (number < 1) {
            return false;
        }
        int temp;
        do {
            temp = number;
            if (number % 2 == 0) {
                number /= 2;
            }
            if (number % 3 == 0) {
                number /= 3;
            }
            if (number % 5 == 0) {
                number /= 5;
            }
        } while (temp != number);
        return number == 1;
    }

    @Override
    public int addDigits(int number) {
        int sum = 0;

        while (number > 0 || sum > 9) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    @Override
    public boolean isHarshadNumber(int number) {
        int originalValue = 0;
        int sum = 0;
        int temp = number;
        if (number == 0) return false;
        while (number > 0) {
            originalValue = number % 10;
            sum += originalValue;
            number = number / 10;
        }
        if (temp % sum == 0)
            return true;
        else
            return false;
    }


    @Override
    public boolean isPrime(int number) {
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isArmstrongNumber(int number) {
        int temp;
        int digits = 0;
        int last;
        int sum = 0;
        temp = number;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = number;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));

            temp = temp / 10;
        }
        if (number == sum) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public BigInteger factorial(int number) {
        BigInteger result;
        if (number == 1) {
            return BigInteger.ONE;
        }
        result = factorial(number - 1).multiply(BigInteger.valueOf(number));
        return result;
    }

    @Override
    public boolean palindrome(int number) {
        int original = number;
        int remainder;
        int temp = 0;
        /*
        if(number<=9){
            return true;
        }
         */
        while (number != 0) {
            remainder = number % 10;
            temp = temp * 10 + remainder;
            number /= 10;
        }
        if (original == temp) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isAutomorphic(int number) {
        long square = (long) number * number;
        while (number > 0) {
            if (number % 10 != square % 10) {
                return false;
            }
            number /= 10;
            square /= 10;
        }
        return true;
    }
}
