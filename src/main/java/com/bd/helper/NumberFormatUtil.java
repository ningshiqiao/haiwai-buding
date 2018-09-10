package com.bd.helper;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * 〈一句话功能简述〉<br>
 * 〈贷款计算工具类〉
 *
 * @author lianzeng
 * @create 2018/4/16
 * @since 1.0.0
 */
public class NumberFormatUtil {

    /**
     * 金额英文格式化
     * @param number
     * @return
     */
    public static String formatEnglish(BigDecimal number, String pattern){
        DecimalFormat df = new DecimalFormat();
        df.applyPattern(pattern);
        String format = df.format(number);
        return format;
    }

    /**
     * 金额印尼文格式化
     * @param number
     * @return
     */
    public static String formatIndonesian(BigDecimal number,int i){
        DecimalFormat df = new DecimalFormat();
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        //设置小数点分隔符
        dfs.setDecimalSeparator(',');
        //设置分组分隔符
        dfs.setGroupingSeparator('.');
        df.setDecimalFormatSymbols(dfs);
        //设置小数点后最大位数
        df.setMaximumFractionDigits(i);
        String format = df.format(number);
        return format;
    }

}
