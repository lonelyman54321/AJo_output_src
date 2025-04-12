/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.client.result.SMSParsedResult;

public final class SMSTOMMSTOResultParser
extends ResultParser {
    public SMSParsedResult parse(Result object) {
        String string2;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Object object2;
        boolean n3 = ((String)(object = ResultParser.getMassagedText((Result)object))).startsWith((String)(object2 = "smsto:"));
        if (!(n3 || (bl4 = ((String)object).startsWith((String)(object2 = "SMSTO:"))) || (bl3 = ((String)object).startsWith((String)(object2 = "mmsto:"))) || (bl2 = ((String)object).startsWith((String)(object2 = "MMSTO:"))))) {
            return null;
        }
        int n4 = ((String)(object = ((String)object).substring(6))).indexOf(58);
        if (n4 >= 0) {
            int n7 = n4 + 1;
            string2 = ((String)object).substring(n7);
            object = ((String)object).substring(0, n4);
        } else {
            boolean bl5 = false;
            string2 = null;
        }
        object2 = new SMSParsedResult((String)object, null, null, string2);
        return object2;
    }
}

