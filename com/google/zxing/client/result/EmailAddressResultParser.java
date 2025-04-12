/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.EmailAddressParsedResult;
import com.google.zxing.client.result.EmailDoCoMoResultParser;
import com.google.zxing.client.result.ResultParser;
import java.util.regex.Pattern;

public final class EmailAddressResultParser
extends ResultParser {
    private static final Pattern COMMA = Pattern.compile(",");

    public EmailAddressParsedResult parse(Result object) {
        Object object2;
        String[] stringArray;
        String[] stringArray2;
        String[] stringArray3;
        Object object3;
        Object object4;
        String[] stringArray4;
        Object object5;
        boolean bl2;
        object = ResultParser.getMassagedText((Result)object);
        Object object6 = "mailto:";
        boolean n3 = ((String)object).startsWith((String)object6);
        String[] stringArray5 = null;
        if (!n3 && !(bl2 = ((String)object).startsWith((String)(object6 = "MAILTO:")))) {
            boolean bl3 = EmailDoCoMoResultParser.isBasicallyValidEmailAddress((String)object);
            if (!bl3) {
                return null;
            }
            object6 = new EmailAddressParsedResult((String)object);
            return object6;
        }
        int n4 = 7;
        object6 = ((String)object).substring(n4);
        int n7 = object6.indexOf(63);
        if (n7 >= 0) {
            object5 = null;
            object6 = object6.substring(0, n7);
        }
        try {
            object6 = ResultParser.urlDecode((String)object6);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
        n7 = (int)(object6.isEmpty() ? 1 : 0);
        if (n7 == 0) {
            stringArray4 = COMMA;
            object6 = stringArray4.split((CharSequence)object6);
        } else {
            boolean bl4 = false;
            object6 = null;
        }
        object = ResultParser.parseNameValuePairs((String)object);
        if (object != null) {
            if (object6 == null && (stringArray4 = (String)object.get("to")) != null) {
                object6 = COMMA.split((CharSequence)stringArray4);
            }
            if ((stringArray4 = (String)object.get("cc")) != null) {
                object5 = COMMA;
                stringArray4 = ((Pattern)object5).split((CharSequence)stringArray4);
            } else {
                n7 = 0;
                stringArray4 = null;
            }
            object5 = (String)object.get("bcc");
            if (object5 != null) {
                stringArray5 = COMMA.split((CharSequence)object5);
            }
            object5 = (String)object.get("subject");
            object4 = "body";
            object3 = object = (String)object.get(object4);
            stringArray3 = object6;
            stringArray2 = stringArray5;
            stringArray = stringArray4;
            object2 = object5;
        } else {
            stringArray3 = object6;
            stringArray = null;
            stringArray2 = null;
            object2 = null;
            object3 = null;
        }
        object4 = object;
        object = new EmailAddressParsedResult(stringArray3, stringArray, stringArray2, (String)object2, (String)object3);
        return object;
    }
}

