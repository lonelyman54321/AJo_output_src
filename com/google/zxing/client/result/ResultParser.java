/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.AddressBookAUResultParser;
import com.google.zxing.client.result.AddressBookDoCoMoResultParser;
import com.google.zxing.client.result.BizcardResultParser;
import com.google.zxing.client.result.BookmarkDoCoMoResultParser;
import com.google.zxing.client.result.EmailAddressResultParser;
import com.google.zxing.client.result.EmailDoCoMoResultParser;
import com.google.zxing.client.result.ExpandedProductResultParser;
import com.google.zxing.client.result.GeoResultParser;
import com.google.zxing.client.result.ISBNResultParser;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ProductResultParser;
import com.google.zxing.client.result.SMSMMSResultParser;
import com.google.zxing.client.result.SMSTOMMSTOResultParser;
import com.google.zxing.client.result.SMTPResultParser;
import com.google.zxing.client.result.TelResultParser;
import com.google.zxing.client.result.TextParsedResult;
import com.google.zxing.client.result.URIResultParser;
import com.google.zxing.client.result.URLTOResultParser;
import com.google.zxing.client.result.VCardResultParser;
import com.google.zxing.client.result.VEventResultParser;
import com.google.zxing.client.result.VINResultParser;
import com.google.zxing.client.result.WifiResultParser;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ResultParser {
    private static final Pattern AMPERSAND;
    private static final String BYTE_ORDER_MARK = "\ufeff";
    private static final Pattern DIGITS;
    private static final Pattern EQUALS;
    private static final ResultParser[] PARSERS;

    static {
        BookmarkDoCoMoResultParser bookmarkDoCoMoResultParser = new BookmarkDoCoMoResultParser();
        AddressBookDoCoMoResultParser addressBookDoCoMoResultParser = new AddressBookDoCoMoResultParser();
        EmailDoCoMoResultParser emailDoCoMoResultParser = new EmailDoCoMoResultParser();
        AddressBookAUResultParser addressBookAUResultParser = new AddressBookAUResultParser();
        VCardResultParser vCardResultParser = new VCardResultParser();
        BizcardResultParser bizcardResultParser = new BizcardResultParser();
        VEventResultParser vEventResultParser = new VEventResultParser();
        EmailAddressResultParser emailAddressResultParser = new EmailAddressResultParser();
        SMTPResultParser sMTPResultParser = new SMTPResultParser();
        TelResultParser telResultParser = new TelResultParser();
        SMSMMSResultParser sMSMMSResultParser = new SMSMMSResultParser();
        SMSTOMMSTOResultParser sMSTOMMSTOResultParser = new SMSTOMMSTOResultParser();
        GeoResultParser geoResultParser = new GeoResultParser();
        WifiResultParser wifiResultParser = new WifiResultParser();
        URLTOResultParser uRLTOResultParser = new URLTOResultParser();
        ResultParser[] resultParserArray = new URIResultParser();
        ISBNResultParser iSBNResultParser = new ISBNResultParser();
        ProductResultParser productResultParser = new ProductResultParser();
        ExpandedProductResultParser expandedProductResultParser = new ExpandedProductResultParser();
        VINResultParser vINResultParser = new VINResultParser();
        ResultParser[] resultParserArray2 = resultParserArray;
        resultParserArray = new ResultParser[]{bookmarkDoCoMoResultParser, addressBookDoCoMoResultParser, emailDoCoMoResultParser, addressBookAUResultParser, vCardResultParser, bizcardResultParser, vEventResultParser, emailAddressResultParser, sMTPResultParser, telResultParser, sMSMMSResultParser, sMSTOMMSTOResultParser, geoResultParser, wifiResultParser, uRLTOResultParser, resultParserArray2, iSBNResultParser, productResultParser, expandedProductResultParser, vINResultParser};
        PARSERS = resultParserArray;
        DIGITS = Pattern.compile("\\d+");
        AMPERSAND = Pattern.compile("&");
        EQUALS = Pattern.compile("=");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void appendKeyValue(CharSequence object, Map map2) {
        Object object2 = EQUALS;
        int n3 = 2;
        String[] stringArray = ((Pattern)object2).split((CharSequence)object, n3);
        int n4 = stringArray.length;
        if (n4 != n3) return;
        n4 = 0;
        object2 = stringArray[0];
        n3 = 1;
        String string2 = stringArray[n3];
        try {
            void var1_4;
            String string3 = ResultParser.urlDecode(string2);
            var1_4.put(object2, string3);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    private static int countPrecedingBackslashes(CharSequence charSequence, int n3) {
        char c2;
        char c3;
        n3 += -1;
        int n4 = 0;
        while (n3 >= 0 && (c3 = charSequence.charAt(n3)) == (c2 = '\\')) {
            ++n4;
            n3 += -1;
        }
        return n4;
    }

    public static String getMassagedText(Result object) {
        String string2;
        int n3 = (int)(((String)(object = ((Result)object).getText())).startsWith(string2 = BYTE_ORDER_MARK) ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
            object = ((String)object).substring(n3);
        }
        return object;
    }

    public static boolean isStringOfDigits(CharSequence object, int n3) {
        Pattern pattern;
        boolean bl2;
        int n4;
        return object != null && n3 > 0 && n3 == (n4 = object.length()) && (bl2 = ((Matcher)(object = (pattern = DIGITS).matcher((CharSequence)object))).matches());
    }

    public static boolean isSubstringOfDigits(CharSequence object, int n3, int n4) {
        int n7;
        if (object != null && n4 > 0 && (n7 = object.length()) >= (n4 += n3)) {
            Pattern pattern = DIGITS;
            object = object.subSequence(n3, n4);
            boolean bl2 = ((Matcher)(object = pattern.matcher((CharSequence)object))).matches();
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String[] matchPrefixedField(String stringArray, String string2, char c2, boolean bl2) {
        int n3 = string2.length();
        int n4 = 0;
        List list = null;
        int n7 = 0;
        Object object = null;
        while (true) {
            Object object2;
            int n8;
            if (n7 < n3 && (n7 = string2.indexOf((String)stringArray, n7)) >= 0) {
                n8 = stringArray.length() + n7;
                n7 = 1;
                object2 = list;
                n4 = n8;
            } else {
                if (list == null) return null;
                boolean bl3 = list.isEmpty();
                if (bl3) {
                    return null;
                }
                stringArray = new String[list.size()];
                return list.toArray(stringArray);
            }
            while (n7 != 0) {
                if ((n4 = string2.indexOf(c2, n4)) < 0) {
                    n4 = string2.length();
                } else {
                    int n10 = ResultParser.countPrecedingBackslashes(string2, n4) % 2;
                    if (n10 != 0) {
                        ++n4;
                        continue;
                    }
                    if (object2 == null) {
                        int n14 = 3;
                        object2 = object = new ArrayList(n14);
                    }
                    object = ResultParser.unescapeBackslash(string2.substring(n8, n4));
                    if (bl2) {
                        object = ((String)object).trim();
                    }
                    if ((n10 = (int)(((String)object).isEmpty() ? 1 : 0)) == 0) {
                        object2.add(object);
                    }
                    ++n4;
                }
                n7 = 0;
                object = null;
            }
            n7 = n4;
            list = object2;
        }
    }

    public static String matchSinglePrefixedField(String stringArray, String string2, char c2, boolean bl2) {
        if ((stringArray = ResultParser.matchPrefixedField((String)stringArray, string2, c2, bl2)) == null) {
            return null;
        }
        return stringArray[0];
    }

    public static void maybeAppend(String string2, StringBuilder stringBuilder) {
        if (string2 != null) {
            char c2 = '\n';
            stringBuilder.append(c2);
            stringBuilder.append(string2);
        }
    }

    public static void maybeAppend(String[] stringArray, StringBuilder stringBuilder) {
        if (stringArray != null) {
            for (String string2 : stringArray) {
                char c2 = '\n';
                stringBuilder.append(c2);
                stringBuilder.append(string2);
            }
        }
    }

    public static String[] maybeWrap(String string2) {
        if (string2 == null) {
            return null;
        }
        return new String[]{string2};
    }

    public static int parseHexDigit(char n3) {
        int n4;
        int n7 = 48;
        if (n3 >= n7 && n3 <= (n4 = 57)) {
            return n3 - n7;
        }
        n7 = 97;
        if (n3 >= n7 && n3 <= (n7 = 102)) {
            return n3 + -87;
        }
        n7 = 65;
        if (n3 >= n7 && n3 <= (n7 = 70)) {
            return n3 + -55;
        }
        return -1;
    }

    public static Map parseNameValuePairs(String stringArray) {
        int n3 = stringArray.indexOf(63);
        if (n3 < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        Pattern pattern = AMPERSAND;
        stringArray = stringArray.substring(++n3);
        stringArray = pattern.split((CharSequence)stringArray);
        n3 = stringArray.length;
        pattern = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = stringArray[i3];
            ResultParser.appendKeyValue(string2, hashMap);
        }
        return hashMap;
    }

    public static ParsedResult parseResult(Result object) {
        Object object2 = PARSERS;
        int n3 = ((ResultParser[])object2).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            ParsedResult parsedResult = object2[i3].parse((Result)object);
            if (parsedResult == null) continue;
            return parsedResult;
        }
        object = ((Result)object).getText();
        object2 = new TextParsedResult((String)object, null);
        return object2;
    }

    public static String unescapeBackslash(String string2) {
        char c2 = '\\';
        int n3 = string2.indexOf(c2);
        if (n3 < 0) {
            return string2;
        }
        int n4 = string2.length();
        int n7 = n4 + -1;
        StringBuilder stringBuilder = new StringBuilder(n7);
        char[] cArray = string2.toCharArray();
        stringBuilder.append(cArray, 0, n3);
        n7 = 0;
        cArray = null;
        while (n3 < n4) {
            char c3 = string2.charAt(n3);
            if (n7 == 0 && c3 == c2) {
                n7 = 1;
            } else {
                stringBuilder.append(c3);
                n7 = 0;
                cArray = null;
            }
            ++n3;
        }
        return stringBuilder.toString();
    }

    public static String urlDecode(String string2) {
        Object object = "UTF-8";
        try {
            return URLDecoder.decode(string2, (String)object);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object = new IllegalStateException(unsupportedEncodingException);
            throw object;
        }
    }

    public abstract ParsedResult parse(Result var1);
}

