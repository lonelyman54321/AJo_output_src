/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class AFa1pSDK {
    public static Date AFAdRevenueData(String string2, String object) {
        Locale locale;
        try {
            locale = Locale.US;
        }
        catch (Throwable throwable) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object, locale);
        object = "UTC";
        object = TimeZone.getTimeZone((String)object);
        simpleDateFormat.setTimeZone((TimeZone)object);
        return simpleDateFormat.parse(string2);
    }
}

