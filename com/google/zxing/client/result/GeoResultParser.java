/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.GeoParsedResult;
import com.google.zxing.client.result.ResultParser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GeoResultParser
extends ResultParser {
    private static final Pattern GEO_URL_PATTERN = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    public GeoParsedResult parse(Result object) {
        double d2;
        object = ResultParser.getMassagedText((Result)object);
        Object object2 = GEO_URL_PATTERN;
        int n3 = (int)(((Matcher)(object = ((Pattern)object2).matcher((CharSequence)object))).matches() ? 1 : 0);
        if (n3 == 0) {
            return null;
        }
        String string2 = ((Matcher)object).group(4);
        n3 = 1;
        try {
            object2 = ((Matcher)object).group(n3);
        }
        catch (NumberFormatException numberFormatException) {}
        double d5 = Double.parseDouble((String)object2);
        double d7 = 90.0;
        n3 = (int)(d5 == d7 ? 0 : (d5 > d7 ? 1 : -1));
        if (n3 <= 0 && (n3 = (int)((d2 = d5 - (d7 = -90.0)) == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1))) >= 0) {
            double d9;
            n3 = 2;
            object2 = ((Matcher)object).group(n3);
            d7 = Double.parseDouble((String)object2);
            double d12 = 180.0;
            n3 = (int)(d7 == d12 ? 0 : (d7 > d12 ? 1 : -1));
            if (n3 <= 0 && (n3 = (int)((d9 = d7 - (d12 = -180.0)) == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1))) >= 0) {
                Object object3;
                block12: {
                    n3 = 3;
                    object3 = ((Matcher)object).group(n3);
                    d12 = 0.0;
                    if (object3 == null) break block12;
                    object = ((Matcher)object).group(n3);
                    double d13 = Double.parseDouble((String)object);
                    double d14 = d13 == d12 ? 0 : (d13 < d12 ? -1 : 1);
                    if (d14 < 0) {
                        return null;
                    }
                    d12 = d13;
                }
                object3 = object;
                object = new GeoParsedResult(d5, d7, d12, string2);
                return object;
            }
        }
        return null;
    }
}

