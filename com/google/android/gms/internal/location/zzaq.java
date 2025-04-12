/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbb;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaq
extends zzba {
    public zzaq(zzbb zzbb2, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* synthetic */ void doExecute(Api$AnyClient api$AnyClient) {
        api$AnyClient = (zzdz)api$AnyClient;
        TaskCompletionSource taskCompletionSource = zzbb.zza(this);
        ((zzdz)api$AnyClient).zzB(taskCompletionSource);
    }
}

