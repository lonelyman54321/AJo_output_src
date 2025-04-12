/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.AddressBookParsedResult;
import com.google.zxing.client.result.ResultParser;
import java.util.ArrayList;

public final class AddressBookAUResultParser
extends ResultParser {
    private static String[] matchMultipleValuePrefix(String stringArray, int n3, String string2, boolean bl2) {
        ArrayList<StringBuilder> arrayList = null;
        for (int i3 = 1; i3 <= n3; ++i3) {
            CharSequence charSequence = new StringBuilder();
            charSequence.append((String)stringArray);
            charSequence.append(i3);
            charSequence.append(':');
            charSequence = charSequence.toString();
            char c2 = '\r';
            charSequence = ResultParser.matchSinglePrefixedField((String)charSequence, string2, c2, bl2);
            if (charSequence == null) break;
            if (arrayList == null) {
                arrayList = new ArrayList<StringBuilder>(n3);
            }
            arrayList.add((StringBuilder)charSequence);
        }
        if (arrayList == null) {
            return null;
        }
        stringArray = new String[arrayList.size()];
        return arrayList.toArray(stringArray);
    }

    public AddressBookParsedResult parse(Result result2) {
        Object object = ResultParser.getMassagedText(result2);
        String string2 = "MEMORY";
        boolean bl2 = ((String)object).contains(string2);
        String[] stringArray = null;
        if (bl2 && (bl2 = ((String)object).contains(string2 = "\r\n"))) {
            char c2 = '\r';
            int n3 = 1;
            string2 = ResultParser.matchSinglePrefixedField("NAME1:", (String)object, c2, n3 != 0);
            String string3 = ResultParser.matchSinglePrefixedField("NAME2:", (String)object, c2, n3 != 0);
            int n4 = 3;
            String[] stringArray2 = AddressBookAUResultParser.matchMultipleValuePrefix("TEL", n4, (String)object, n3 != 0);
            String[] stringArray3 = AddressBookAUResultParser.matchMultipleValuePrefix("MAIL", n4, (String)object, n3 != 0);
            n4 = 0;
            String string4 = ResultParser.matchSinglePrefixedField("MEMORY:", (String)object, c2, false);
            String string5 = "ADD:";
            if ((object = ResultParser.matchSinglePrefixedField(string5, (String)object, c2, n3 != 0)) != null) {
                stringArray = new String[n3];
                stringArray[0] = object;
            }
            String[] stringArray4 = ResultParser.maybeWrap(string2);
            object = new AddressBookParsedResult(stringArray4, null, string3, stringArray2, null, stringArray3, null, null, string4, stringArray, null, null, null, null, null, null);
            return object;
        }
        return null;
    }
}

