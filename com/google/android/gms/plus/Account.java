/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface Account {
    public void clearDefaultAccount(GoogleApiClient var1);

    public String getAccountName(GoogleApiClient var1);

    public PendingResult revokeAccessAndDisconnect(GoogleApiClient var1);
}

