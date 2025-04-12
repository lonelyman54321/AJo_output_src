/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class PreJava9DateFormatProvider {
    private static String getDateFormatPattern(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 == n4) {
                        return "M/d/yy";
                    }
                    String string2 = hj0_0.a(n3, "Unknown DateFormat style: ");
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                    throw illegalArgumentException;
                }
                return "MMM d, y";
            }
            return "MMMM d, y";
        }
        return "EEEE, MMMM d, y";
    }

    private static String getDatePartOfDateTimePattern(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 == n4) {
                        return "M/d/yy";
                    }
                    String string2 = hj0_0.a(n3, "Unknown DateFormat style: ");
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                    throw illegalArgumentException;
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    private static String getTimePartOfDateTimePattern(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 1)) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    return "h:mm a";
                }
                String string2 = hj0_0.a(n3, "Unknown DateFormat style: ");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    public static DateFormat getUSDateFormat(int n3) {
        String string2 = PreJava9DateFormatProvider.getDateFormatPattern(n3);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string2, locale);
        return simpleDateFormat;
    }

    public static DateFormat getUSDateTimeFormat(int n3, int n4) {
        Serializable serializable = new StringBuilder();
        String string2 = PreJava9DateFormatProvider.getDatePartOfDateTimePattern(n3);
        serializable.append(string2);
        serializable.append(" ");
        string2 = PreJava9DateFormatProvider.getTimePartOfDateTimePattern(n4);
        serializable.append(string2);
        string2 = serializable.toString();
        serializable = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string2, (Locale)serializable);
        return simpleDateFormat;
    }
}

