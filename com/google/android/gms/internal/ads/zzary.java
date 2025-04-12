/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

final class zzary
extends FilterInputStream {
    private final long zza;
    private long zzb;

    public zzary(InputStream inputStream, long l2) {
        super(inputStream);
        this.zza = l2;
    }

    public final int read() {
        int n3;
        int n4 = super.read();
        if (n4 != (n3 = -1)) {
            long l2 = this.zzb;
            long l3 = 1L;
            this.zzb = l2 += l3;
        }
        return n4;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7 = super.read(byArray, n3, n4);
        if (n7 != (n3 = -1)) {
            long l2 = this.zzb;
            long l3 = n7;
            this.zzb = l2 += l3;
        }
        return n7;
    }

    public final long zza() {
        long l2 = this.zza;
        long l3 = this.zzb;
        return l2 - l3;
    }
}

