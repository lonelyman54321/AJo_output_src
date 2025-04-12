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
import com.google.android.gms.internal.clearcut.zzy;
import java.util.regex.Matcher;

final class zzaj
extends zzae {
    public zzaj(zzao zzao2, String string2, Boolean bl2) {
        super(zzao2, string2, bl2, null);
    }

    private final Boolean zzb(SharedPreferences object) {
        String string2;
        try {
            string2 = this.zzds;
        }
        catch (ClassCastException classCastException) {
            object = String.valueOf(this.zzds);
            int n3 = ((String)object).length();
            if (n3 != 0) {
                string2 = "Invalid boolean value in SharedPreferences for ";
                string2.concat((String)object);
            }
            return null;
        }
        boolean bl2 = object.getBoolean(string2, false);
        return bl2;
    }

    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences2) {
        return this.zzb(sharedPreferences2);
    }

    public final /* synthetic */ Object zzb(String string2) {
        Object object = zzy.zzcr.matcher(string2);
        boolean bl2 = ((Matcher)object).matches();
        if (bl2) {
            return Boolean.TRUE;
        }
        object = zzy.zzcs.matcher(string2);
        bl2 = ((Matcher)object).matches();
        if (bl2) {
            return Boolean.FALSE;
        }
        object = this.zzds;
        int n3 = lE2.a(lE2.a(28, (String)object), string2);
        new StringBuilder(n3);
        return null;
    }
}

