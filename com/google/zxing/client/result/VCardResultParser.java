/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.google.zxing.client.result.AddressBookParsedResult;
import com.google.zxing.client.result.ResultParser;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class VCardResultParser
extends ResultParser {
    private static final Pattern BEGIN_VCARD = Pattern.compile("BEGIN:VCARD", 2);
    private static final Pattern COMMA;
    private static final Pattern CR_LF_SPACE_TAB;
    private static final Pattern EQUALS;
    private static final Pattern NEWLINE_ESCAPE;
    private static final Pattern SEMICOLON;
    private static final Pattern SEMICOLON_OR_COMMA;
    private static final Pattern UNESCAPED_SEMICOLONS;
    private static final Pattern VCARD_ESCAPES;
    private static final Pattern VCARD_LIKE_DATE;

    static {
        VCARD_LIKE_DATE = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");
        CR_LF_SPACE_TAB = Pattern.compile("\r\n[ \t]");
        NEWLINE_ESCAPE = Pattern.compile("\\\\[nN]");
        VCARD_ESCAPES = Pattern.compile("\\\\([,;\\\\])");
        EQUALS = Pattern.compile("=");
        SEMICOLON = Pattern.compile(";");
        UNESCAPED_SEMICOLONS = Pattern.compile("(?<!\\\\);+");
        COMMA = Pattern.compile(",");
        SEMICOLON_OR_COMMA = Pattern.compile("[;,]");
    }

    private static String decodeQuotedPrintable(CharSequence charSequence, String string2) {
        int n3 = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            int n7;
            int n8 = charSequence.charAt(i3);
            if (n8 == (n7 = 10) || n8 == (n4 = 13)) continue;
            int n10 = 61;
            if (n8 != n10) {
                VCardResultParser.maybeAppendFragment(byteArrayOutputStream, string2, stringBuilder);
                stringBuilder.append((char)n8);
                continue;
            }
            n8 = n3 + -2;
            if (i3 >= n8) continue;
            n8 = i3 + 1;
            if ((n8 = (int)charSequence.charAt(n8)) == n4 || n8 == n7) continue;
            n7 = charSequence.charAt(i3 += 2);
            n8 = ResultParser.parseHexDigit((char)n8);
            n7 = ResultParser.parseHexDigit((char)n7);
            if (n8 < 0 || n7 < 0) continue;
            n8 = (n8 << 4) + n7;
            byteArrayOutputStream.write(n8);
        }
        VCardResultParser.maybeAppendFragment(byteArrayOutputStream, string2, stringBuilder);
        return stringBuilder.toString();
    }

    private static void formatNames(Iterable object) {
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                int n3;
                int n4;
                int n7;
                List list = (List)object.next();
                CharSequence charSequence = (String)list.get(0);
                int n8 = 5;
                String[] stringArray = new String[n8];
                int n10 = 0;
                String string2 = null;
                for (n7 = 0; n7 < (n4 = 4) && (n3 = ((String)charSequence).indexOf(59, n10)) >= 0; ++n7) {
                    stringArray[n7] = string2 = ((String)charSequence).substring(n10, n3);
                    n10 = n3 + 1;
                }
                charSequence = ((String)charSequence).substring(n10);
                stringArray[n7] = charSequence;
                charSequence = new StringBuilder(100);
                VCardResultParser.maybeAppendComponent(stringArray, 3, (StringBuilder)charSequence);
                VCardResultParser.maybeAppendComponent(stringArray, 1, (StringBuilder)charSequence);
                n7 = 2;
                VCardResultParser.maybeAppendComponent(stringArray, n7, (StringBuilder)charSequence);
                VCardResultParser.maybeAppendComponent(stringArray, 0, (StringBuilder)charSequence);
                VCardResultParser.maybeAppendComponent(stringArray, n4, (StringBuilder)charSequence);
                charSequence = ((StringBuilder)charSequence).toString().trim();
                list.set(0, charSequence);
            }
        }
    }

    private static boolean isLikeVCardDate(CharSequence object) {
        Pattern pattern;
        boolean bl2;
        return object == null || (bl2 = ((Matcher)(object = (pattern = VCARD_LIKE_DATE).matcher((CharSequence)object))).matches());
        {
        }
    }

    public static List matchSingleVCardPrefixedField(CharSequence object, String string2, boolean bl2, boolean bl3) {
        boolean bl4;
        if ((object = VCardResultParser.matchVCardPrefixedField((CharSequence)object, string2, bl2, bl3)) != null && !(bl4 = object.isEmpty())) {
            return (List)object.get(0);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List matchVCardPrefixedField(CharSequence var0, String var1_1, boolean var2_2, boolean var3_3) {
        var4_4 = var1_1;
        var5_5 = var1_1.length();
        var6_6 = 0;
        var7_7 = null;
        var8_8 = 0;
        var9_9 = null;
        var10_10 = null;
        block3: while (var8_8 < var5_5) {
            var11_11 = new StringBuilder("(?:^|\n)");
            var11_11.append((Object)var0);
            var12_12 = "(?:;([^:]*))?:";
            var11_11.append(var12_12);
            var11_11 = var11_11.toString();
            var13_13 = 2;
            var11_11 = Pattern.compile((String)var11_11, var13_13).matcher(var4_4);
            if (var8_8 > 0) {
                var8_8 += -1;
            }
            if ((var8_8 = (int)var11_11.find(var8_8)) == 0) break;
            var8_8 = var11_11.end(0);
            var14_14 = 1;
            if ((var11_11 = var11_11.group(var14_14)) != null) {
                var15_15 = VCardResultParser.SEMICOLON;
                var11_11 = var15_15.split((CharSequence)var11_11);
                var16_16 = ((String[])var11_11).length;
                var18_18 = null;
                var19_19 = false;
                var20_20 /* !! */  = null;
                var21_21 /* !! */  = null;
                for (var17_17 = 0; var17_17 < var16_16; ++var17_17) {
                    var22_22 /* !! */  = var11_11[var17_17];
                    if (var18_18 == null) {
                        var18_18 = new ArrayList<String[]>(var14_14);
                    }
                    var18_18.add(var22_22 /* !! */ );
                    var7_7 = VCardResultParser.EQUALS;
                    var22_22 /* !! */  = var7_7.split((CharSequence)var22_22 /* !! */ , var13_13);
                    var6_6 = var22_22 /* !! */ .length;
                    if (var6_6 > var14_14) {
                        var12_12 = var22_22 /* !! */ [0];
                        var22_22 /* !! */  = var22_22 /* !! */ [var14_14];
                        var7_7 = "ENCODING";
                        var6_6 = (int)var7_7.equalsIgnoreCase(var12_12);
                        if (var6_6 != 0 && (var6_6 = (int)(var7_7 = "QUOTED-PRINTABLE").equalsIgnoreCase((String)var22_22 /* !! */ )) != 0) {
                            var19_19 = true;
                        } else {
                            var7_7 = "CHARSET";
                            var6_6 = (int)var7_7.equalsIgnoreCase(var12_12);
                            if (var6_6 != 0) {
                                var20_20 /* !! */  = var22_22 /* !! */ ;
                            } else {
                                var7_7 = "VALUE";
                                var6_6 = (int)var7_7.equalsIgnoreCase(var12_12);
                                if (var6_6 != 0) {
                                    var21_21 /* !! */  = var22_22 /* !! */ ;
                                }
                            }
                        }
                    }
                    var6_6 = 0;
                    var7_7 = null;
                    var13_13 = 2;
                }
            } else {
                var18_18 = null;
                var19_19 = false;
                var20_20 /* !! */  = null;
                var21_21 /* !! */  = null;
            }
            var23_23 = var8_8;
            while ((var23_23 = var4_4.indexOf(var6_6 = 10, var23_23)) >= 0) {
                var6_6 = var1_1.length() - var14_14;
                if (var23_23 < var6_6 && ((var24_24 = var4_4.charAt(var6_6 = var23_23 + 1)) == (var13_13 = 32) || (var6_6 = (int)var4_4.charAt(var6_6)) == (var24_24 = 9))) {
                    var23_23 += 2;
                    continue;
                }
                if (!var19_19) break;
                var6_6 = 61;
                if (var23_23 <= 0) ** GOTO lbl-1000
                var24_24 = var23_23 + -1;
                if ((var24_24 = (int)var4_4.charAt(var24_24)) == var6_6) {
                    var24_24 = 2;
                } else lbl-1000:
                // 2 sources

                {
                    var24_24 = 2;
                    if (var23_23 < var24_24) break;
                    var13_13 = var23_23 + -2;
                    if ((var13_13 = (int)var4_4.charAt(var13_13)) != var6_6) break;
                }
                ++var23_23;
            }
            if (var23_23 < 0) {
                var8_8 = var5_5;
lbl87:
                // 2 sources

                while (true) {
                    var6_6 = 0;
                    var7_7 = null;
                    continue block3;
                    break;
                }
            }
            if (var23_23 > var8_8) {
                if (var10_10 == null) {
                    var7_7 = new ArrayList(var14_14);
                    var10_10 = var7_7;
                }
                if (var23_23 > 0) {
                    var6_6 = var23_23 + -1;
                    if ((var6_6 = (int)var4_4.charAt(var6_6)) == (var24_24 = 13)) {
                        var23_23 += -1;
                    }
                }
                var7_7 = var4_4.substring(var8_8, var23_23);
                if (var2_2) {
                    var7_7 = var7_7.trim();
                }
                var9_9 = "\n";
                if (var19_19) {
                    var7_7 = VCardResultParser.decodeQuotedPrintable((CharSequence)var7_7, var20_20 /* !! */ );
                    if (var3_3) {
                        var11_11 = VCardResultParser.UNESCAPED_SEMICOLONS;
                        var7_7 = var11_11.matcher((CharSequence)var7_7).replaceAll((String)var9_9).trim();
                    }
                } else {
                    if (var3_3) {
                        var11_11 = VCardResultParser.UNESCAPED_SEMICOLONS;
                        var7_7 = var11_11.matcher((CharSequence)var7_7).replaceAll((String)var9_9).trim();
                    }
                    var7_7 = VCardResultParser.CR_LF_SPACE_TAB.matcher((CharSequence)var7_7).replaceAll("");
                    var11_11 = VCardResultParser.NEWLINE_ESCAPE;
                    var7_7 = var11_11.matcher((CharSequence)var7_7).replaceAll((String)var9_9);
                    var7_7 = VCardResultParser.VCARD_ESCAPES.matcher((CharSequence)var7_7);
                    var9_9 = "$1";
                    var7_7 = var7_7.replaceAll((String)var9_9);
                }
                if ((var8_8 = (int)(var9_9 = "uri").equals(var21_21 /* !! */ )) != 0) {
                    try {
                        var9_9 = URI.create((String)var7_7);
                    }
                    catch (IllegalArgumentException v0) {}
                    var7_7 = var9_9.getSchemeSpecificPart();
                }
                if (var18_18 == null) {
                    var9_9 = new ArrayList(var14_14);
                    var9_9.add(var7_7);
                    var10_10.add(var9_9);
                } else {
                    var8_8 = 0;
                    var9_9 = null;
                    var18_18.add(0, (String[])var7_7);
                    var10_10.add(var18_18);
lbl137:
                    // 2 sources

                    while (true) {
                        var8_8 = ++var23_23;
                        ** continue;
                        break;
                    }
                }
            }
            var8_8 = 0;
            var9_9 = null;
            ** continue;
        }
        return var10_10;
    }

    private static void maybeAppendComponent(String[] object, int n3, StringBuilder stringBuilder) {
        int n4;
        String string2 = object[n3];
        if (string2 != null && (n4 = string2.isEmpty()) == 0) {
            n4 = stringBuilder.length();
            if (n4 > 0) {
                n4 = 32;
                stringBuilder.append((char)n4);
            }
            object = object[n3];
            stringBuilder.append((String)object);
        }
    }

    private static void maybeAppendFragment(ByteArrayOutputStream byteArrayOutputStream, String object, StringBuilder stringBuilder) {
        int n3 = byteArrayOutputStream.size();
        if (n3 > 0) {
            byte[] byArray = byteArrayOutputStream.toByteArray();
            if (object == null) {
                Charset charset = StandardCharsets.UTF_8;
                object = new String(byArray, charset);
            } else {
                Object object2;
                try {
                    object = object2 = new String(byArray, (String)object);
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    object2 = StandardCharsets.UTF_8;
                    object = new String(byArray, (Charset)object2);
                }
            }
            byteArrayOutputStream.reset();
            stringBuilder.append((String)object);
        }
    }

    private static String toPrimaryValue(List list) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            return (String)list.get(0);
        }
        return null;
    }

    private static String[] toPrimaryValues(Collection stringArray) {
        boolean bl2;
        if (stringArray != null && !(bl2 = stringArray.isEmpty())) {
            int n3 = stringArray.size();
            ArrayList<Object> arrayList = new ArrayList<Object>(n3);
            stringArray = stringArray.iterator();
            while ((n3 = (int)(stringArray.hasNext() ? 1 : 0)) != 0) {
                Object object = (List)stringArray.next();
                boolean bl3 = false;
                if ((object = (String)object.get(0)) == null || (bl3 = ((String)object).isEmpty())) continue;
                arrayList.add(object);
            }
            stringArray = new String[arrayList.size()];
            return arrayList.toArray(stringArray);
        }
        return null;
    }

    private static String[] toTypes(Collection stringArray) {
        boolean bl2;
        if (stringArray != null && !(bl2 = stringArray.isEmpty())) {
            int n3 = stringArray.size();
            ArrayList<String> arrayList = new ArrayList<String>(n3);
            stringArray = stringArray.iterator();
            while ((n3 = (int)(stringArray.hasNext() ? 1 : 0)) != 0) {
                String string2;
                block4: {
                    int n4;
                    int n7;
                    List list = (List)stringArray.next();
                    String string3 = (String)list.get(0);
                    if (string3 == null || (n7 = string3.isEmpty()) != 0) continue;
                    for (n7 = 1; n7 < (n4 = list.size()); ++n7) {
                        string2 = (String)list.get(n7);
                        int n8 = string2.indexOf(61);
                        if (n8 >= 0) {
                            String string4 = "TYPE";
                            String string5 = string2.substring(0, n8);
                            boolean bl3 = string4.equalsIgnoreCase(string5);
                            if (!bl3) continue;
                            string2 = string2.substring(++n8);
                        }
                        break block4;
                    }
                    n4 = 0;
                    string2 = null;
                }
                arrayList.add(string2);
            }
            stringArray = new String[arrayList.size()];
            return arrayList.toArray(stringArray);
        }
        return null;
    }

    public AddressBookParsedResult parse(Result result2) {
        int n3;
        Object object = ResultParser.getMassagedText(result2);
        Object object2 = BEGIN_VCARD.matcher((CharSequence)object);
        boolean n4 = ((Matcher)object2).find();
        if (n4 && (n3 = ((Matcher)object2).start()) == 0) {
            int n7;
            String[] stringArray;
            boolean bl2;
            Object object3;
            String[] stringArray2;
            String[] stringArray3;
            boolean bl3 = true;
            int n8 = 0;
            object2 = VCardResultParser.matchVCardPrefixedField("FN", (String)object, bl3, false);
            if (object2 == null) {
                object2 = VCardResultParser.matchVCardPrefixedField("N", (String)object, bl3, false);
                VCardResultParser.formatNames((Iterable)object2);
            }
            if ((stringArray3 = VCardResultParser.matchSingleVCardPrefixedField("NICKNAME", (String)object, bl3, false)) == null) {
                stringArray2 = null;
            } else {
                object3 = COMMA;
                stringArray3 = (CharSequence)stringArray3.get(0);
                stringArray2 = stringArray3 = ((Pattern)object3).split((CharSequence)stringArray3);
            }
            stringArray3 = VCardResultParser.matchVCardPrefixedField("TEL", (String)object, bl3, false);
            List list = VCardResultParser.matchVCardPrefixedField("EMAIL", (String)object, bl3, false);
            Object object4 = VCardResultParser.matchSingleVCardPrefixedField("NOTE", (String)object, false, false);
            String[] stringArray4 = VCardResultParser.matchVCardPrefixedField("ADR", (String)object, bl3, bl3);
            Object object5 = VCardResultParser.matchSingleVCardPrefixedField("ORG", (String)object, bl3, bl3);
            object3 = VCardResultParser.matchSingleVCardPrefixedField("BDAY", (String)object, bl3, false);
            Object object6 = object3 != null && !(bl2 = VCardResultParser.isLikeVCardDate((CharSequence)(stringArray = (String[])object3.get(0)))) ? null : object3;
            Object object7 = VCardResultParser.matchSingleVCardPrefixedField("TITLE", (String)object, bl3, false);
            String[] stringArray5 = VCardResultParser.matchVCardPrefixedField("URL", (String)object, bl3, false);
            Object object8 = VCardResultParser.matchSingleVCardPrefixedField("IMPP", (String)object, bl3, false);
            object3 = "GEO";
            object = VCardResultParser.matchSingleVCardPrefixedField((CharSequence)object3, (String)object, bl3, false);
            if (object == null) {
                object = null;
            } else {
                Pattern pattern = SEMICOLON_OR_COMMA;
                object = (CharSequence)object.get(0);
                object = pattern.split((CharSequence)object);
            }
            Object object9 = object != null && (n7 = ((Object)object).length) != (n8 = 2) ? null : object;
            object3 = object;
            stringArray = VCardResultParser.toPrimaryValues((Collection)object2);
            String[] stringArray6 = VCardResultParser.toPrimaryValues((Collection)stringArray3);
            String[] stringArray7 = VCardResultParser.toTypes((Collection)stringArray3);
            String[] stringArray8 = VCardResultParser.toPrimaryValues(list);
            String[] stringArray9 = VCardResultParser.toTypes(list);
            object8 = VCardResultParser.toPrimaryValue((List)object8);
            object4 = VCardResultParser.toPrimaryValue((List)object4);
            String[] stringArray10 = VCardResultParser.toPrimaryValues((Collection)stringArray4);
            stringArray4 = VCardResultParser.toTypes((Collection)stringArray4);
            object5 = VCardResultParser.toPrimaryValue((List)object5);
            object6 = VCardResultParser.toPrimaryValue((List)object6);
            object7 = VCardResultParser.toPrimaryValue((List)object7);
            stringArray5 = VCardResultParser.toPrimaryValues((Collection)stringArray5);
            object = new AddressBookParsedResult(stringArray, stringArray2, null, stringArray6, stringArray7, stringArray8, stringArray9, (String)object8, (String)object4, stringArray10, stringArray4, (String)object5, (String)object6, (String)object7, stringArray5, (String[])object9);
            return object;
        }
        return null;
    }
}

