/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzfxu;
import java.util.ArrayList;
import java.util.List;

public final class zzdor
implements zzfxu {
    public final Object apply(Object iterator) {
        boolean bl2;
        iterator = (List)((Object)iterator);
        ArrayList<zzbhi> arrayList = new ArrayList<zzbhi>();
        iterator = iterator.iterator();
        while (bl2 = iterator.hasNext()) {
            zzbhi zzbhi2 = (zzbhi)iterator.next();
            if (zzbhi2 == null) continue;
            arrayList.add(zzbhi2);
        }
        return arrayList;
    }
}

