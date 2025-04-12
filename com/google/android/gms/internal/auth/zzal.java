/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccount;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzac;
import com.google.android.gms.internal.auth.zzae;
import com.google.android.gms.internal.auth.zzag;

public final class zzal
implements WorkAccountApi {
    private static final Status zza;

    static {
        Status status;
        zza = status = new Status(13);
    }

    public static /* bridge */ /* synthetic */ Status zza() {
        return zza;
    }

    public final PendingResult addWorkAccount(GoogleApiClient googleApiClient, String string2) {
        Api api = WorkAccount.API;
        zzae zzae2 = new zzae(this, api, googleApiClient, string2);
        return googleApiClient.execute(zzae2);
    }

    public final PendingResult removeWorkAccount(GoogleApiClient googleApiClient, Account account) {
        Api api = WorkAccount.API;
        zzag zzag2 = new zzag(this, api, googleApiClient, account);
        return googleApiClient.execute(zzag2);
    }

    public final void setWorkAuthenticatorEnabled(GoogleApiClient googleApiClient, boolean bl2) {
        this.setWorkAuthenticatorEnabledWithResult(googleApiClient, bl2);
    }

    public final PendingResult setWorkAuthenticatorEnabledWithResult(GoogleApiClient googleApiClient, boolean bl2) {
        Api api = WorkAccount.API;
        zzac zzac2 = new zzac(this, api, googleApiClient, bl2);
        return googleApiClient.execute(zzac2);
    }
}

