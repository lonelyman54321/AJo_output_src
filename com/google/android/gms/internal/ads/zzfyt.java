/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxq;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfyp;
import com.google.android.gms.internal.ads.zzfyq;
import com.google.android.gms.internal.ads.zzfys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzfyt {
    private final zzfxr zza;
    private final zzfys zzb;

    private zzfyt(zzfys zzfys2) {
        zzfxr zzfxr2 = zzfxq.zza;
        this.zzb = zzfys2;
        this.zza = zzfxr2;
    }

    public static /* bridge */ /* synthetic */ zzfxr zza(zzfyt zzfyt2) {
        return zzfyt2.zza;
    }

    public static zzfyt zzb(int n3) {
        zzfyp zzfyp2 = new zzfyp(4000);
        zzfyt zzfyt2 = new zzfyt(zzfyp2);
        return zzfyt2;
    }

    public static zzfyt zzc(zzfxr zzfxr2) {
        zzfyn zzfyn2 = new zzfyn(zzfxr2);
        zzfyt zzfyt2 = new zzfyt(zzfyn2);
        return zzfyt2;
    }

    public static /* bridge */ /* synthetic */ Iterator zze(zzfyt zzfyt2, CharSequence charSequence) {
        return zzfyt2.zzg(charSequence);
    }

    private final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        zzfyq zzfyq2 = new zzfyq(this, charSequence);
        return zzfyq2;
    }

    public final List zzf(CharSequence object) {
        boolean bl2;
        object.getClass();
        object = this.zzg((CharSequence)object);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            arrayList.add(string2);
        }
        return Collections.unmodifiableList(arrayList);
    }
}

