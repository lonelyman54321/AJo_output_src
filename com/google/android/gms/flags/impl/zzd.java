/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.flags.impl.zza;
import com.google.android.gms.flags.impl.zze;

public final class zzd
extends zza {
    public static Integer zza(SharedPreferences object, String string2, Integer n3) {
        try {
            zze zze2 = new zze((SharedPreferences)object, string2, n3);
            object = com.google.android.gms.internal.flags.zze.zza(zze2);
        }
        catch (Exception exception) {
            object = String.valueOf(exception.getMessage());
            int n4 = ((String)object).length();
            if (n4 != 0) {
                string2 = "Flag value not available, returning default: ";
                string2.concat((String)object);
            }
            return n3;
        }
        return (Integer)object;
    }
}

