/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

final class zzec {
    public static int zza(int n3) {
        return (int)((long)Integer.rotateLeft((int)((long)n3 * 3432918353L), 15) * 461845907L);
    }

    public static int zza(Object object) {
        int n3;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return zzec.zza(n3);
    }
}

