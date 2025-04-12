/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ResultParser;

abstract class AbstractDoCoMoResultParser
extends ResultParser {
    public static String[] matchDoCoMoPrefixedField(String string2, String string3, boolean bl2) {
        return ResultParser.matchPrefixedField(string2, string3, ';', bl2);
    }

    public static String matchSingleDoCoMoPrefixedField(String string2, String string3, boolean bl2) {
        return ResultParser.matchSinglePrefixedField(string2, string3, ';', bl2);
    }
}

