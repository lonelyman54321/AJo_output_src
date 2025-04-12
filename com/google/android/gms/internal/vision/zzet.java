/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzee;
import com.google.android.gms.internal.vision.zzef;
import com.google.android.gms.internal.vision.zzej;
import com.google.android.gms.internal.vision.zzfa;
import java.util.Iterator;

final class zzet
extends zzej {
    private final transient zzef zza;
    private final transient zzee zzb;

    public zzet(zzef zzef2, zzee zzee2) {
        this.zza = zzef2;
        this.zzb = zzee2;
    }

    public final boolean contains(Object object) {
        zzef zzef2 = this.zza;
        return (object = zzef2.get(object)) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zza();
    }

    public final int size() {
        return this.zza.size();
    }

    public final int zza(Object[] objectArray, int n3) {
        return this.zze().zza(objectArray, n3);
    }

    public final zzfa zza() {
        return (zzfa)this.zze().iterator();
    }

    public final zzee zze() {
        return this.zzb;
    }

    public final boolean zzf() {
        return true;
    }
}

