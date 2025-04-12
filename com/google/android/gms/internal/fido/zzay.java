/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzau;
import com.google.android.gms.internal.fido.zzav;
import com.google.android.gms.internal.fido.zzaz;
import java.util.Iterator;

final class zzay
extends zzau {
    final transient Object zza;

    public zzay(Object object) {
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
        zzav zzav2 = new zzav(object);
        return zzav2;
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

    public final zzaz zzd() {
        Object object = this.zza;
        zzav zzav2 = new zzav(object);
        return zzav2;
    }
}

