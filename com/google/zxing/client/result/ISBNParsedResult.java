/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;

public final class ISBNParsedResult
extends ParsedResult {
    private final String isbn;

    public ISBNParsedResult(String string2) {
        ParsedResultType parsedResultType = ParsedResultType.ISBN;
        super(parsedResultType);
        this.isbn = string2;
    }

    public String getDisplayResult() {
        return this.isbn;
    }

    public String getISBN() {
        return this.isbn;
    }
}

