/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.plus.zzj;
import com.google.android.gms.internal.plus.zzp;
import com.google.android.gms.plus.internal.zzh;

final class zzo
extends zzp {
    private final /* synthetic */ String[] zzam;

    public zzo(zzj zzj2, GoogleApiClient googleApiClient, String[] stringArray) {
        this.zzam = stringArray;
        super(googleApiClient, null);
    }

    public final /* synthetic */ void doExecute(Api$AnyClient api$AnyClient) {
        api$AnyClient = (zzh)api$AnyClient;
        String[] stringArray = this.zzam;
        ((zzh)api$AnyClient).zza(this, stringArray);
    }
}

