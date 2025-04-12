/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.client.result.TelParsedResult;

public final class TelResultParser
extends ResultParser {
    public TelParsedResult parse(Result object) {
        Object object2;
        boolean bl2;
        object = ResultParser.getMassagedText((Result)object);
        Object object3 = "tel:";
        boolean n3 = ((String)object).startsWith((String)object3);
        String string2 = "TEL:";
        if (!n3 && !(bl2 = ((String)object).startsWith(string2))) {
            return null;
        }
        boolean bl3 = ((String)object).startsWith(string2);
        int n4 = 4;
        if (bl3) {
            object2 = new StringBuilder((String)object3);
            object3 = ((String)object).substring(n4);
            ((StringBuilder)object2).append((String)object3);
            object3 = ((StringBuilder)object2).toString();
        } else {
            object3 = object;
        }
        int n7 = ((String)object).indexOf(63, n4);
        object = n7 < 0 ? ((String)object).substring(n4) : ((String)object).substring(n4, n7);
        object2 = new TelParsedResult((String)object, (String)object3, null);
        return object2;
    }
}

