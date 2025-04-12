/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzera;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;

final class zzerb
implements zzexw {
    private final Set zza;

    public zzerb(Set set) {
        this.zza = set;
    }

    public final int zza() {
        return 8;
    }

    public final ListenableFuture zzb() {
        boolean bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = this.zza.iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            arrayList.add(string2);
        }
        object = new zzera(arrayList);
        return zzgft.zzh(object);
    }
}

