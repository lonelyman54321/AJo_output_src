/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcd;
import com.google.android.gms.internal.icing.zzcf;

final class zzca
extends zzcd {
    private final int zzc;

    public zzca(byte[] byArray, int n3, int n4) {
        super(byArray);
        int n7 = byArray.length;
        zzcf.zzm(0, n4, n7);
        this.zzc = n4;
    }

    public final byte zza(int n3) {
        int n4 = this.zzc;
        int n7 = n3 + 1;
        if ((n7 = n4 - n7 | n3) < 0) {
            if (n3 < 0) {
                String string2 = tk3_2.a(22, n3, "Index < 0: ");
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string2);
                throw arrayIndexOutOfBoundsException;
            }
            String string3 = C12.a(40, n3, n4, "Index > length: ", ", ");
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string3);
            throw arrayIndexOutOfBoundsException;
        }
        return this.zza[n3];
    }

    public final byte zzb(int n3) {
        return this.zza[n3];
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return 0;
    }
}

