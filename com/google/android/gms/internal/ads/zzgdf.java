/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgbl;
import com.google.android.gms.internal.ads.zzgdi;
import java.util.Iterator;

final class zzgdf
extends zzgbh {
    final transient Object zza;

    public zzgdf(Object object) {
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
        zzgbl zzgbl2 = new zzgbl(object);
        return zzgbl2;
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
        objectArray[n3] = object = this.zza;
        return n3 + 1;
    }

    public final zzgbc zzd() {
        return zzgbc.zzn(this.zza);
    }

    public final zzgdi zze() {
        Object object = this.zza;
        zzgbl zzgbl2 = new zzgbl(object);
        return zzgbl2;
    }

    public final boolean zzf() {
        return false;
    }
}

