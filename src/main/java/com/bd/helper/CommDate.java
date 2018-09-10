package com.bd.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CommDate {

    public static String ryn="dd/MM/yyyy";
    private static String nyr="yyyy/MM/dd";
    public static void main(String[] args) {
        String result=getDateStrByPattern(new Date(),ryn);
        System.out.println(result);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        CommDate test = new CommDate();

        // Date

        Date currentDate = new Date();

        System.out.println("当前日期是：" + df.format(currentDate));

        System.out.println("一周后的日期是：" + df.format(test.nextWeek(currentDate)));

        System.out.println("一周后的日期是：" + df.format(test.nextWeek(currentDate)));

        System.out.println("一月后的日期是：" + df.format(test.nextMonth(currentDate)));

        System.out.println("一年后的日期是：" + df.format(test.nextYear(currentDate)));


        System.out.println("当前日期是：" + df.format(currentDate));

        System.out.println("上一周的日期是：" + df.format(test.preWeek(currentDate)));

        System.out.println("上一月的日期是：" + df.format(test.preMonth(currentDate)));

        System.out.println("上一年的日期是：" + df.format(test.preYear(currentDate)));

    }

    // 获取下一周的日期

    public Date nextWeek(Date currentDate) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(currentDate);
        cal.add(GregorianCalendar.DATE, 7);// 在日期上加7天
        return cal.getTime();
    }

    /**
     * 某个日期的往后几天
     * @param currentDate
     * @return
     */
    public static Date addDays(Date currentDate,int days) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(currentDate);
        cal.add(GregorianCalendar.DATE, days);// 在日期上加7天
        return cal.getTime();
    }

    //
    public static Date calEndTime(Date currentDate,int days,String pattern){
        Date date = addDays(currentDate, days);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        StringBuilder sb = new StringBuilder(df.format(date));
        String dateStr = sb.append(" 23:59:59").toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String getDateStrByPattern(Date date ,String pattern){
        SimpleDateFormat ryn = new SimpleDateFormat(pattern);
         return ryn.format(date);
    }

    /**
     * 字符串转换成时间
     * @param dateStr
     * @param pattern
     * @return
     */
    public static Date getDateByStrPattern(String dateStr ,String pattern){
        SimpleDateFormat ryn = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = ryn.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    // 获取本周日的日期

    public Date getSunday(Date monday) {

        GregorianCalendar cal = new GregorianCalendar();

        cal.setTime(monday);

        cal.add(GregorianCalendar.DATE, 6);// 在日期上加6天

        return cal.getTime();

    }

    // 获取下X月的日期

    public static Date afterMonth(Date currentDate, int afterNum) {

        GregorianCalendar cal = new GregorianCalendar();

        cal.setTime(currentDate);

        cal.add(GregorianCalendar.MONTH, afterNum);// 在月份上加1

        return cal.getTime();

    }

    // 获取下一月的日期

    public Date nextMonth(Date currentDate) {

        GregorianCalendar cal = new GregorianCalendar();

        cal.setTime(currentDate);

        cal.add(GregorianCalendar.MONTH, 1);// 在月份上加1

        return cal.getTime();

    }

    // 获取下一年的日期

    public Date nextYear(Date currentDate) {

        GregorianCalendar cal = new GregorianCalendar();

        cal.setTime(currentDate);

        cal.add(GregorianCalendar.YEAR, 1);// 在年上加1

        return cal.getTime();

    }

    // 获取上一周的日期

    public Date preWeek(Date currentDate) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(currentDate);
        cal.add(GregorianCalendar.DATE, -7);// 在日期上加7天
        return cal.getTime();
    }

    // 获取上一月的日期

    public Date preMonth(Date currentDate) {

        GregorianCalendar cal = new GregorianCalendar();

        cal.setTime(currentDate);

        cal.add(GregorianCalendar.MONTH, -1);// 在月份上加1

        return cal.getTime();

    }

    public Date preMonth6(Date currentDate) {

        GregorianCalendar cal = new GregorianCalendar();

        cal.setTime(currentDate);

        cal.add(GregorianCalendar.MONTH, -6);// 在月份上加1

        return cal.getTime();

    }

    // 获取上一年的日期

    public Date preYear(Date currentDate) {

        GregorianCalendar cal = new GregorianCalendar();

        cal.setTime(currentDate);

        cal.add(GregorianCalendar.YEAR, -1);// 在年上加1

        return cal.getTime();

    }

    // 获取当前季度
    public int getQuarter() {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        return month / 3;
    }

    public static boolean dateLimit(){
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");//设置日期格式
        Date now =null;
        Date beginTime = null;
        Date endTime = null;
        try {
            now = df.parse(df.format(new Date()));
            beginTime = df.parse("00:00");
            endTime = df.parse("06:00");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calendar date = Calendar.getInstance();
        date.setTime(now);
        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);
        Calendar end = Calendar.getInstance();
        end.setTime(endTime);
        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }
}