/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.ads.zzezu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzezr
implements zzgfa {
    public final ListenableFuture zza(Object object) {
        if ((object = (AppSetIdInfo)object) == null) {
            Object var2_2 = null;
            int n3 = -1;
            object = new zzezu(null, n3);
            object = zzgft.zzh(object);
        } else {
            String string2 = ((AppSetIdInfo)object).getId();
            int n4 = ((AppSetIdInfo)object).getScope();
            zzezu zzezu2 = new zzezu(string2, n4);
            object = zzgft.zzh(zzezu2);
        }
        return object;
    }
}

