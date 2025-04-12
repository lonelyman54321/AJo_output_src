/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjf;

final class zzjc
extends zzjf {
    private final int zzc;
    private final int zzd;

    public zzjc(byte[] byArray, int n3, int n4) {
        super(byArray);
        int n7 = n3 + n4;
        int n8 = byArray.length;
        zziy.zza(n3, n7, n8);
        this.zzc = n3;
        this.zzd = n4;
    }

    public final byte zza(int n3) {
        int n4 = this.zzb();
        int n7 = n3 + 1;
        if ((n7 = n4 - n7 | n3) < 0) {
            if (n3 < 0) {
                String string2 = hj0_0.a(n3, "Index < 0: ");
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string2);
                throw arrayIndexOutOfBoundsException;
            }
            String string3 = D70.b(n3, n4, "Index > length: ", ", ");
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string3);
            throw arrayIndexOutOfBoundsException;
        }
        byte[] byArray = this.zzb;
        n7 = this.zzc + n3;
        return byArray[n7];
    }

    public final byte zzb(int n3) {
        byte[] byArray = this.zzb;
        int n4 = this.zzc + n3;
        return byArray[n4];
    }

    public final int zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzc;
    }
}

