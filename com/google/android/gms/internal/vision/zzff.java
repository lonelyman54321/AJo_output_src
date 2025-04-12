/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzff
extends WeakReference {
    private final int zza;

    public zzff(Throwable throwable, ReferenceQueue referenceQueue) {
        super(throwable, referenceQueue);
        if (throwable != null) {
            int n3;
            this.zza = n3 = System.identityHashCode(throwable);
            return;
        }
        super("The referent cannot be null");
        throw throwable;
    }

    public final boolean equals(Object object) {
        Class clazz;
        Class<?> clazz2;
        if (object != null && (clazz2 = object.getClass()) == (clazz = zzff.class)) {
            boolean bl2 = true;
            if (this == object) {
                return bl2;
            }
            object = (zzff)object;
            int n3 = this.zza;
            int n4 = ((zzff)object).zza;
            if (n3 == n4 && (clazz = this.get()) == (object = ((Reference)object).get())) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }
}

