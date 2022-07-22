package com.demo.converter;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String dateStr) {
        //日期转换

        SimpleDateFormat simpleDateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;


        try {
            date = simpleDateFormatter.parse(dateStr);
        } catch (ParseException e) {

        }
        return date;
    }



}
