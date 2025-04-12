/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.AbstractDoCoMoResultParser;
import com.google.zxing.client.result.URIParsedResult;
import com.google.zxing.client.result.URIResultParser;

public final class BookmarkDoCoMoResultParser
extends AbstractDoCoMoResultParser {
    public URIParsedResult parse(Result object) {
        object = object.getText();
        String string2 = "MEBKM:";
        boolean bl2 = object.startsWith(string2);
        URIParsedResult uRIParsedResult = null;
        if (!bl2) {
            return null;
        }
        boolean bl3 = true;
        string2 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("TITLE:", (String)object, bl3);
        String string3 = "URL:";
        if ((object = AbstractDoCoMoResultParser.matchDoCoMoPrefixedField(string3, (String)object, bl3)) == null) {
            return null;
        }
        bl3 = URIResultParser.isBasicallyValidURI((String)(object = object[0]));
        if (bl3) {
            uRIParsedResult = new URIParsedResult((String)object, string2);
        }
        return uRIParsedResult;
    }
}

