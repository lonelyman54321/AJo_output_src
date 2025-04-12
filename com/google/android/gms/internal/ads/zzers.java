/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.ads.zzerw;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzers
implements zzfxu {
    public final Object apply(Object object) {
        object = (AppSetIdInfo)object;
        String string2 = ((AppSetIdInfo)object).getId();
        int n3 = ((AppSetIdInfo)object).getScope();
        zzerw zzerw2 = new zzerw(string2, n3);
        return zzerw2;
    }
}

