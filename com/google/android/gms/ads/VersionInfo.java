/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

import java.util.Locale;

public class VersionInfo {
    protected final int zza;
    protected final int zzb;
    protected final int zzc;

    public VersionInfo(int n3, int n4, int n7) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
    }

    public int getMajorVersion() {
        return this.zza;
    }

    public int getMicroVersion() {
        return this.zzc;
    }

    public int getMinorVersion() {
        return this.zzb;
    }

    public String toString() {
        Object object = Locale.US;
        int n3 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        object = ".";
        stringBuilder.append((String)object);
        stringBuilder.append(n4);
        stringBuilder.append((String)object);
        stringBuilder.append(n7);
        return stringBuilder.toString();
    }
}

