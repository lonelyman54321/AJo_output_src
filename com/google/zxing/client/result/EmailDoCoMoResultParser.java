/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.AbstractDoCoMoResultParser;
import com.google.zxing.client.result.EmailAddressParsedResult;
import com.google.zxing.client.result.ResultParser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class EmailDoCoMoResultParser
extends AbstractDoCoMoResultParser {
    private static final Pattern ATEXT_ALPHANUMERIC = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    public static boolean isBasicallyValidEmailAddress(String string2) {
        int n3;
        Matcher matcher;
        int n4;
        return string2 != null && (n4 = (matcher = ATEXT_ALPHANUMERIC.matcher(string2)).matches()) != 0 && (n3 = string2.indexOf(n4 = 64)) >= 0;
    }

    public EmailAddressParsedResult parse(Result object) {
        String string2;
        boolean n3 = ((String)(object = ResultParser.getMassagedText((Result)object))).startsWith(string2 = "MATMSG:");
        if (!n3) {
            return null;
        }
        string2 = "TO:";
        boolean bl2 = true;
        String[] stringArray = AbstractDoCoMoResultParser.matchDoCoMoPrefixedField(string2, (String)object, bl2);
        if (stringArray == null) {
            return null;
        }
        int n4 = stringArray.length;
        bl2 = false;
        for (int i3 = 0; i3 < n4; ++i3) {
            String string3 = stringArray[i3];
            boolean bl3 = EmailDoCoMoResultParser.isBasicallyValidEmailAddress(string3);
            if (bl3) continue;
            return null;
        }
        String string4 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("SUB:", (String)object, false);
        String string5 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("BODY:", (String)object, false);
        object = new EmailAddressParsedResult(stringArray, null, null, string4, string5);
        return object;
    }
}

