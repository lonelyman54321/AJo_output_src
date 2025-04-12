/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.ads.zzerw;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzert
implements zzgfa {
    public final ListenableFuture zza(Object object) {
        if ((object = (AppSetIdInfo)object) == null) {
            Object var2_2 = null;
            int n3 = -1;
            object = new zzerw(null, n3);
            object = zzgft.zzh(object);
        } else {
            String string2 = ((AppSetIdInfo)object).getId();
            int n4 = ((AppSetIdInfo)object).getScope();
            zzerw zzerw2 = new zzerw(string2, n4);
            object = zzgft.zzh(zzerw2);
        }
        return object;
    }
}

