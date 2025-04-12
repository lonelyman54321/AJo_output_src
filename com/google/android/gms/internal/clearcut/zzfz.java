/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfs;
import com.google.android.gms.internal.clearcut.zzga;
import java.io.IOException;

public class zzfz {
    protected volatile int zzrs = -1;

    public static final void zza(zzfz zzfz2, byte[] object, int n3, int n4) {
        try {
            object = zzfs.zzh((byte[])object, 0, n4);
        }
        catch (IOException iOException) {
            object = new RuntimeException;
            ((RuntimeException)object)("Serializing to a byte array threw an IOException (should never happen).", iOException);
            throw object;
        }
        zzfz2.zza((zzfs)object);
        ((zzfs)object).zzem();
    }

    public /* synthetic */ Object clone() {
        return this.zzep();
    }

    public String toString() {
        return zzga.zza(this);
    }

    public void zza(zzfs zzfs2) {
    }

    public final int zzas() {
        int n3;
        this.zzrs = n3 = this.zzen();
        return n3;
    }

    public int zzen() {
        return 0;
    }

    public zzfz zzep() {
        return (zzfz)super.clone();
    }
}

