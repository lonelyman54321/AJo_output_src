/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzdg;
import com.google.android.gms.internal.vision.zzfb;

public final class zzfc
extends zzfb {
    public static int zza(int n3, int n4, int n7) {
        Object[] objectArray;
        boolean bl2;
        int n8 = 1;
        int n10 = -1 >>> 2;
        if (n4 <= n10) {
            bl2 = true;
        } else {
            bl2 = false;
            objectArray = null;
        }
        if (bl2) {
            return Math.min(Math.max(n3, n4), n10);
        }
        Object object = n4;
        Integer n14 = n10;
        objectArray = new Object[2];
        objectArray[0] = object;
        objectArray[n8] = n14;
        object = zzdg.zza("min (%s) must be less than or equal to max (%s)", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }
}

