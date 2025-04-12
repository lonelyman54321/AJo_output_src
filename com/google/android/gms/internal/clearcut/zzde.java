/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzdm;
import com.google.android.gms.internal.clearcut.zzdn;

final class zzde
implements zzdn {
    public final boolean zza(Class clazz) {
        return false;
    }

    public final zzdm zzb(Class serializable) {
        serializable = new IllegalStateException("This should never be called.");
        throw serializable;
    }
}

