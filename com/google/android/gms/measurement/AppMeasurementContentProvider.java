/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.net.Uri
 */
package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzic;

public class AppMeasurementContentProvider
extends ContentProvider {
    public void attachInfo(Context object, ProviderInfo object2) {
        super.attachInfo((Context)object, object2);
        object = "com.google.android.gms.measurement.google_measurement_service";
        object2 = object2.authority;
        boolean bl2 = ((String)object).equals(object2);
        if (!bl2) {
            return;
        }
        object = new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        throw object;
    }

    public int delete(Uri uri, String string2, String[] stringArray) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = this.getContext();
        Preconditions.checkNotNull(context);
        zzic.zza(context, null, null);
        return false;
    }

    public Cursor query(Uri uri, String[] stringArray, String string2, String[] stringArray2, String string3) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String string2, String[] stringArray) {
        return 0;
    }
}

