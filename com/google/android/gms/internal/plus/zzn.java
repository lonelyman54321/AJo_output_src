/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.plus.zzj;
import com.google.android.gms.internal.plus.zzp;
import com.google.android.gms.plus.internal.zzh;
import java.util.Collection;

final class zzn
extends zzp {
    private final /* synthetic */ Collection zzal;

    public zzn(zzj zzj2, GoogleApiClient googleApiClient, Collection collection) {
        this.zzal = collection;
        super(googleApiClient, null);
    }

    public final /* synthetic */ void doExecute(Api$AnyClient api$AnyClient) {
        api$AnyClient = (zzh)api$AnyClient;
        Collection collection = this.zzal;
        ((zzh)api$AnyClient).zza(this, collection);
    }
}

