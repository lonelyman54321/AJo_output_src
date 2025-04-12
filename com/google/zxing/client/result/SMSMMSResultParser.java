/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.client.result.SMSParsedResult;
import java.util.ArrayList;
import java.util.Collection;

public final class SMSMMSResultParser
extends ResultParser {
    private static void addNumberVia(Collection object, Collection collection, String string2) {
        int n3 = string2.indexOf(59);
        String string3 = null;
        if (n3 < 0) {
            object.add(string2);
            collection.add(null);
            return;
        }
        String string4 = string2.substring(0, n3);
        object.add(string4);
        object = string2.substring(++n3);
        string2 = "via=";
        boolean n4 = ((String)object).startsWith(string2);
        if (n4) {
            int n7 = 4;
            string3 = ((String)object).substring(n7);
        }
        collection.add(string3);
    }

    public SMSParsedResult parse(Result object) {
        String[] stringArray;
        int n3;
        String[] stringArray2;
        boolean bl2;
        object = ResultParser.getMassagedText((Result)object);
        String[] stringArray3 = "sms:";
        boolean bl3 = ((String)object).startsWith((String)stringArray3);
        String string2 = null;
        if (!(bl3 || (bl3 = ((String)object).startsWith((String)(stringArray3 = "SMS:"))) || (bl3 = ((String)object).startsWith((String)(stringArray3 = "mms:"))) || (bl3 = ((String)object).startsWith((String)(stringArray3 = "MMS:"))))) {
            return null;
        }
        stringArray3 = ResultParser.parseNameValuePairs((String)object);
        int n4 = 1;
        if (stringArray3 != null && !(bl2 = stringArray3.isEmpty())) {
            string2 = (String)stringArray3.get("subject");
            stringArray2 = stringArray3 = (String)stringArray3.get("body");
            bl3 = true;
        } else {
            bl3 = false;
            stringArray3 = null;
            bl2 = false;
            stringArray2 = null;
        }
        int n7 = 4;
        int n8 = ((String)object).indexOf(63, n7);
        object = n8 >= 0 && bl3 ? ((String)object).substring(n7, n8) : ((String)object).substring(n7);
        stringArray3 = new ArrayList(n4);
        ArrayList arrayList = new ArrayList(n4);
        n4 = -1;
        while ((n3 = ((String)object).indexOf(44, n7 = n4 + 1)) > n4) {
            stringArray = ((String)object).substring(n7, n3);
            SMSMMSResultParser.addNumberVia(stringArray3, arrayList, (String)stringArray);
            n4 = n3;
        }
        object = ((String)object).substring(n7);
        SMSMMSResultParser.addNumberVia(stringArray3, arrayList, (String)object);
        stringArray = new String[stringArray3.size()];
        stringArray3 = stringArray3.toArray(stringArray);
        stringArray = new String[arrayList.size()];
        stringArray = arrayList.toArray(stringArray);
        object = new SMSParsedResult(stringArray3, stringArray, string2, (String)stringArray2);
        return object;
    }
}

