/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;

public final class ProductParsedResult
extends ParsedResult {
    private final String normalizedProductID;
    private final String productID;

    public ProductParsedResult(String string2) {
        this(string2, string2);
    }

    public ProductParsedResult(String string2, String string3) {
        ParsedResultType parsedResultType = ParsedResultType.PRODUCT;
        super(parsedResultType);
        this.productID = string2;
        this.normalizedProductID = string3;
    }

    public String getDisplayResult() {
        return this.productID;
    }

    public String getNormalizedProductID() {
        return this.normalizedProductID;
    }

    public String getProductID() {
        return this.productID;
    }
}

