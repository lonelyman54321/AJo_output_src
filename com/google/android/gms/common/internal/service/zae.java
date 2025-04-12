/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.service.zac;

public final class zae {
    public final PendingResult zaa(GoogleApiClient googleApiClient) {
        zac zac2 = new zac(this, googleApiClient);
        return googleApiClient.execute(zac2);
    }
}

