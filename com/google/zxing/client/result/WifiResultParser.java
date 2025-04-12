/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.client.result.WifiParsedResult;

public final class WifiResultParser
extends ResultParser {
    public WifiParsedResult parse(Result object) {
        boolean bl2;
        char c2;
        String string2;
        boolean n3 = ((String)(object = ResultParser.getMassagedText((Result)object))).startsWith(string2 = "WIFI:");
        if (!n3) {
            return null;
        }
        string2 = "S:";
        int n4 = 5;
        String string3 = ResultParser.matchSinglePrefixedField(string2, (String)(object = ((String)object).substring(n4)), c2 = ';', false);
        if (string3 != null && !(bl2 = string3.isEmpty())) {
            String string4 = ResultParser.matchSinglePrefixedField("P:", (String)object, c2, false);
            string2 = ResultParser.matchSinglePrefixedField("T:", (String)object, c2, false);
            if (string2 == null) {
                string2 = "nopass";
            }
            String string5 = string2;
            string2 = "H:";
            boolean bl3 = Boolean.parseBoolean(ResultParser.matchSinglePrefixedField(string2, (String)object, c2, false));
            String string6 = ResultParser.matchSinglePrefixedField("I:", (String)object, c2, false);
            String string7 = ResultParser.matchSinglePrefixedField("A:", (String)object, c2, false);
            String string8 = ResultParser.matchSinglePrefixedField("E:", (String)object, c2, false);
            String string9 = ResultParser.matchSinglePrefixedField(string2, (String)object, c2, false);
            object = new WifiParsedResult(string5, string3, string4, bl3, string6, string7, string8, string9);
            return object;
        }
        return null;
    }
}

