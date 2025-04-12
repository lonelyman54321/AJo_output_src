/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.common.base.Preconditions;

public final class zzcw {
    private static final ThreadLocal zza;

    static {
        zzcv zzcv2 = new zzcv();
        zza = zzcv2;
    }

    public static SharedPreferences zza(Context context, String object, int n3, zzco object2) {
        Object object3 = zzcf.zza();
        zzcl zzcl2 = zzcl.zzc;
        n3 = (int)(((String)(object3 = object3.zzb((String)object, (zzco)object2, zzcl2))).equals(object2 = "") ? 1 : 0);
        if (n3 != 0) {
            object3 = new zzcr();
        } else {
            n3 = 0;
            object3 = null;
        }
        if (object3 != null) {
            return object3;
        }
        object3 = zza;
        Preconditions.checkArgument((Boolean)((ThreadLocal)object3).get());
        object2 = Boolean.FALSE;
        ((ThreadLocal)object3).set(object2);
        object2 = null;
        try {
            context = context.getSharedPreferences((String)object, 0);
            object = Boolean.TRUE;
            ((ThreadLocal)object3).set(object);
            return context;
        }
        catch (Throwable throwable) {
            object = zza;
            object3 = Boolean.TRUE;
            ((ThreadLocal)object).set(object3);
            throw throwable;
        }
    }
}

