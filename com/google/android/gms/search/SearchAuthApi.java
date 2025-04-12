/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.search;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface SearchAuthApi {
    public PendingResult clearToken(GoogleApiClient var1, String var2);

    public PendingResult getGoogleNowAuth(GoogleApiClient var1, String var2);
}

