/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.flags.impl.zza;
import com.google.android.gms.flags.impl.zzg;
import com.google.android.gms.internal.flags.zze;

public final class zzf
extends zza {
    public static Long zza(SharedPreferences object, String string2, Long l2) {
        try {
            zzg zzg2 = new zzg((SharedPreferences)object, string2, l2);
            object = zze.zza(zzg2);
        }
        catch (Exception exception) {
            object = String.valueOf(exception.getMessage());
            int n3 = ((String)object).length();
            if (n3 != 0) {
                string2 = "Flag value not available, returning default: ";
                string2.concat((String)object);
            }
            return l2;
        }
        return (Long)object;
    }
}

