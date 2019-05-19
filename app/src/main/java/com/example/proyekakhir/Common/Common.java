package com.example.proyekakhir.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static final String APP_ID = "1da537bc52c2929505615a8f18d9f30c";
    public static Location current_location = null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*10001);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }

    public static String convertUnixtoHour(long dt) {
        Date date = new Date(dt*10001);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formatted = sdf.format(date);
        return formatted;
    }
}
