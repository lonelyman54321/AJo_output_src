/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1nSDK;
import java.io.IOException;

public class HttpException
extends IOException {
    private final AFe1nSDK AFAdRevenueData;

    public HttpException(Throwable throwable, AFe1nSDK aFe1nSDK) {
        String string2 = throwable.getMessage();
        super(string2, throwable);
        this.AFAdRevenueData = aFe1nSDK;
    }

    public AFe1nSDK getMetrics() {
        return this.AFAdRevenueData;
    }
}

