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

final class zzk
extends zzp {
    private final /* synthetic */ int zzaj;
    private final /* synthetic */ String zzak;

    public zzk(zzj zzj2, GoogleApiClient googleApiClient, int n3, String string2) {
        this.zzaj = n3;
        this.zzak = string2;
        super(googleApiClient, null);
    }

    public final /* synthetic */ void doExecute(Api$AnyClient object) {
        object = (zzh)object;
        int n3 = this.zzaj;
        String string2 = this.zzak;
        object = ((zzh)object).zza(this, n3, string2);
        this.setCancelToken((ICancelToken)object);
    }
}

