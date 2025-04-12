/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbi;

final class zzbe
extends zzbi {
    private final int zzfm;
    private final int zzfn;

    public zzbe(byte[] byArray, int n3, int n4) {
        super(byArray);
        int n7 = n3 + n4;
        int n8 = byArray.length;
        zzbb.zzb(n3, n7, n8);
        this.zzfm = n3;
        this.zzfn = n4;
    }

    public final int size() {
        return this.zzfn;
    }

    public final int zzac() {
        return this.zzfm;
    }

    public final byte zzj(int n3) {
        int n4 = this.size();
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
        byte[] byArray = this.zzfp;
        n7 = this.zzfm + n3;
        return byArray[n7];
    }
}

