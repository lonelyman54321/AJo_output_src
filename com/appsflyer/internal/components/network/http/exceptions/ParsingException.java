/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1kSDK;
import java.io.IOException;

public class ParsingException
extends IOException {
    private final AFe1kSDK getRevenue;

    public ParsingException(String string2, Throwable throwable, AFe1kSDK aFe1kSDK) {
        super(string2, throwable);
        this.getRevenue = aFe1kSDK;
    }

    public AFe1kSDK getRawResponse() {
        return this.getRevenue;
    }
}

