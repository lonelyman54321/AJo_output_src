/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjm;

final class zzd {
    private final zzjm zza;

    public zzd(zzjm zzjm2) {
        this.zza = zzjm2;
    }

    public static zzd zza(String object) {
        zzd zzd2;
        int n3;
        int n4 = TextUtils.isEmpty((CharSequence)object);
        if (n4 == 0 && (n4 = object.length()) <= (n3 = 1)) {
            n4 = 0;
            zzd2 = null;
            char c2 = object.charAt(0);
            object = zzjj.zza(c2);
        } else {
            object = zzjm.zza;
        }
        zzd2 = new zzd((zzjm)((Object)object));
        return zzd2;
    }

    public final zzjm zza() {
        return this.zza;
    }

    public final String zzb() {
        return String.valueOf(zzjj.zza(this.zza));
    }
}

