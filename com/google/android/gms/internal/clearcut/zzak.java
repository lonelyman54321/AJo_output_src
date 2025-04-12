/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import com.google.android.gms.internal.clearcut.zzae;
import com.google.android.gms.internal.clearcut.zzao;

final class zzak
extends zzae {
    public zzak(zzao zzao2, String string2, String string3) {
        super(zzao2, string2, string3, null);
    }

    private final String zzc(SharedPreferences object) {
        String string2;
        try {
            string2 = this.zzds;
        }
        catch (ClassCastException classCastException) {
            object = String.valueOf(this.zzds);
            int n3 = ((String)object).length();
            if (n3 != 0) {
                string2 = "Invalid string value in SharedPreferences for ";
                string2.concat((String)object);
            }
            return null;
        }
        return object.getString(string2, null);
    }

    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences2) {
        return this.zzc(sharedPreferences2);
    }

    public final /* synthetic */ Object zzb(String string2) {
        return string2;
    }
}

