/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.phone;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

public interface SmsCodeAutofillClient
extends HasApiKey {
    public Task checkPermissionState();

    public Task hasOngoingSmsRequest(String var1);

    public Task startSmsCodeRetriever();
}

