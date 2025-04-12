/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzeb;
import com.google.android.gms.internal.icing.zzec;

final class zzdu
implements zzec {
    public final boolean zzb(Class clazz) {
        return false;
    }

    public final zzeb zzc(Class serializable) {
        serializable = new IllegalStateException("This should never be called.");
        throw serializable;
    }
}

