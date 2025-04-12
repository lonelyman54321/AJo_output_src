/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 */
package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;

public final class FacebookInitProvider
extends ContentProvider {
    public final int delete(Uri uri, String string2, String[] stringArray) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    public final String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onCreate() {
        Object object;
        block6: {
            String string2;
            try {
                object = this.getContext();
                if (object == null) break block6;
                Object object2 = FacebookSdk.a;
                object2 = FacebookSdk.class;
                synchronized (object2) {
                    string2 = "applicationContext";
                }
            }
            catch (Exception exception) {
                return false;
            }
            {
                Intrinsics.checkNotNullParameter(object, string2);
                FacebookSdk.l((Context)object);
                return false;
            }
        }
        object = "Required value was null.";
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final Cursor query(Uri uri, String[] stringArray, String string2, String[] stringArray2, String string3) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String string2, String[] stringArray) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}

