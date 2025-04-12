/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.appsflyer.internal;

import android.database.Cursor;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1kSDK {
    public static final String N_(Cursor cursor, String string2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter(cursor, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = cursor.getColumnIndex(string2);
        int n4 = -1;
        if (n3 != n4) {
            return cursor.getString(n3);
        }
        return null;
    }
}

