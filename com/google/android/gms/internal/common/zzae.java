/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzaf;
import java.util.Arrays;

class zzae
extends zzaf {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzae(int n3) {
        Object[] objectArray = new Object[4];
        this.zza = objectArray;
        this.zzb = 0;
    }

    public final zzae zza(Object object) {
        object.getClass();
        Object[] objectArray = this.zza;
        int n3 = objectArray.length;
        int n4 = this.zzb;
        int n7 = n4 + 1;
        if (n7 >= 0) {
            int n8;
            if (n7 <= n3) {
                n8 = n3;
            } else {
                n8 = (n3 >> 1) + n3 + 1;
                if (n8 < n7) {
                    n4 = Integer.highestOneBit(n4);
                    n8 = n4 + n4;
                }
                if (n8 < 0) {
                    n8 = -1 >>> 1;
                }
            }
            if (n8 > n3 || (n3 = (int)(this.zzc ? 1 : 0)) != 0) {
                this.zza = objectArray = Arrays.copyOf(this.zza, n8);
                n3 = 0;
                objectArray = null;
                this.zzc = false;
            }
            objectArray = this.zza;
            n4 = this.zzb;
            this.zzb = n7 = n4 + 1;
            objectArray[n4] = object;
            return this;
        }
        object = new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        throw object;
    }
}

