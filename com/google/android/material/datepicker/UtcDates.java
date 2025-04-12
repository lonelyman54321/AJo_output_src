/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.icu.text.DateFormat
 *  android.icu.text.DisplayContext
 *  android.icu.util.TimeZone
 */
package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.TimeSource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

class UtcDates {
    static final String UTC = "UTC";
    static AtomicReference timeSourceRef;

    static {
        AtomicReference atomicReference;
        timeSourceRef = atomicReference = new AtomicReference();
    }

    private UtcDates() {
    }

    public static long canonicalYearMonthDay(long l2) {
        Calendar calendar = UtcDates.getUtcCalendar();
        calendar.setTimeInMillis(l2);
        return UtcDates.getDayCopy(calendar).getTimeInMillis();
    }

    private static int findCharactersInDateFormatPattern(String string2, String string3, int n3, int n4) {
        int n7;
        while (n4 >= 0 && n4 < (n7 = string2.length())) {
            int n8;
            n7 = string2.charAt(n4);
            if ((n7 = string3.indexOf(n7)) != (n8 = -1)) break;
            n7 = string2.charAt(n4);
            if (n7 == (n8 = 39)) {
                while ((n4 += n3) >= 0 && n4 < (n7 = string2.length()) && (n7 = (int)string2.charAt(n4)) != n8) {
                }
            }
            n4 += n3;
        }
        return n4;
    }

    public static DateFormat getAbbrMonthDayFormat(Locale locale) {
        return UtcDates.getAndroidFormat("MMMd", locale);
    }

    private static DateFormat getAndroidFormat(String string2, Locale locale) {
        string2 = Ky3.a(string2, locale);
        locale = UtcDates.getUtcAndroidTimeZone();
        Ly3.a((DateFormat)string2, (TimeZone)locale);
        locale = My3.a();
        Ny3.a((DateFormat)string2, (DisplayContext)locale);
        return string2;
    }

    public static String getDatePatternAsInputFormat(String string2) {
        String string3 = "";
        return string2.replaceAll("[^dMy/\\-.]", string3).replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", string3).replaceAll("My", "M/y");
    }

    public static Calendar getDayCopy(Calendar calendar) {
        calendar = UtcDates.getUtcCalendarOf(calendar);
        Calendar calendar2 = UtcDates.getUtcCalendar();
        int n3 = calendar.get(1);
        int n4 = calendar.get(2);
        int n7 = calendar.get(5);
        calendar2.set(n3, n4, n7);
        return calendar2;
    }

    public static SimpleDateFormat getDefaultTextInputFormat() {
        Cloneable cloneable = Locale.getDefault();
        Object object = UtcDates.getDatePatternAsInputFormat(((SimpleDateFormat)java.text.DateFormat.getDateInstance(3, (Locale)cloneable)).toPattern());
        Locale locale = Locale.getDefault();
        cloneable = new SimpleDateFormat((String)object, locale);
        object = UtcDates.getTimeZone();
        ((java.text.DateFormat)cloneable).setTimeZone((java.util.TimeZone)object);
        ((java.text.DateFormat)cloneable).setLenient(false);
        return cloneable;
    }

    public static String getDefaultTextInputHint(Resources object, SimpleDateFormat object2) {
        object2 = ((SimpleDateFormat)object2).toPattern();
        int n3 = R$string.mtrl_picker_text_input_year_abbr;
        String string2 = object.getString(n3);
        int n4 = R$string.mtrl_picker_text_input_month_abbr;
        String string3 = object.getString(n4);
        int n7 = R$string.mtrl_picker_text_input_day_abbr;
        object = object.getString(n7);
        String string4 = Locale.getDefault().getLanguage();
        String string5 = Locale.KOREAN.getLanguage();
        n7 = (int)(string4.equals(string5) ? 1 : 0);
        string5 = "y";
        String string6 = "M";
        String string7 = "d";
        if (n7 != 0) {
            object2 = ((String)object2).replaceAll("d+", string7).replaceAll("M+", string6);
            string4 = "y+";
            object2 = ((String)object2).replaceAll(string4, string5);
        }
        return ((String)object2).replace(string7, (CharSequence)object).replace(string6, string3).replace(string5, string2);
    }

    private static java.text.DateFormat getFormat(int n3, Locale cloneable) {
        java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(n3, cloneable);
        cloneable = UtcDates.getTimeZone();
        dateFormat.setTimeZone((java.util.TimeZone)cloneable);
        return dateFormat;
    }

