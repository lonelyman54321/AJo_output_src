/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzee;
import com.google.android.gms.internal.vision.zzer;
import java.util.AbstractMap;

final class zzeu
extends zzee {
    private final /* synthetic */ zzer zza;

    public zzeu(zzer zzer2) {
        this.zza = zzer2;
    }

    public final /* synthetic */ Object get(int n3) {
        int n4 = zzer.zza(this.zza);
        zzde.zza(n3, n4);
        Object object = zzer.zzb(this.zza);
        object = object[n3 *= 2];
        Object object2 = zzer.zzb(this.zza);
        Object object3 = object2[++n3];
        object2 = new AbstractMap.SimpleImmutableEntry(object, object3);
        return object2;
    }

    public final int size() {
        return zzer.zza(this.zza);
    }

    public final boolean zzf() {
        return true;
    }
}

