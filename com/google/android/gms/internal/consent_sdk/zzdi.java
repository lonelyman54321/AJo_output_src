/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzde;
import com.google.android.gms.internal.consent_sdk.zzdf;
import com.google.android.gms.internal.consent_sdk.zzdj;
import java.util.Iterator;

final class zzdi
extends zzde {
    final transient Object zza;

    public zzdi(Object object) {
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
        zzdf zzdf2 = new zzdf(object);
        return zzdf2;
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

    public final zzdj zzd() {
        Object object = this.zza;
        zzdf zzdf2 = new zzdf(object);
        return zzdf2;
    }
}

