package com.IzinModulu;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class IzinLibrary {


    public static String bugununTarihi(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String todaysdate = dateFormat.format(date);
        return todaysdate;

    }

    public static int getWorkingDays(String izinBaslangicTarihi, String izinBitisTarihi){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date d1 = sdf.parse(izinBaslangicTarihi);
            Date d2 = sdf.parse(izinBitisTarihi);

            return getWorkingDaysBetweenTwoDates(d1,d2);
        }
        // Catch the Exception
        catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);

        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);

        int workDays = 0;

        //Return 0 if start and end are the same
        if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
            return 0;
        }

        if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
            startCal.setTime(endDate);
            endCal.setTime(startDate);
        }

        do {
            //excluding start date
            startCal.add(Calendar.DAY_OF_MONTH, 1);
            if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                ++workDays;
            }
        } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date
        return workDays;
    }
    public static int tarihHesapla(String getBaslangic,String bitisTarihi) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date iseBaslama = sdf.parse(getBaslangic);
        Date suanTarih = sdf.parse(bitisTarihi);
        long diffInMillies = Math.abs(suanTarih.getTime() - iseBaslama.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        int diffi= (int)diff;
        return diffi;



    }


}
