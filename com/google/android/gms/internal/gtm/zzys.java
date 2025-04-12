/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzyv;
import com.google.android.gms.internal.gtm.zzyx;

final class zzys
extends zzyv {
    private final int zzc;

    public zzys(byte[] byArray, int n3, int n4) {
        super(byArray);
        int n7 = byArray.length;
        zzyx.zzh(0, n4, n7);
        this.zzc = n4;
    }

    public final byte zza(int n3) {
        int n4 = this.zzc;
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
        return this.zza[n3];
    }

    public final byte zzb(int n3) {
        return this.zza[n3];
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }
}

