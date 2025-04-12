/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.plus.zzf;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zzh;

public final class zze
implements Account {
    public final void clearDefaultAccount(GoogleApiClient object) {
        if ((object = Plus.zza((GoogleApiClient)object, false)) != null) {
            ((zzh)object).zza();
        }
    }

    public final String getAccountName(GoogleApiClient googleApiClient) {
        return Plus.zza(googleApiClient, true).getAccountName();
    }

    public final PendingResult revokeAccessAndDisconnect(GoogleApiClient googleApiClient) {
        zzf zzf2 = new zzf(this, googleApiClient);
        return googleApiClient.execute(zzf2);
    }
}

