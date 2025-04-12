/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzbkj
implements zzfxu {
    public final Object apply(Object object) {
        object = (Throwable)object;
        Object object2 = zzblo.zza;
        object2 = (Boolean)zzbgj.zzk.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = "prepareClickUrl.attestation1";
            zzcby zzcby2 = zzu.zzo();
            zzcby2.zzw((Throwable)object, (String)object2);
        }
        return "failure_click_attok";
    }
}

