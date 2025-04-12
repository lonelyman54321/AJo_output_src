/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.flags.impl.zza;
import com.google.android.gms.flags.impl.zzi;
import com.google.android.gms.internal.flags.zze;

public final class zzh
extends zza {
    public static String zza(SharedPreferences object, String string2, String string3) {
        try {
            zzi zzi2 = new zzi((SharedPreferences)object, string2, string3);
            object = zze.zza(zzi2);
        }
        catch (Exception exception) {
            object = String.valueOf(exception.getMessage());
            int n3 = ((String)object).length();
            if (n3 != 0) {
                string2 = "Flag value not available, returning default: ";
                string2.concat((String)object);
            }
            return string3;
        }
        return (String)object;
    }
}

