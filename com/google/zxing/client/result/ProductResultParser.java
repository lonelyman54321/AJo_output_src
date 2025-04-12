/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.client.result.ProductParsedResult;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.oned.UPCEReader;

public final class ProductResultParser
extends ResultParser {
    public ProductParsedResult parse(Result object) {
        int n3;
        Object object2;
        Object object3 = ((Result)object).getBarcodeFormat();
        if (object3 != (object2 = BarcodeFormat.UPC_A) && object3 != (object2 = BarcodeFormat.UPC_E) && object3 != (object2 = BarcodeFormat.EAN_8) && object3 != (object2 = BarcodeFormat.EAN_13)) {
            return null;
        }
        object = ResultParser.getMassagedText((Result)object);
        int n4 = ((String)object).length();
        if ((n4 = (int)(ResultParser.isStringOfDigits((CharSequence)object, n4) ? 1 : 0)) == 0) {
            return null;
        }
        object2 = BarcodeFormat.UPC_E;
        object3 = object3 == object2 && (n3 = ((String)object).length()) == (n4 = 8) ? UPCEReader.convertUPCEtoUPCA((String)object) : object;
        object2 = new ProductParsedResult((String)object, (String)object3);
        return object2;
    }
}

