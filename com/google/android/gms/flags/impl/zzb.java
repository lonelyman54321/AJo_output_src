/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.flags.impl.zza;
import com.google.android.gms.flags.impl.zzc;
import com.google.android.gms.internal.flags.zze;

public final class zzb
extends zza {
    public static Boolean zza(SharedPreferences object, String string2, Boolean bl2) {
        try {
            zzc zzc2 = new zzc((SharedPreferences)object, string2, bl2);
            object = zze.zza(zzc2);
        }
        catch (Exception exception) {
            object = String.valueOf(exception.getMessage());
            int n3 = ((String)object).length();
            if (n3 != 0) {
                string2 = "Flag value not available, returning default: ";
                string2.concat((String)object);
            }
            return bl2;
        }
        return (Boolean)object;
    }
}

