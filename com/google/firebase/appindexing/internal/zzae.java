/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class zzae {
    private static final DateFormat zza;

    static {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale);
        zza = simpleDateFormat;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String zza(Calendar object) {
        DateFormat dateFormat = zza;
        synchronized (dateFormat) {
            TimeZone timeZone = ((Calendar)object).getTimeZone();
            dateFormat.setTimeZone(timeZone);
            object = ((Calendar)object).getTime();
            return dateFormat.format((Date)object);
        }
    }
}

