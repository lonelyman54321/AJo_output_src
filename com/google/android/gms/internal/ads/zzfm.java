/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

public final class zzfm {
    private int zza;
    private int zzb;
    private long[] zzc;
    private int zzd;

    public zzfm() {
        throw null;
    }

    public zzfm(int n3) {
        n3 = 16;
        int n4 = Integer.bitCount(n3);
        int n7 = 1;
        if (n4 != n7) {
            n3 = Integer.highestOneBit(15);
            n3 += n3;
        }
        this.zza = 0;
        this.zzb = 0;
        long[] lArray = new long[n3];
        this.zzc = lArray;
        this.zzd = n3 = lArray.length + -1;
    }

    public final long zza() {
        int n3 = this.zzb;
        if (n3 != 0) {
            long[] lArray = this.zzc;
            int n4 = this.zza;
            return lArray[n4];
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final long zzb() {
        int n3 = this.zzb;
        if (n3 != 0) {
            int n4;
            long[] lArray = this.zzc;
            int n7 = this.zza;
            long l2 = lArray[n7];
            this.zza = n4 = this.zzd & ++n7;
            this.zzb = n3 += -1;
            return l2;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzd() {
        int n3 = this.zzb;
        return n3 == 0;
    }
}

