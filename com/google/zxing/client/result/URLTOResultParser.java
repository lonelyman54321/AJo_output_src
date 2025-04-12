/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.client.result.URIParsedResult;

public final class URLTOResultParser
extends ResultParser {
    public URIParsedResult parse(Result object) {
        boolean bl2;
        object = ResultParser.getMassagedText((Result)object);
        Object object2 = "urlto:";
        boolean n3 = ((String)object).startsWith((String)object2);
        String string2 = null;
        if (!n3 && !(bl2 = ((String)object).startsWith((String)(object2 = "URLTO:")))) {
            return null;
        }
        int n4 = 6;
        int n7 = ((String)object).indexOf(58, n4);
        if (n7 < 0) {
            return null;
        }
        if (n7 > n4) {
            string2 = ((String)object).substring(n4, n7);
        }
        int n8 = n7 + 1;
        object = ((String)object).substring(n8);
        object2 = new URIParsedResult((String)object, string2);
        return object2;
    }
}

