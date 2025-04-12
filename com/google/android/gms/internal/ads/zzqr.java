/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;

public final class zzqr
extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzan zzc;

    public zzqr(int n3, int n4, int n7, int n8, zzan zzan2, boolean n10, Exception exception) {
        String string2 = String.valueOf(zzan2);
        String string3 = " Config(";
        String string4 = ", ";
        CharSequence charSequence = fQ2.a("AudioTrack init failed ", string3, string4, n3, n4);
        String string5 = ") ";
        m10.a(charSequence, n7, string4, n8, string5);
        charSequence.append(string2);
        n7 = 1;
        String string6 = n7 != n10 ? "" : " (recoverable)";
        charSequence.append(string6);
        charSequence = charSequence.toString();
        super((String)charSequence, exception);
        this.zza = n3;
        this.zzb = n10;
        this.zzc = zzan2;
    }
}

