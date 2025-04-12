/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.internal;

import com.google.android.gms.tasks.Task;

public interface InternalTokenProvider {
    public Task getAccessToken(boolean var1);

    public String getUid();
}

