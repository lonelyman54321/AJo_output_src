/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface CredentialsApi {
    public static final int ACTIVITY_RESULT_ADD_ACCOUNT = 1000;
    public static final int ACTIVITY_RESULT_NO_HINTS_AVAILABLE = 1002;
    public static final int ACTIVITY_RESULT_OTHER_ACCOUNT = 1001;
    public static final int CREDENTIAL_PICKER_REQUEST_CODE = 2000;

    public PendingResult delete(GoogleApiClient var1, Credential var2);

    public PendingResult disableAutoSignIn(GoogleApiClient var1);

    public PendingIntent getHintPickerIntent(GoogleApiClient var1, HintRequest var2);

    public PendingResult request(GoogleApiClient var1, CredentialRequest var2);

    public PendingResult save(GoogleApiClient var1, Credential var2);
}

