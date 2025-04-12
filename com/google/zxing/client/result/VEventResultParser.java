/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.CalendarParsedResult;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.client.result.VCardResultParser;
import java.util.List;

public final class VEventResultParser
extends ResultParser {
    private static String matchSingleVCardPrefixedField(CharSequence object, String string2, boolean bl2) {
        boolean bl3;
        if ((object = VCardResultParser.matchSingleVCardPrefixedField((CharSequence)object, string2, bl2, false)) != null && !(bl3 = object.isEmpty())) {
            return (String)object.get(0);
        }
        return null;
    }

    private static String[] matchVCardPrefixedField(CharSequence object, String string2, boolean bl2) {
        int n3;
        if ((object = VCardResultParser.matchVCardPrefixedField((CharSequence)object, string2, bl2, false)) != null && (n3 = object.isEmpty()) == 0) {
            n3 = object.size();
            String[] stringArray = new String[n3];
            for (int i3 = 0; i3 < n3; ++i3) {
                String string3;
                stringArray[i3] = string3 = (String)((List)object.get(i3)).get(0);
            }
            return stringArray;
        }
        return null;
    }

    private static String stripMailto(String string2) {
        String string3;
        int n3;
        if (string2 != null && ((n3 = string2.startsWith(string3 = "mailto:")) != 0 || (n3 = (int)(string2.startsWith(string3 = "MAILTO:") ? 1 : 0)) != 0)) {
            n3 = 7;
            string2 = string2.substring(n3);
        }
        return string2;
    }

    public CalendarParsedResult parse(Result result2) {
        double d2;
        double d5;
        String string2;
        int n3;
        Object object;
        String string3;
        Object object2 = ResultParser.getMassagedText(result2);
        int n4 = ((String)object2).indexOf(string3 = "BEGIN:VEVENT");
        if (n4 < 0) {
            return null;
        }
        int n7 = 1;
        String string4 = VEventResultParser.matchSingleVCardPrefixedField("SUMMARY", (String)object2, n7 != 0);
        string3 = "DTSTART";
        String string5 = VEventResultParser.matchSingleVCardPrefixedField(string3, (String)object2, n7 != 0);
        if (string5 == null) {
            return null;
        }
        String string6 = VEventResultParser.matchSingleVCardPrefixedField("DTEND", (String)object2, n7 != 0);
        String string7 = VEventResultParser.matchSingleVCardPrefixedField("DURATION", (String)object2, n7 != 0);
        String string8 = VEventResultParser.matchSingleVCardPrefixedField("LOCATION", (String)object2, n7 != 0);
        String string9 = VEventResultParser.stripMailto(VEventResultParser.matchSingleVCardPrefixedField("ORGANIZER", (String)object2, n7 != 0));
        String[] stringArray = VEventResultParser.matchVCardPrefixedField("ATTENDEE", (String)object2, n7 != 0);
        n4 = 0;
        string3 = null;
        if (stringArray != null) {
            int n8;
            object = null;
            for (n3 = 0; n3 < (n8 = stringArray.length); ++n3) {
                stringArray[n3] = string2 = VEventResultParser.stripMailto(stringArray[n3]);
            }
        }
        string2 = VEventResultParser.matchSingleVCardPrefixedField("DESCRIPTION", (String)object2, n7 != 0);
        object = "GEO";
        if ((object2 = VEventResultParser.matchSingleVCardPrefixedField((CharSequence)object, (String)object2, n7 != 0)) == null) {
            double d7;
            d5 = d7 = 0.0 / 0.0;
            d2 = d7;
        } else {
            double d9;
            n3 = ((String)object2).indexOf(59);
            if (n3 < 0) {
                return null;
            }
            string3 = ((String)object2).substring(0, n3);
            d5 = Double.parseDouble(string3);
            n3 += n7;
            object2 = ((String)object2).substring(n3);
            d2 = d9 = Double.parseDouble((String)object2);
        }
        object = object2;
        try {
            object2 = new CalendarParsedResult(string4, string5, string6, string7, string8, string9, stringArray, string2, d5, d2);
            return object2;
        }
        catch (IllegalArgumentException | NumberFormatException illegalArgumentException) {
            return null;
        }
    }
}

