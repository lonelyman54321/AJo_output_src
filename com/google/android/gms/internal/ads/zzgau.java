/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

final class zzgau {
    public static int zza(int n3) {
        return (int)((long)Integer.rotateLeft((int)((long)n3 * 3432918353L), 15) * 461845907L);
    }

    public static int zzb(Object object) {
        int n3;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return zzgau.zza(n3);
    }
}

