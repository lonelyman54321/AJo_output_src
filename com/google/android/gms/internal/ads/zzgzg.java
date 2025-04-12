/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

final class zzgzg
extends FilterInputStream {
    private int zza;

    public zzgzg(InputStream inputStream, int n3) {
        super(inputStream);
        this.zza = n3;
    }

    public final int available() {
        int n3 = super.available();
        int n4 = this.zza;
        return Math.min(n3, n4);
    }

    public final int read() {
        int n3 = this.zza;
        int n4 = -1;
        if (n3 <= 0) {
            return n4;
        }
        n3 = super.read();
        if (n3 >= 0) {
            int n7;
            this.zza = n7 = this.zza + n4;
        }
        return n3;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7 = this.zza;
        if (n7 <= 0) {
            return -1;
        }
        int n8 = super.read(byArray, n3, n4 = Math.min(n4, n7));
        if (n8 >= 0) {
            this.zza = n3 = this.zza - n8;
        }
        return n8;
    }

    public final long skip(long l2) {
        int n3 = this.zza;
        long l3 = n3;
        l2 = Math.min(l2, l3);
        int n4 = (int)(l2 = super.skip(l2));
        if (n4 >= 0) {
            int n7;
            this.zza = n7 = this.zza - n4;
        }
        return n4;
    }
}

