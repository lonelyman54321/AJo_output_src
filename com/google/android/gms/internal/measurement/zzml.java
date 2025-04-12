/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zzmn;
import com.google.android.gms.internal.measurement.zzmo;
import java.util.Iterator;
import java.util.Map;

final class zzml
implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzmj zzc;

    private zzml(zzmj zzmj2) {
        int n3;
        this.zzc = zzmj2;
        this.zza = n3 = zzmj.zza(zzmj2);
    }

    public /* synthetic */ zzml(zzmj zzmj2, zzmo zzmo2) {
        this(zzmj2);
    }

    private final Iterator zza() {
        Iterator iterator = this.zzb;
        if (iterator == null) {
            this.zzb = iterator = zzmj.zzc(this.zzc).entrySet().iterator();
        }
        return this.zzb;
    }

    public final boolean hasNext() {
        Iterator iterator;
        zzmj zzmj2;
        int n3;
        int n4 = this.zza;
        return n4 > 0 && n4 <= (n3 = zzmj.zza(zzmj2 = this.zzc)) || (n4 = (int)((iterator = this.zza()).hasNext() ? 1 : 0)) != 0;
    }

    public final /* synthetic */ Object next() {
        int n3;
        Object[] objectArray = this.zza();
        boolean bl2 = objectArray.hasNext();
        if (bl2) {
            return (Map.Entry)this.zza().next();
        }
        objectArray = zzmj.zze(this.zzc);
        this.zza = n3 = this.zza + -1;
        return (zzmn)objectArray[n3];
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

