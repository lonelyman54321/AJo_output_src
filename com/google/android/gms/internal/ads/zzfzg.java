/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzh;
import com.google.android.gms.internal.ads.zzfzi;
import com.google.android.gms.internal.ads.zzfzv;
import com.google.android.gms.internal.ads.zzgab;
import com.google.android.gms.internal.ads.zzgbv;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

final class zzfzg
extends zzgbv {
    final /* synthetic */ zzfzi zza;

    public zzfzg(zzfzi zzfzi2) {
        this.zza = zzfzi2;
    }

    public final boolean contains(Object object) {
        return zzgab.zza(this.zza.zza.entrySet(), object);
    }

    public final Iterator iterator() {
        zzfzi zzfzi2 = this.zza;
        zzfzh zzfzh2 = new zzfzh(zzfzi2);
        return zzfzh2;
    }

    public final boolean remove(Object object) {
        boolean bl2 = this.contains(object);
        if (!bl2) {
            return false;
        }
        object = (Map.Entry)object;
        Objects.requireNonNull(object);
        object = (Map.Entry)object;
        zzfzi zzfzi2 = this.zza;
        object = object.getKey();
        zzfzv.zzo(zzfzi2.zzb, object);
        return true;
    }

    public final Map zza() {
        return this.zza;
    }
}

