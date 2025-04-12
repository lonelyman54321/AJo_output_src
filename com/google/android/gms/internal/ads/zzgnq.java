/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnj;
import com.google.android.gms.internal.ads.zzgnn;

public final class zzgnq
extends zzgnn {
    public zzgnq(byte[] byArray, int n3) {
        super(byArray, n3);
    }

    public final int zza() {
        return 24;
    }

    public final int[] zzb(int[] object, int n3) {
        int n4 = ((int[])object).length;
        int n7 = 6;
        if (n4 == n7) {
            int n8;
            int[] nArray = new int[16];
            int[] nArray2 = zzgnj.zzd(this.zza, object);
            zzgnj.zzb(nArray, nArray2);
            nArray[12] = n3;
            nArray[13] = 0;
            nArray[14] = n3 = object[4];
            nArray[15] = n8 = object[5];
            return nArray;
        }
        object = new IllegalArgumentException;
        Object object2 = n4 *= 32;
        Object[] objectArray = new Object[]{object2};
        object2 = String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", objectArray);
        object((String)object2);
        throw object;
    }
}

