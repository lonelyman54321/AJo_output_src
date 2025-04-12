/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import com.google.zxing.client.result.ResultParser;
import java.util.regex.Pattern;

public final class URIParsedResult
extends ParsedResult {
    private static final Pattern USER_IN_HOST = Pattern.compile(":/*([^/@]+)@[^/]+");
    private final String title;
    private final String uri;

    public URIParsedResult(String string2, String string3) {
        ParsedResultType parsedResultType = ParsedResultType.URI;
        super(parsedResultType);
        this.uri = string2 = URIParsedResult.massageURI(string2);
        this.title = string3;
    }

    private static boolean isColonFollowedByPortNumber(String string2, int n3) {
        int n4;
        if ((n4 = string2.indexOf(47, ++n3)) < 0) {
            n4 = string2.length();
        }
        return ResultParser.isSubstringOfDigits(string2, n3, n4 -= n3);
    }

    private static String massageURI(String string2) {
        int n3 = (string2 = string2.trim()).indexOf(58);
        if (n3 < 0 || (n3 = (int)(URIParsedResult.isColonFollowedByPortNumber(string2, n3) ? 1 : 0)) != 0) {
            String string3 = "http://";
            string2 = string3.concat(string2);
        }
        return string2;
    }

    public String getDisplayResult() {
        StringBuilder stringBuilder = new StringBuilder(30);
        ParsedResult.maybeAppend(this.title, stringBuilder);
        ParsedResult.maybeAppend(this.uri, stringBuilder);
        return stringBuilder.toString();
    }

    public String getTitle() {
        return this.title;
    }

    public String getURI() {
        return this.uri;
    }

    public boolean isPossiblyMaliciousURI() {
        Pattern pattern = USER_IN_HOST;
        String string2 = this.uri;
        return pattern.matcher(string2).find();
    }
}

