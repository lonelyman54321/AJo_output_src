/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.client.result.URIParsedResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class URIResultParser
extends ResultParser {
    private static final Pattern URL_WITHOUT_PROTOCOL_PATTERN;
    private static final Pattern URL_WITH_PROTOCOL_PATTERN;

    static {
        URL_WITH_PROTOCOL_PATTERN = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");
        URL_WITHOUT_PROTOCOL_PATTERN = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");
    }

    public static boolean isBasicallyValidURI(String object) {
        int n3;
        int n4;
        Object object2 = " ";
        boolean n42 = ((String)object).contains((CharSequence)object2);
        if (n42) {
            return false;
        }
        object2 = URL_WITH_PROTOCOL_PATTERN.matcher((CharSequence)object);
        boolean bl2 = ((Matcher)object2).find();
        boolean bl3 = true;
        if (bl2 && (n4 = ((Matcher)object2).start()) == 0) {
            return bl3;
        }
        object2 = URL_WITHOUT_PROTOCOL_PATTERN;
        boolean bl4 = ((Matcher)(object = ((Pattern)object2).matcher((CharSequence)object))).find();
        if (bl4 && (n3 = ((Matcher)object).start()) == 0) {
            return bl3;
        }
        return false;
    }

    public URIParsedResult parse(Result object) {
        Object object2;
        boolean bl2 = ((String)(object = ResultParser.getMassagedText((Result)object))).startsWith((String)(object2 = "URL:"));
        if (!bl2 && !(bl2 = ((String)object).startsWith((String)(object2 = "URI:")))) {
            bl2 = URIResultParser.isBasicallyValidURI((String)(object = ((String)object).trim()));
            if (bl2) {
                object2 = new URIParsedResult((String)object, null);
                return object2;
            }
            return null;
        }
        object = ((String)object).substring(4).trim();
        object2 = new URIParsedResult((String)object, null);
        return object2;
    }
}

