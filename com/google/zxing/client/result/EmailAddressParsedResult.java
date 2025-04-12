/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;

public final class EmailAddressParsedResult
extends ParsedResult {
    private final String[] bccs;
    private final String body;
    private final String[] ccs;
    private final String subject;
    private final String[] tos;

    public EmailAddressParsedResult(String string2) {
        String[] stringArray = new String[]{string2};
        this(stringArray, null, null, null, null);
    }

    public EmailAddressParsedResult(String[] stringArray, String[] stringArray2, String[] stringArray3, String string2, String string3) {
        ParsedResultType parsedResultType = ParsedResultType.EMAIL_ADDRESS;
        super(parsedResultType);
        this.tos = stringArray;
        this.ccs = stringArray2;
        this.bccs = stringArray3;
        this.subject = string2;
        this.body = string3;
    }

    public String[] getBCCs() {
        return this.bccs;
    }

    public String getBody() {
        return this.body;
    }

    public String[] getCCs() {
        return this.ccs;
    }

    public String getDisplayResult() {
        StringBuilder stringBuilder = new StringBuilder(30);
        ParsedResult.maybeAppend(this.tos, stringBuilder);
        ParsedResult.maybeAppend(this.ccs, stringBuilder);
        ParsedResult.maybeAppend(this.bccs, stringBuilder);
        ParsedResult.maybeAppend(this.subject, stringBuilder);
        ParsedResult.maybeAppend(this.body, stringBuilder);
        return stringBuilder.toString();
    }

    public String getEmailAddress() {
        int n3;
        String[] stringArray = this.tos;
        if (stringArray != null && (n3 = stringArray.length) != 0) {
            return stringArray[0];
        }
        return null;
    }

    public String getMailtoURI() {
        return "mailto:";
    }

    public String getSubject() {
        return this.subject;
    }

    public String[] getTos() {
        return this.tos;
    }
}

