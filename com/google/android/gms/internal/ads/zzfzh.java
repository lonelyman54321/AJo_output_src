/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzfzi;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.Collection;
import java.util.Iterator;

final class zzfzh
implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfzi zzc;

    public zzfzh(zzfzi object) {
        this.zzc = object;
        this.zza = object = ((zzfzi)object).zza.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        boolean bl2;
        Object object = this.zzb;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        zzfyg.zzk(bl2, "no calls to next() since the last call to remove()");
        this.zza.remove();
        object = this.zzc.zzb;
        int n3 = zzfzv.zzd((zzfzv)object);
        int n4 = this.zzb.size();
        zzfzv.zzn((zzfzv)object, n3 -= n4);
        this.zzb.clear();
        this.zzb = null;
    }
}

