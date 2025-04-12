/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzq;
import com.google.android.gms.internal.common.zzr;
import com.google.android.gms.internal.common.zzw;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzaa {
    private final zzr zza;
    private final boolean zzb;
    private final zzx zzc;

    private zzaa(zzx zzx2, boolean bl2, zzr zzr2, int n3) {
        this.zzc = zzx2;
        this.zzb = bl2;
        this.zza = zzr2;
    }

    public static /* bridge */ /* synthetic */ zzr zza(zzaa zzaa2) {
        return zzaa2.zza;
    }

    public static zzaa zzc(zzr zzr2) {
        zzx zzx2 = new zzx(zzr2);
        zzr2 = zzq.zza;
        zzaa zzaa2 = new zzaa(zzx2, false, zzr2, -1 >>> 1);
        return zzaa2;
    }

    public static /* bridge */ /* synthetic */ Iterator zze(zzaa zzaa2, CharSequence charSequence) {
        return zzaa2.zzh(charSequence);
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzaa zzaa2) {
        return zzaa2.zzb;
    }

    private final Iterator zzh(CharSequence charSequence) {
        zzx zzx2 = this.zzc;
        zzr zzr2 = zzx2.zza;
        zzw zzw2 = new zzw(zzx2, this, charSequence, zzr2);
        return zzw2;
    }

    public final zzaa zzb() {
        zzr zzr2 = this.zza;
        zzx zzx2 = this.zzc;
        zzaa zzaa2 = new zzaa(zzx2, true, zzr2, -1 >>> 1);
        return zzaa2;
    }

    public final Iterable zzd(CharSequence charSequence) {
        zzy zzy2 = new zzy(this, charSequence);
        return zzy2;
    }

    public final List zzf(CharSequence object) {
        boolean bl2;
        object.getClass();
        object = this.zzh((CharSequence)object);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            arrayList.add(string2);
        }
        return Collections.unmodifiableList(arrayList);
    }
}

