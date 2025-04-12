/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzco;

public abstract class zzcj
extends SQLiteOpenHelper {
    public zzcj(Context context, String string2, SQLiteDatabase.CursorFactory cursorFactory, int n3) {
        zzco zzco2 = zzco.zza;
        this(context, string2, null, 1, zzco2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private zzcj(Context context, String string2, SQLiteDatabase.CursorFactory cursorFactory, int n3, zzco object) {
        block3: {
            block2: {
                if (string2 == null) break block2;
                Object object2 = zzcf.zza();
                zzcl zzcl2 = zzcl.zzb;
                n3 = (int)(((String)(object2 = object2.zzb(string2, (zzco)object, zzcl2))).equals(object = "") ? 1 : 0);
                if (n3 == 0) break block3;
            }
            string2 = null;
        }
        super(context, string2, null, 1);
    }
}

