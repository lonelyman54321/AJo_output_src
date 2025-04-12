/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.client.result.ISBNParsedResult;
import com.google.zxing.client.result.ResultParser;

public final class ISBNResultParser
extends ResultParser {
    public ISBNParsedResult parse(Result object) {
        int n3;
        BarcodeFormat barcodeFormat;
        Object object2 = ((Result)object).getBarcodeFormat();
        if (object2 != (barcodeFormat = BarcodeFormat.EAN_13)) {
            return null;
        }
        int n4 = ((String)(object = ResultParser.getMassagedText((Result)object))).length();
        if (n4 != (n3 = 13)) {
            return null;
        }
        object2 = "978";
        n4 = (int)(((String)object).startsWith((String)object2) ? 1 : 0);
        if (n4 == 0 && (n4 = (int)(((String)object).startsWith((String)(object2 = "979")) ? 1 : 0)) == 0) {
            return null;
        }
        object2 = new ISBNParsedResult((String)object);
        return object2;
    }
}

