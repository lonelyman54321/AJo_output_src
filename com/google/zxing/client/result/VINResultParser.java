/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.client.result.VINParsedResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class VINResultParser
extends ResultParser {
    private static final Pattern AZ09;
    private static final Pattern IOQ;

    static {
        IOQ = Pattern.compile("[IOQ]");
        AZ09 = Pattern.compile("[A-Z0-9]{17}");
    }

    private static char checkChar(int n3) {
        int n4 = 10;
        if (n3 < n4) {
            return (char)(n3 + 48);
        }
        if (n3 == n4) {
            return 'X';
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    private static boolean checkChecksum(CharSequence charSequence) {
        int n3;
        int n4 = 0;
        int n7 = 0;
        while (n4 < (n3 = charSequence.length())) {
            n3 = n4 + 1;
            int n8 = VINResultParser.vinPositionWeight(n3);
            n4 = VINResultParser.vinCharValue(charSequence.charAt(n4));
            n7 += (n8 *= n4);
            n4 = n3;
        }
        char c2 = charSequence.charAt(8);
        return c2 == (n4 = (int)VINResultParser.checkChar(n7 %= 11));
    }

    private static String countryCode(CharSequence charSequence) {
        block30: {
            int n3;
            int n4;
            int n7;
            int n8;
            int n10;
            block27: {
                String string2;
                int n14;
                int n15;
                block28: {
                    int n16;
                    block29: {
                        n15 = charSequence.charAt(0);
                        n10 = charSequence.charAt(1);
                        n8 = 69;
                        n7 = 51;
                        n4 = 57;
                        n3 = 65;
                        if (n15 == n4) break block27;
                        n14 = 84;
                        string2 = "DE";
                        int n17 = 83;
                        if (n15 == n17) break block28;
                        int n18 = 90;
                        n16 = 82;
                        if (n15 == n18) break block29;
                        n18 = 87;
                        switch (n15) {
                            default: {
                                switch (n15) {
                                    default: {
                                        switch (n15) {
                                            default: {
                                                break block30;
                                            }
                                            case 88: {
                                                n15 = 48;
                                                if (n10 == n15 || n10 >= n7 && n10 <= n4) {
                                                    return "RU";
                                                }
                                                break block30;
                                            }
                                            case 87: {
                                                return string2;
                                            }
                                            case 86: {
                                                n15 = 70;
                                                if (n10 >= n15 && n10 <= n16) {
                                                    return "FR";
                                                }
                                                if (n10 >= n17 && n10 <= n18) {
                                                    return "ES";
                                                }
                                                break block30;
                                            }
                                        }
                                    }
                                    case 77: {
                                        if (n10 >= n3 && n10 <= n8) {
                                            return "IN";
                                        }
                                        break block30;
                                    }
                                    case 76: {
                                        return "CN";
                                    }
                                    case 75: {
                                        n15 = 76;
                                        if (n10 >= n15 && n10 <= n16) {
                                            return "KO";
                                        }
                                        break block30;
                                    }
                                    case 74: {
                                        if (n10 >= n3 && n10 <= n14) {
                                            return "JP";
                                        }
                                        break block30;
                                    }
                                }
                            }
                            case 51: {
                                if (n10 >= n3 && n10 <= n18) {
                                    return "MX";
                                }
                                break block30;
                            }
                            case 50: {
                                return "CA";
                            }
                            case 49: 
                            case 52: 
                            case 53: {
                                return "US";
                            }
                        }
                    }
                    if (n10 >= n3 && n10 <= n16) {
                        return "IT";
                    }
                    break block30;
                }
                if (n10 >= n3 && n10 <= (n15 = 77)) {
                    return "UK";
                }
                n15 = 78;
                if (n10 >= n15 && n10 <= n14) {
                    return string2;
                }
                break block30;
            }
            if (n10 >= n3 && n10 <= n8 || n10 >= n7 && n10 <= n4) {
                return "BR";
            }
        }
        return null;
    }

    private static int modelYear(char n3) {
        int n4 = 69;
        if (n3 >= n4 && n3 <= (n4 = 72)) {
            return n3 + 1915;
        }
        n4 = 74;
        if (n3 >= n4 && n3 <= (n4 = 78)) {
            return n3 + 1914;
        }
        n4 = 80;
        if (n3 == n4) {
            return 1993;
        }
        n4 = 82;
        if (n3 >= n4 && n3 <= (n4 = 84)) {
            return n3 + 1912;
        }
        n4 = 86;
        if (n3 >= n4 && n3 <= (n4 = 89)) {
            return n3 + 1911;
        }
        n4 = 49;
        if (n3 >= n4 && n3 <= (n4 = 57)) {
            return n3 + 1952;
        }
        n4 = 65;
        if (n3 >= n4 && n3 <= (n4 = 68)) {
            return n3 + 1945;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    private static int vinCharValue(char n3) {
        int n4 = 65;
        int n7 = 73;
        if (n3 >= n4 && n3 <= n7) {
            return n3 + -64;
        }
        n4 = 74;
        if (n3 >= n4 && n3 <= (n4 = 82)) {
            return n3 - n7;
        }
        n4 = 83;
        if (n3 >= n4 && n3 <= (n4 = 90)) {
            return n3 + -81;
        }
        n4 = 48;
        if (n3 >= n4 && n3 <= (n7 = 57)) {
            return n3 - n4;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    private static int vinPositionWeight(int n3) {
        int n4;
        int n7 = 9;
        if (n3 > 0 && n3 <= (n4 = 7)) {
            return n7 - n3;
        }
        n4 = 8;
        int n8 = 10;
        if (n3 == n4) {
            return n8;
        }
        if (n3 == n7) {
            return 0;
        }
        if (n3 >= n8 && n3 <= (n7 = 17)) {
            return 19 - n3;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public VINParsedResult parse(Result object) {
        int n3;
        BarcodeFormat barcodeFormat;
        Object object2 = ((Result)object).getBarcodeFormat();
        if (object2 != (barcodeFormat = BarcodeFormat.CODE_39)) {
            return null;
        }
        object = ((Result)object).getText();
        object = IOQ.matcher((CharSequence)object);
        object2 = "";
        String string2 = ((Matcher)object).replaceAll((String)object2).trim();
        boolean bl2 = ((Matcher)(object = AZ09.matcher(string2))).matches();
        if (!bl2) {
            return null;
        }
        try {
            bl2 = VINResultParser.checkChecksum(string2);
            if (!bl2) {
                return null;
            }
            bl2 = false;
            object = null;
            n3 = 3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
        String string3 = string2.substring(0, n3);
        int n4 = 9;
        String string4 = string2.substring(n3, n4);
        int n7 = 17;
        String string5 = string2.substring(n4, n7);
        String string6 = VINResultParser.countryCode(string3);
        n7 = 8;
        String string7 = string2.substring(n3, n7);
        n3 = string2.charAt(n4);
        int n8 = VINResultParser.modelYear((char)n3);
        n3 = 10;
        char c2 = string2.charAt(n3);
        n3 = 11;
        String string8 = string2.substring(n3);
        object = new VINParsedResult(string2, string3, string4, string5, string6, string7, n8, c2, string8);
        return object;
    }
}

