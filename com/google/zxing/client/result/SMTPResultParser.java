/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.EmailAddressParsedResult;
import com.google.zxing.client.result.ResultParser;

public final class SMTPResultParser
extends ResultParser {
    public EmailAddressParsedResult parse(Result object) {
        EmailAddressParsedResult emailAddressParsedResult;
        Object object2;
        Object object3;
        int n3;
        boolean bl2;
        object = ResultParser.getMassagedText((Result)object);
        Object object4 = "smtp:";
        boolean n32 = ((String)object).startsWith((String)object4);
        int n4 = 0;
        Object object5 = null;
        if (!n32 && !(bl2 = ((String)object).startsWith((String)(object4 = "SMTP:")))) {
            return null;
        }
        int n7 = ((String)(object = ((String)object).substring(5))).indexOf(n3 = 58);
        if (n7 >= 0) {
            int n8 = n7 + 1;
            String string2 = ((String)object).substring(n8);
            object3 = null;
            object = ((String)object).substring(0, n7);
            int n10 = string2.indexOf(n3);
            if (n10 >= 0) {
                n4 = n10 + 1;
                object5 = string2.substring(n4);
                object3 = object4 = string2.substring(0, n10);
                object2 = object5;
            } else {
                object2 = null;
                object3 = string2;
            }
        } else {
            object3 = null;
            object2 = null;
        }
        object5 = new String[]{object};
        object4 = emailAddressParsedResult;
        emailAddressParsedResult = new EmailAddressParsedResult((String[])object5, null, null, (String)object3, (String)object2);
        return emailAddressParsedResult;
    }
}

