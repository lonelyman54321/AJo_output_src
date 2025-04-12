/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.internal.icing.zzal;
import com.google.android.gms.internal.icing.zzd;
import com.google.android.gms.internal.icing.zzz;

public final class zze {
    public static final Api$ClientKey zza;
    public static final Api zzb;
    public static final zzz zzc;
    private static final Api$AbstractClientBuilder zzd;

    static {
        Api api;
        Object object = new Api$ClientKey();
        zza = object;
        zzd zzd2 = new zzd();
        zzd = zzd2;
        zzb = api = new Api("AppDataSearch.LIGHTWEIGHT_API", zzd2, (Api$ClientKey)object);
        zzc = object = new zzal();
    }
}