    public static java.text.DateFormat getFullFormat() {
        return UtcDates.getFullFormat(Locale.getDefault());
    }

    public static java.text.DateFormat getFullFormat(Locale locale) {
        return UtcDates.getFormat(0, locale);
    }

    public static java.text.DateFormat getMediumFormat() {
        return UtcDates.getMediumFormat(Locale.getDefault());
    }

    public static java.text.DateFormat getMediumFormat(Locale locale) {
        return UtcDates.getFormat(2, locale);
    }

    public static java.text.DateFormat getMediumNoYear() {
        return UtcDates.getMediumNoYear(Locale.getDefault());
    }

    public static java.text.DateFormat getMediumNoYear(Locale cloneable) {
        cloneable = (SimpleDateFormat)UtcDates.getMediumFormat((Locale)cloneable);
        String string2 = UtcDates.removeYearFromDateFormatPattern(((SimpleDateFormat)cloneable).toPattern());
        ((SimpleDateFormat)cloneable).applyPattern(string2);
        return cloneable;
    }

    public static DateFormat getMonthWeekdayDayFormat(Locale locale) {
        return UtcDates.getAndroidFormat("MMMMEEEEd", locale);
    }

    public static java.text.DateFormat getNormalizedFormat(java.text.DateFormat dateFormat) {
        dateFormat = (java.text.DateFormat)dateFormat.clone();
        java.util.TimeZone timeZone = UtcDates.getTimeZone();
        dateFormat.setTimeZone(timeZone);
        return dateFormat;
    }

    public static SimpleDateFormat getSimpleFormat(String string2) {
        Locale locale = Locale.getDefault();
        return UtcDates.getSimpleFormat(string2, locale);
    }

    private static SimpleDateFormat getSimpleFormat(String object, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object, locale);
        object = UtcDates.getTimeZone();
        simpleDateFormat.setTimeZone((java.util.TimeZone)object);
        return simpleDateFormat;
    }

    public static TimeSource getTimeSource() {
        TimeSource timeSource = (TimeSource)timeSourceRef.get();
        if (timeSource == null) {
            timeSource = TimeSource.system();
        }
        return timeSource;
    }

    private static java.util.TimeZone getTimeZone() {
        return java.util.TimeZone.getTimeZone(UTC);
    }

    public static Calendar getTodayCalendar() {
        Calendar calendar = UtcDates.getTimeSource().now();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        java.util.TimeZone timeZone = UtcDates.getTimeZone();
        calendar.setTimeZone(timeZone);
        return calendar;
    }

    private static TimeZone getUtcAndroidTimeZone() {
        return Oy3.a();
    }

    public static Calendar getUtcCalendar() {
        return UtcDates.getUtcCalendarOf(null);
    }

    public static Calendar getUtcCalendarOf(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(UtcDates.getTimeZone());
        if (calendar == null) {
            calendar2.clear();
        } else {
            long l2 = calendar.getTimeInMillis();
            calendar2.setTimeInMillis(l2);
        }
        return calendar2;
    }

    public static DateFormat getYearAbbrMonthDayFormat(Locale locale) {
        return UtcDates.getAndroidFormat("yMMMd", locale);
    }

    public static DateFormat getYearMonthFormat(Locale locale) {
        return UtcDates.getAndroidFormat("yMMMM", locale);
    }

    public static DateFormat getYearMonthWeekdayDayFormat(Locale locale) {
        return UtcDates.getAndroidFormat("yMMMMEEEEd", locale);
    }

    private static String removeYearFromDateFormatPattern(String string2) {
        int n3;
        int n4;
        String string3 = null;
        String string4 = "yY";
        int n7 = 1;
        int n8 = UtcDates.findCharactersInDateFormatPattern(string2, string4, n7, 0);
        if (n8 >= (n4 = string2.length())) {
            return string2;
        }
        string4 = "EMd";
        int n10 = UtcDates.findCharactersInDateFormatPattern(string2, string4, n7, n8);
        if (n10 < (n3 = string2.length())) {
            string4 = "EMd,";
        }
        n8 = UtcDates.findCharactersInDateFormatPattern(string2, string4, -1, n8) + n7;
        string3 = string2.substring(n8, n10);
        return string2.replace(string3, " ").trim();
    }

    public static void setTimeSource(TimeSource timeSource) {
        timeSourceRef.set(timeSource);
    }
}

