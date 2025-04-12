/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.internal.plus.zzj;
import com.google.android.gms.internal.plus.zzp;
import com.google.android.gms.plus.internal.zzh;

final class zzl
extends zzp {
    private final /* synthetic */ String zzak;

    public zzl(zzj zzj2, GoogleApiClient googleApiClient, String string2) {
        this.zzak = string2;
        super(googleApiClient, null);
    }

    public final /* synthetic */ void doExecute(Api$AnyClient object) {
        object = (zzh)object;
        String string2 = this.zzak;
        object = ((zzh)object).zza(this, 0, string2);
        this.setCancelToken((ICancelToken)object);
    }
}

