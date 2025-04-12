/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.phone;

import com.google.android.gms.tasks.Task;

public interface SmsRetrieverApi {
    public Task startSmsRetriever();

    public Task startSmsUserConsent(String var1);
}

