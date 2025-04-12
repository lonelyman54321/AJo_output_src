/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.icing.zzay;
import com.google.android.gms.internal.icing.zzba;
import com.google.android.gms.search.SearchAuthApi;

public final class zzbc
implements SearchAuthApi {
    public final PendingResult clearToken(GoogleApiClient googleApiClient, String string2) {
        zzay zzay2 = new zzay(googleApiClient, string2);
        return googleApiClient.enqueue(zzay2);
    }

    public final PendingResult getGoogleNowAuth(GoogleApiClient googleApiClient, String string2) {
        zzba zzba2 = new zzba(googleApiClient, string2);
        return googleApiClient.enqueue(zzba2);
    }
}

