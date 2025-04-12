/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface WorkAccountApi {
    public PendingResult addWorkAccount(GoogleApiClient var1, String var2);

    public PendingResult removeWorkAccount(GoogleApiClient var1, Account var2);

    public void setWorkAuthenticatorEnabled(GoogleApiClient var1, boolean var2);

    public PendingResult setWorkAuthenticatorEnabledWithResult(GoogleApiClient var1, boolean var2);
}

