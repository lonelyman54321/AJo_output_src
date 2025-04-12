/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzarv;
import java.io.ByteArrayOutputStream;

public final class zzasi
extends ByteArrayOutputStream {
    private final zzarv zza;

    public zzasi(zzarv object, int n3) {
        this.zza = object;
        n3 = Math.max(n3, 256);
        object = ((zzarv)object).zzb(n3);
        this.buf = (byte[])object;
    }

    private final void zza(int n3) {
        int n4 = this.count;
        int n7 = n4 + n3;
        byte[] byArray = this.buf;
        int n8 = byArray.length;
        if (n7 <= n8) {
            return;
        }
        Object object = this.zza;
        n4 += n3;
        n4 += n4;
        byte[] byArray2 = ((zzarv)object).zzb(n4);
        Object object2 = this.buf;
        n7 = this.count;
        System.arraycopy(object2, 0, byArray2, 0, n7);
        object2 = this.zza;
        object = this.buf;
        ((zzarv)object2).zza((byte[])object);
        this.buf = byArray2;
    }

    public final void close() {
        zzarv zzarv2 = this.zza;
        byte[] byArray = this.buf;
        zzarv2.zza(byArray);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        zzarv zzarv2 = this.zza;
        byte[] byArray = this.buf;
        zzarv2.zza(byArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void write(int n3) {
        synchronized (this) {
            int n4 = 1;
            this.zza(n4);
            super.write(n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void write(byte[] byArray, int n3, int n4) {
        synchronized (this) {
            this.zza(n4);
            super.write(byArray, n3, n4);
            return;
        }
    }
}

