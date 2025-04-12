/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.icu.text.DateFormat
 *  android.os.Build$VERSION
 *  android.text.format.DateUtils
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.os.Build;
import android.text.format.DateUtils;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class DateStrings {
    private DateStrings() {
    }

    public static lm2 getDateRangeString(Long l2, Long l3) {
        return DateStrings.getDateRangeString(l2, l3, null);
    }

    public static lm2 getDateRangeString(Long object, Long object2, SimpleDateFormat object3) {
        int n3;
        Cloneable cloneable = null;
        if (object == null && object2 == null) {
            object = new lm2(null, null);
            return object;
        }
        if (object == null) {
            object = DateStrings.getDateString((Long)object2, (SimpleDateFormat)object3);
            object2 = new lm2(null, object);
            return object2;
        }
        if (object2 == null) {
            object = DateStrings.getDateString((Long)object, (SimpleDateFormat)object3);
            object2 = new lm2(object, null);
            return object2;
        }
        cloneable = UtcDates.getTodayCalendar();
        Calendar calendar = UtcDates.getUtcCalendar();
        long l2 = (Long)object;
        calendar.setTimeInMillis(l2);
        Calendar calendar2 = UtcDates.getUtcCalendar();
        long l3 = (Long)object2;
        calendar2.setTimeInMillis(l3);
        if (object3 != null) {
            long l4 = (Long)object;
            cloneable = new Date(l4);
            l4 = (Long)object2;
            object = new Date(l4);
            object2 = ((java.text.DateFormat)object3).format((Date)cloneable);
            object = ((java.text.DateFormat)object3).format((Date)object);
            object3 = new lm2(object2, object);
            return object3;
        }
        int n4 = 1;
        int n7 = calendar.get(n4);
        if (n7 == (n3 = calendar2.get(n4))) {
            int n8 = calendar.get(n4);
            if (n8 == (n4 = cloneable.get(n4))) {
                long l7 = (Long)object;
                object = Locale.getDefault();
                object = DateStrings.getMonthDay(l7, (Locale)object);
                long l8 = (Long)object2;
                cloneable = Locale.getDefault();
                object2 = DateStrings.getMonthDay(l8, (Locale)cloneable);
                object3 = new lm2(object, object2);
                return object3;
            }
            long l12 = (Long)object;
            object = Locale.getDefault();
            object = DateStrings.getMonthDay(l12, (Locale)object);
            long l14 = (Long)object2;
            cloneable = Locale.getDefault();
            object2 = DateStrings.getYearMonthDay(l14, (Locale)cloneable);
            object3 = new lm2(object, object2);
            return object3;
        }
        long l15 = (Long)object;
        object = Locale.getDefault();
        object = DateStrings.getYearMonthDay(l15, (Locale)object);
        long l16 = (Long)object2;
        cloneable = Locale.getDefault();
        object2 = DateStrings.getYearMonthDay(l16, (Locale)cloneable);
        object3 = new lm2(object, object2);
        return object3;
    }

    public static String getDateString(long l2) {
        return DateStrings.getDateString(l2, null);
    }

    public static String getDateString(long l2, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            Date date = new Date(l2);
            return simpleDateFormat.format(date);
        }
        boolean bl2 = DateStrings.isDateWithinCurrentYear(l2);
        if (bl2) {
            return DateStrings.getMonthDay(l2);
        }
        return DateStrings.getYearMonthDay(l2);
    }

    public static String getDayContentDescription(Context object, long l2, boolean bl2, boolean bl3, boolean bl4) {
        Object[] objectArray;
        int n3;
        int n4 = 1;
        String string2 = DateStrings.getOptionalYearMonthDayOfWeekDay(l2);
        if (bl2) {
            n3 = R$string.mtrl_picker_today_description;
            objectArray = object.getString(n3);
            Object[] objectArray2 = new Object[n4];
            objectArray2[0] = string2;
            string2 = String.format((String)objectArray, objectArray2);
        }
        if (bl3) {
            n3 = R$string.mtrl_picker_start_date_description;
            object = object.getString(n3);
            objectArray = new Object[n4];
            objectArray[0] = string2;
            return String.format((String)object, objectArray);
        }
        if (bl4) {
            n3 = R$string.mtrl_picker_end_date_description;
            object = object.getString(n3);
            objectArray = new Object[n4];
            objectArray[0] = string2;
            return String.format((String)object, objectArray);
        }
        return string2;
    }

    public static String getMonthDay(long l2) {
        Locale locale = Locale.getDefault();
        return DateStrings.getMonthDay(l2, locale);
    }

    public static String getMonthDay(long l2, Locale cloneable) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            cloneable = UtcDates.getAbbrMonthDayFormat((Locale)cloneable);
            Date date = new Date(l2);
            return li0_1.a((DateFormat)cloneable, date);
        }
        cloneable = UtcDates.getMediumNoYear((Locale)cloneable);
        Date date = new Date(l2);
        return ((java.text.DateFormat)cloneable).format(date);
    }

    public static String getMonthDayOfWeekDay(long l2) {
        Locale locale = Locale.getDefault();
        return DateStrings.getMonthDayOfWeekDay(l2, locale);
    }

    public static String getMonthDayOfWeekDay(long l2, Locale cloneable) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            cloneable = UtcDates.getMonthWeekdayDayFormat((Locale)cloneable);
            Date date = new Date(l2);
            return li0_1.a((DateFormat)cloneable, date);
        }
        cloneable = UtcDates.getFullFormat((Locale)cloneable);
        Date date = new Date(l2);
        return ((java.text.DateFormat)cloneable).format(date);
    }

    public static String getOptionalYearMonthDayOfWeekDay(long l2) {
        boolean bl2 = DateStrings.isDateWithinCurrentYear(l2);
        if (bl2) {
            return DateStrings.getMonthDayOfWeekDay(l2);
        }
        return DateStrings.getYearMonthDayOfWeekDay(l2);
    }

    public static String getYearContentDescription(Context object, int n3) {
        int n4;
        Object[] objectArray = UtcDates.getTodayCalendar();
        int n7 = objectArray.get(n4 = 1);
        if (n7 == n3) {
            n7 = R$string.mtrl_picker_navigate_to_current_year_description;
            object = object.getString(n7);
            Integer n8 = n3;
            objectArray = new Object[n4];
            objectArray[0] = n8;
            return String.format((String)object, objectArray);
        }
        n7 = R$string.mtrl_picker_navigate_to_year_description;
        object = object.getString(n7);
        Integer n10 = n3;
        objectArray = new Object[n4];
        objectArray[0] = n10;
        return String.format((String)object, objectArray);
    }

    public static String getYearMonth(long l2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            DateFormat dateFormat = UtcDates.getYearMonthFormat(Locale.getDefault());
            Date date = new Date(l2);
            return li0_1.a(dateFormat, date);
        }
        return DateUtils.formatDateTime(null, (long)l2, (int)8228);
    }

    public static String getYearMonthDay(long l2) {
        Locale locale = Locale.getDefault();
        return DateStrings.getYearMonthDay(l2, locale);
    }

    public static String getYearMonthDay(long l2, Locale cloneable) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            cloneable = UtcDates.getYearAbbrMonthDayFormat((Locale)cloneable);
            Date date = new Date(l2);
            return li0_1.a((DateFormat)cloneable, date);
        }
        cloneable = UtcDates.getMediumFormat((Locale)cloneable);
        Date date = new Date(l2);
        return ((java.text.DateFormat)cloneable).format(date);
    }

    public static String getYearMonthDayOfWeekDay(long l2) {
        Locale locale = Locale.getDefault();
        return DateStrings.getYearMonthDayOfWeekDay(l2, locale);
    }

    public static String getYearMonthDayOfWeekDay(long l2, Locale cloneable) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            cloneable = UtcDates.getYearMonthWeekdayDayFormat((Locale)cloneable);
            Date date = new Date(l2);
            return li0_1.a((DateFormat)cloneable, date);
        }
        cloneable = UtcDates.getFullFormat((Locale)cloneable);
        Date date = new Date(l2);
        return ((java.text.DateFormat)cloneable).format(date);
    }

    private static boolean isDateWithinCurrentYear(long l2) {
        Calendar calendar = UtcDates.getTodayCalendar();
        Calendar calendar2 = UtcDates.getUtcCalendar();
        calendar2.setTimeInMillis(l2);
        boolean bl2 = true;
        int n3 = calendar.get((int)(bl2 ? 1 : 0));
        int n4 = calendar2.get((int)(bl2 ? 1 : 0));
        if (n3 != n4) {
            bl2 = false;
        }
        return bl2;
    }
}

