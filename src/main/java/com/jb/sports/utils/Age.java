package com.jb.sports.utils;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class Age {

    public static int calc(Date date){
        LocalDate birthDate = date.toLocalDate();
        LocalDate currentDate = LocalDate.now();
        if(birthDate != null && currentDate != null){
            return Period.between(birthDate, currentDate).getYears();
        }
        return -1;
    }
}
