/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfr;

public abstract class zzfp
extends SQLiteOpenHelper {
    public zzfp(Context context, String string2, SQLiteDatabase.CursorFactory object, int n3) {
        int n4 = zzfr.zza;
        zzfm.zza();
        object = "";
        n4 = (int)(string2.equals(object) ? 1 : 0);
        int n7 = 1;
        if (n7 == n4) {
            string2 = null;
        }
        super(context, string2, null, n7);
    }
}

