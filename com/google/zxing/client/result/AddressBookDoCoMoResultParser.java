/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.AbstractDoCoMoResultParser;
import com.google.zxing.client.result.AddressBookParsedResult;
import com.google.zxing.client.result.ResultParser;

public final class AddressBookDoCoMoResultParser
extends AbstractDoCoMoResultParser {
    private static String parseName(String string2) {
        int n3 = string2.indexOf(44);
        if (n3 >= 0) {
            StringBuilder stringBuilder = new StringBuilder();
            int n4 = n3 + 1;
            String string3 = string2.substring(n4);
            stringBuilder.append(string3);
            stringBuilder.append(' ');
            n4 = 0;
            string3 = null;
            string2 = string2.substring(0, n3);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public AddressBookParsedResult parse(Result result2) {
        Object object;
        Object object2 = ResultParser.getMassagedText(result2);
        boolean bl2 = ((String)object2).startsWith((String)(object = "MECARD:"));
        if (!bl2) {
            return null;
        }
        boolean bl3 = true;
        object = AbstractDoCoMoResultParser.matchDoCoMoPrefixedField("N:", (String)object2, bl3);
        if (object == null) {
            return null;
        }
        object = AddressBookDoCoMoResultParser.parseName(object[0]);
        String string2 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("SOUND:", (String)object2, bl3);
        String[] stringArray = AbstractDoCoMoResultParser.matchDoCoMoPrefixedField("TEL:", (String)object2, bl3);
        String[] stringArray2 = AbstractDoCoMoResultParser.matchDoCoMoPrefixedField("EMAIL:", (String)object2, bl3);
        String string3 = "NOTE:";
        String string4 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField(string3, (String)object2, false);
        String[] stringArray3 = AbstractDoCoMoResultParser.matchDoCoMoPrefixedField("ADR:", (String)object2, bl3);
        String string5 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("BDAY:", (String)object2, bl3);
        boolean bl4 = ResultParser.isStringOfDigits(string5, 8);
        String string6 = !bl4 ? null : string5;
        String[] stringArray4 = AbstractDoCoMoResultParser.matchDoCoMoPrefixedField("URL:", (String)object2, bl3);
        String string7 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("ORG:", (String)object2, bl3);
        String[] stringArray5 = ResultParser.maybeWrap((String)object);
        object2 = new AddressBookParsedResult(stringArray5, null, string2, stringArray, null, stringArray2, null, null, string4, stringArray3, null, string7, string6, null, stringArray4, null);
        return object2;
    }
}

