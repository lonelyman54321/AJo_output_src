/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

final class zzggl {
    public static void zza(Throwable object) {
        boolean bl2 = object instanceof InterruptedException;
        if (bl2) {
            object = Thread.currentThread();
            ((Thread)object).interrupt();
        }
    }
}

