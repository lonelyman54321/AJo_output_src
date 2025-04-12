/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzjn;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzme;
import java.io.IOException;
import java.util.List;

public abstract class zzio
implements zzlm {
    protected int zza = 0;

    public static void zza(Iterable iterable, List list) {
        zzin.zza(iterable, list);
    }

    public int zza(zzme zzme2) {
        int n3;
        int n4 = this.zzcc();
        if (n4 == (n3 = -1)) {
            n4 = zzme2.zza(this);
            this.zzc(n4);
        }
        return n4;
    }

    public void zzc(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public int zzcc() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final zziy zzcd() {
        Object object;
        int n3;
        try {
            n3 = this.zzcf();
        }
        catch (IOException iOException) {
            String string2 = this.getClass().getName();
            string2 = cP.a("Serializing ", string2, " to a ByteString threw an IOException (should never happen).");
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        zzjd zzjd2 = zziy.zzc(n3);
        object = zzjd2.zzb();
        this.zza((zzjn)object);
        return zzjd2.zza();
    }

    public final byte[] zzce() {
        Object object;
        int n3;
        try {
            n3 = this.zzcf();
        }
        catch (IOException iOException) {
            String string2 = this.getClass().getName();
            string2 = cP.a("Serializing ", string2, " to a byte array threw an IOException (should never happen).");
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        byte[] byArray = new byte[n3];
        object = zzjn.zzb(byArray);
        this.zza((zzjn)object);
        ((zzjn)object).zzb();
        return byArray;
    }
}

