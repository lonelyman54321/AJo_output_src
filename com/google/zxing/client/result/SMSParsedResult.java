/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;

public final class SMSParsedResult
extends ParsedResult {
    private final String body;
    private final String[] numbers;
    private final String subject;
    private final String[] vias;

    public SMSParsedResult(String stringArray, String string2, String string3, String string4) {
        ParsedResultType parsedResultType = ParsedResultType.SMS;
        super(parsedResultType);
        stringArray = new String[]{stringArray};
        this.numbers = stringArray;
        stringArray = new String[]{string2};
        this.vias = stringArray;
        this.subject = string3;
        this.body = string4;
    }

    public SMSParsedResult(String[] stringArray, String[] stringArray2, String string2, String string3) {
        ParsedResultType parsedResultType = ParsedResultType.SMS;
        super(parsedResultType);
        this.numbers = stringArray;
        this.vias = stringArray2;
        this.subject = string2;
        this.body = string3;
    }

    public String getBody() {
        return this.body;
    }

    public String getDisplayResult() {
        StringBuilder stringBuilder = new StringBuilder(100);
        ParsedResult.maybeAppend(this.numbers, stringBuilder);
        ParsedResult.maybeAppend(this.subject, stringBuilder);
        ParsedResult.maybeAppend(this.body, stringBuilder);
        return stringBuilder.toString();
    }

    public String[] getNumbers() {
        return this.numbers;
    }

    public String getSMSURI() {
        String string2;
        Object object;
        int n3;
        int n4;
        String string3 = "sms:";
        StringBuilder stringBuilder = new StringBuilder(string3);
        char c2 = '\u0001';
        char c3 = '\u0000';
        String string4 = null;
        String string5 = null;
        boolean bl2 = true;
        for (n4 = 0; n4 < (n3 = ((String[])(object = this.numbers)).length); ++n4) {
            if (bl2) {
                bl2 = false;
                string2 = null;
            } else {
                n3 = 44;
                stringBuilder.append((char)n3);
            }
            object = this.numbers[n4];
            stringBuilder.append((String)object);
            object = this.vias;
            if (object == null || (object = object[n4]) == null) continue;
            stringBuilder.append(";via=");
            object = this.vias[n4];
            stringBuilder.append((String)object);
        }
        string5 = this.body;
        if (string5 != null) {
            n4 = 1;
        } else {
            n4 = 0;
            string5 = null;
        }
        string2 = this.subject;
        if (string2 == null) {
            c2 = '\u0000';
            string3 = null;
        }
        if (n4 != 0 || c2 != '\u0000') {
            c3 = '?';
            stringBuilder.append(c3);
            if (n4 != 0) {
                stringBuilder.append("body=");
                string4 = this.body;
                stringBuilder.append(string4);
            }
            if (c2 != '\u0000') {
                if (n4 != 0) {
                    c2 = '&';
                    stringBuilder.append(c2);
                }
                stringBuilder.append("subject=");
                string3 = this.subject;
                stringBuilder.append(string3);
            }
        }
        return stringBuilder.toString();
    }

    public String getSubject() {
        return this.subject;
    }

    public String[] getVias() {
        return this.vias;
    }
}

