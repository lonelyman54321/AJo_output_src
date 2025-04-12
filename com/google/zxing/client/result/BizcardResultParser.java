/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.AbstractDoCoMoResultParser;
import com.google.zxing.client.result.AddressBookParsedResult;
import com.google.zxing.client.result.ResultParser;
import java.util.ArrayList;

public final class BizcardResultParser
extends AbstractDoCoMoResultParser {
    private static String buildName(String string2, String string3) {
        if (string2 == null) {
            return string3;
        }
        if (string3 == null) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(' ');
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    private static String[] buildPhoneNumbers(String stringArray, String string2, String string3) {
        int n3;
        int n4 = 3;
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        if (stringArray != null) {
            arrayList.add(stringArray);
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
        if (string3 != null) {
            arrayList.add(string3);
        }
        if ((n3 = arrayList.size()) == 0) {
            return null;
        }
        stringArray = new String[n3];
        return arrayList.toArray(stringArray);
    }

    public AddressBookParsedResult parse(Result result2) {
        String string2;
        String string3 = ResultParser.getMassagedText(result2);
        boolean bl2 = string3.startsWith(string2 = "BIZCARD:");
        if (!bl2) {
            return null;
        }
        boolean bl3 = true;
        string2 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("N:", string3, bl3);
        String string4 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("X:", string3, bl3);
        string2 = BizcardResultParser.buildName(string2, string4);
        String string5 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("T:", string3, bl3);
        String string6 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("C:", string3, bl3);
        String[] stringArray = AbstractDoCoMoResultParser.matchDoCoMoPrefixedField("A:", string3, bl3);
        string4 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("B:", string3, bl3);
        String string7 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("M:", string3, bl3);
        String string8 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("F:", string3, bl3);
        string3 = AbstractDoCoMoResultParser.matchSingleDoCoMoPrefixedField("E:", string3, bl3);
        String[] stringArray2 = ResultParser.maybeWrap(string2);
        String[] stringArray3 = BizcardResultParser.buildPhoneNumbers(string4, string7, string8);
        String[] stringArray4 = ResultParser.maybeWrap(string3);
        AddressBookParsedResult addressBookParsedResult = new AddressBookParsedResult(stringArray2, null, null, stringArray3, null, stringArray4, null, null, null, stringArray, null, string6, null, string5, null, null);
        return addressBookParsedResult;
    }
}

