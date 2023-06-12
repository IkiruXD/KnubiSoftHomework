package com.knubisoft.base.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTasksImpl implements DateTasks {

    @Override
    public String add1Day(String date) {
        LocalDate originalDate = LocalDate.parse(date);
        LocalDate newDate = originalDate.plusDays(1);
        return newDate.toString();
    }

    @Override
    public int getMonthFromDate(String date) {

        Date dates = null;
        try {
            dates = new SimpleDateFormat("EEE, d MMM yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dates.getMonth()+1;
    }

    @Override
    public String findBiggestDate(String date1, String date2, String date3) {
        Date dates1 = null;
        Date dates2 = null;
        Date dates3 =null;
        try {
            dates1 = new SimpleDateFormat("yyyy-M-dd hh:mm:ss").parse(date1);
             dates2 = new SimpleDateFormat("yyyy-M-dd hh:mm:ss").parse(date2);
             dates3 = new SimpleDateFormat("yyyy-M-dd hh:mm:ss").parse(date3);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        int result1 = dates1.compareTo(dates2);
        int result2 = dates1.compareTo(dates3);
        int result3 = dates2.compareTo(dates3);

        if(result1 == 0){
            if(result3==0){
                return date1;
            }
            else{
                return date3;
            }
        }
        if (result1 > 0){
            if(result2>0){
                return date1;
            }else{
                return date3;
            }
        }
        if(result3>0){
            return date2;
        }else{
            return date3;
        }
    }

    @Override
    public String getLastDayOfTheMonth(String date) {
        LocalDate originalDate = LocalDate.parse(date);
        int days = originalDate.lengthOfMonth();
        LocalDate result = originalDate.plusDays(days-originalDate.getDayOfMonth());
        return result.toString();
    }

    @Override
    public String sumTimes(String time1, String time2) {
        LocalTime firstTime = LocalTime.parse(time1);
        LocalTime secondTime = LocalTime.parse(time2);
        DateTimeFormatter formatter
                = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime resultTime = firstTime.plusHours(secondTime.getHour())
                .plusMinutes(secondTime.getMinute())
                .plusSeconds(secondTime.getSecond());
        return resultTime.format(formatter);
    }

    @Override
    public String getDateAfter2Weeks(String date) {
        LocalDate originalDate = LocalDate.parse(date);
        LocalDate newDate = originalDate.plusWeeks(2);
        return newDate.toString();
    }

    @Override
    public long getNumberOfDaysBetweenTwoDates(String date1, String date2) {
        LocalDate firstDate = LocalDate.parse(date1);
        LocalDate secondDate = LocalDate.parse(date2);
        int result = (int) Duration.between(firstDate.atStartOfDay(), secondDate.atStartOfDay()).toDays();
        return result;
    }

    @Override
    public String[] getTheNextAndPreviousFriday(String date) {

        return null;
    }

    @Override
    public int getNumberOfMonthsRemainingInTheYear(String date) {
        LocalDate originalDate = LocalDate.parse(date);

        int numberOfMonth = originalDate.getMonthValue();
        int result = 12 - numberOfMonth;
        return result;
    }
}
