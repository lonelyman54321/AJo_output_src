/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnj;
import com.google.android.gms.internal.ads.zzgnn;

public final class zzgnm
extends zzgnn {
    public zzgnm(byte[] byArray, int n3) {
        super(byArray, n3);
    }

    public final int zza() {
        return 12;
    }

    public final int[] zzb(int[] object, int n3) {
        int n4 = ((int[])object).length;
        int n7 = 3;
        if (n4 == n7) {
            int[] nArray = new int[16];
            int[] nArray2 = this.zza;
            zzgnj.zzb(nArray, nArray2);
            nArray[12] = n3;
            System.arraycopy(object, 0, nArray, 13, n7);
            return nArray;
        }
        object = new IllegalArgumentException;
        Object object2 = n4 *= 32;
        Object[] objectArray = new Object[]{object2};
        object2 = String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", objectArray);
        object((String)object2);
        throw object;
    }
}

