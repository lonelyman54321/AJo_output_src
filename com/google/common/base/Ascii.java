/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Preconditions;

public final class Ascii {
    public static final byte ACK = 6;
    public static final byte BEL = 7;
    public static final byte BS = 8;
    public static final byte CAN = 24;
    private static final char CASE_MASK = ' ';
    public static final byte CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = 127;
    public static final byte DLE = 16;
    public static final byte EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;
    public static final byte FF = 12;
    public static final byte FS = 28;
    public static final byte GS = 29;
    public static final byte HT = 9;
    public static final byte LF = 10;
    public static final char MAX = '\u007f';
    public static final char MIN = '\u0000';
    public static final byte NAK = 21;
    public static final byte NL = 10;
    public static final byte NUL = 0;
    public static final byte RS = 30;
    public static final byte SI = 15;
    public static final byte SO = 14;
    public static final byte SOH = 1;
    public static final byte SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;
    public static final byte US = 31;
    public static final byte VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    private Ascii() {
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        int n3 = charSequence.length();
        boolean bl2 = true;
        if (charSequence == charSequence2) {
            return bl2;
        }
        int n4 = charSequence2.length();
        if (n3 != n4) {
            return false;
        }
        for (n4 = 0; n4 < n3; ++n4) {
            int n7;
            int n8;
            int n10 = charSequence.charAt(n4);
            if (n10 == (n8 = charSequence2.charAt(n4)) || (n10 = Ascii.getAlphaIndex((char)n10)) < (n7 = 26) && n10 == (n8 = Ascii.getAlphaIndex((char)n8))) {
                continue;
            }
            return false;
        }
        return bl2;
    }

    private static int getAlphaIndex(char c2) {
        return (char)((c2 | 0x20) + -97);
    }

    public static boolean isLowerCase(char n3) {
        int n4 = 97;
        n3 = n3 >= n4 && n3 <= (n4 = 122) ? 1 : 0;
        return n3 != 0;
    }

    public static boolean isUpperCase(char n3) {
        int n4 = 65;
        n3 = n3 >= n4 && n3 <= (n4 = 90) ? 1 : 0;
        return n3 != 0;
    }

    public static char toLowerCase(char c2) {
        boolean bl2 = Ascii.isUpperCase(c2);
        if (bl2) {
            c2 = (char)(c2 ^ 0x20);
        }
        return c2;
    }

    public static String toLowerCase(CharSequence charSequence) {
        int n3 = charSequence instanceof String;
        if (n3 != 0) {
            return Ascii.toLowerCase((String)charSequence);
        }
        n3 = charSequence.length();
        char[] cArray = new char[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2;
            cArray[i3] = c2 = Ascii.toLowerCase(charSequence.charAt(i3));
        }
        return String.valueOf(cArray);
    }

    public static String toLowerCase(String object) {
        int n3 = ((String)object).length();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = Ascii.isUpperCase(((String)object).charAt(i3));
            if (!object2) continue;
            object = ((String)object).toCharArray();
            while (i3 < n3) {
                object2 = object[i3];
                boolean bl2 = Ascii.isUpperCase((char)object2);
                if (bl2) {
                    object2 = (char)(object2 ^ 0x20);
                    object[i3] = object2;
                }
                ++i3;
            }
            return String.valueOf((char[])object);
        }
        return object;
    }

    public static char toUpperCase(char c2) {
        boolean bl2 = Ascii.isLowerCase(c2);
        if (bl2) {
            c2 = (char)(c2 ^ 0x20);
        }
        return c2;
    }

    public static String toUpperCase(CharSequence charSequence) {
        int n3 = charSequence instanceof String;
        if (n3 != 0) {
            return Ascii.toUpperCase((String)charSequence);
        }
        n3 = charSequence.length();
        char[] cArray = new char[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2;
            cArray[i3] = c2 = Ascii.toUpperCase(charSequence.charAt(i3));
        }
        return String.valueOf(cArray);
    }

    public static String toUpperCase(String object) {
        int n3 = ((String)object).length();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = Ascii.isLowerCase(((String)object).charAt(i3));
            if (!object2) continue;
            object = ((String)object).toCharArray();
            while (i3 < n3) {
                object2 = object[i3];
                boolean bl2 = Ascii.isLowerCase((char)object2);
                if (bl2) {
                    object2 = (char)(object2 ^ 0x20);
                    object[i3] = object2;
                }
                ++i3;
            }
            return String.valueOf((char[])object);
        }
        return object;
    }

    public static String truncate(CharSequence charSequence, int n3, String string2) {
        StringBuilder stringBuilder;
        int n4;
        Preconditions.checkNotNull(charSequence);
        int n7 = string2.length();
        n7 = n3 - n7;
        if (n7 >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            stringBuilder = null;
        }
        String string3 = "maxLength (%s) must be >= length of the truncation indicator (%s)";
        int n8 = string2.length();
        Preconditions.checkArgument(n4 != 0, string3, n3, n8);
        n4 = charSequence.length();
        if (n4 <= n3 && (n4 = ((String)(charSequence = charSequence.toString())).length()) <= n3) {
            return charSequence;
        }
        stringBuilder = new StringBuilder(n3);
        stringBuilder.append(charSequence, 0, n7);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

