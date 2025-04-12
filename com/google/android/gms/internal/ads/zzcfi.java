/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzcfi
implements Iterable {
    private final List zza;

    public zzcfi() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
    }

    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final zzcfh zza(zzcee zzcee2) {
        boolean bl2;
        Iterator iterator = this.iterator();
        while (bl2 = iterator.hasNext()) {
            zzcfh zzcfh2 = (zzcfh)iterator.next();
            zzcee zzcee3 = zzcfh2.zza;
            if (zzcee3 != zzcee2) continue;
            return zzcfh2;
        }
        return null;
    }

    public final void zzb(zzcfh zzcfh2) {
        this.zza.add(zzcfh2);
    }

    public final void zzc(zzcfh zzcfh2) {
        this.zza.remove(zzcfh2);
    }

    public final boolean zzd(zzcee object) {
        boolean bl2;
        boolean bl3;
        Object object2 = new ArrayList();
        Iterator iterator = this.iterator();
        while (bl3 = iterator.hasNext()) {
            zzcfh zzcfh2 = (zzcfh)iterator.next();
            zzcee zzcee2 = zzcfh2.zza;
            if (zzcee2 != object) continue;
            ((ArrayList)object2).add(zzcfh2);
        }
        boolean bl4 = ((ArrayList)object2).isEmpty();
        if (bl4) {
            return false;
        }
        object = ((ArrayList)object2).iterator();
        while (bl2 = object.hasNext()) {
            object2 = ((zzcfh)object.next()).zzb;
            ((zzcfp)object2).zzf();
        }
        return true;
    }
}

