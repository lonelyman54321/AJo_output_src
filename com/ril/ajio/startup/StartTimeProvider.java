/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.SystemClock
 */
package com.ril.ajio.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

public final class StartTimeProvider
extends ContentProvider {
    public final int delete(Uri uri, String string2, String[] stringArray) {
        Intrinsics.checkNotNullParameter(uri, "p0");
        return -1;
    }

    public final String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "p0");
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "p0");
        return null;
    }

    public final boolean onCreate() {
        bo1_1.b = true;
        bo1_1.f = SystemClock.uptimeMillis();
        return false;
    }

    public final Cursor query(Uri uri, String[] stringArray, String string2, String[] stringArray2, String string3) {
        Intrinsics.checkNotNullParameter(uri, "p0");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String string2, String[] stringArray) {
        Intrinsics.checkNotNullParameter(uri, "p0");
        return -1;
    }
}

