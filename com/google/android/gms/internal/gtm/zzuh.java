/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzug;

public abstract class zzuh {
    public static final zzuh zza;

    static {
        zzug zzug2 = new zzug();
        zza = zzug2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogSite{ class=");
        String string2 = this.zza();
        stringBuilder.append(string2);
        stringBuilder.append(", method=");
        string2 = this.zzb();
        stringBuilder.append(string2);
        stringBuilder.append(", line=0 }");
        return stringBuilder.toString();
    }

    public abstract String zza();

    public abstract String zzb();
}

