/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztp;
import com.google.android.gms.internal.gtm.zztq;
import com.google.android.gms.internal.gtm.zzua;
import java.util.Iterator;

final class zztz
extends zztp {
    final transient Object zza;

    public zztz(Object object) {
        object.getClass();
        this.zza = object;
    }

    public final boolean contains(Object object) {
        return this.zza.equals(object);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        Object object = this.zza;
        zztq zztq2 = new zztq(object);
        return zztq2;
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String string2 = this.zza.toString();
        return cP.a("[", string2, "]");
    }

    public final int zza(Object[] objectArray, int n3) {
        Object object;
        objectArray[0] = object = this.zza;
        return 1;
    }

    public final zzua zzd() {
        Object object = this.zza;
        zztq zztq2 = new zztq(object);
        return zztq2;
    }
}

