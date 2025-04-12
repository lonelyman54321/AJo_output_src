/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import java.util.Date;

public class DateConverter {
    public static Date toDate(Long comparable) {
        if (comparable == null) {
            comparable = null;
        } else {
            long l2 = comparable;
            Date date = new Date(l2);
            comparable = date;
        }
        return comparable;
    }

    public static Long toTimestamp(Date comparable) {
        if (comparable == null) {
            comparable = null;
        } else {
            long l2 = comparable.getTime();
            comparable = l2;
        }
        return comparable;
    }
}

