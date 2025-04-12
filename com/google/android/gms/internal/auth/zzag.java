/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzal;

final class zzag
extends BaseImplementation$ApiMethodImpl {
    final /* synthetic */ Account zza;

    public zzag(zzal zzal2, Api api, GoogleApiClient googleApiClient, Account account) {
        this.zza = account;
        super(api, googleApiClient);
    }

    public final Result createFailedResult(Status status) {
        zzak zzak2 = new zzak(status);
        return zzak2;
    }
}

