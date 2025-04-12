/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import com.appsflyer.internal.components.network.http.ResponseNetwork;

public interface PurchaseHandler$PurchaseValidationCallback {
    public void onFailure(Throwable var1);

    public void onResponse(ResponseNetwork var1);
}

