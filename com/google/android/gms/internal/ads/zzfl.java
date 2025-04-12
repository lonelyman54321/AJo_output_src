/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfl {
    private int zza;
    private long[] zzb;

    public zzfl() {
        throw null;
    }

    public zzfl(int n3) {
        long[] lArray = new long[32];
        this.zzb = lArray;
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zza)) {
            return this.zzb[n3];
        }
        int n7 = this.zza;
        String string2 = D70.b(n3, n7, "Invalid index ", ", size is ");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final void zzc(long l2) {
        long[] lArray;
        int n3 = this.zza;
        long[] lArray2 = this.zzb;
        int n4 = lArray2.length;
        if (n3 == n4) {
            n3 += n3;
            this.zzb = lArray = Arrays.copyOf(lArray2, n3);
        }
        lArray = this.zzb;
        int n7 = this.zza;
        this.zza = n4 = n7 + 1;
        lArray[n7] = l2;
    }
}

