/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdpa;
import com.google.android.gms.internal.ads.zzfxu;
import java.util.ArrayList;
import java.util.List;

public final class zzdoz
implements zzfxu {
    public final Object apply(Object iterator) {
        boolean bl2;
        iterator = (List)((Object)iterator);
        ArrayList<zzdpa> arrayList = new ArrayList<zzdpa>();
        iterator = iterator.iterator();
        while (bl2 = iterator.hasNext()) {
            zzdpa zzdpa2 = (zzdpa)iterator.next();
            if (zzdpa2 == null) continue;
            arrayList.add(zzdpa2);
        }
        return arrayList;
    }
}

