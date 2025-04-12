/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util;

public final class HexDumpUtils {
    public static String dump(byte[] byArray, int n3, int n4, boolean bl2) {
        int n7;
        int n8;
        int n10 = 16;
        int n14 = 1;
        if (byArray != null && (n8 = byArray.length) != 0 && n3 >= 0 && n4 > 0 && (n7 = n3 + n4) <= n8) {
            n8 = bl2 ? 75 : 57;
            n7 = n4 + 15;
            n7 = n7 / n10 * n8;
            StringBuilder stringBuilder = new StringBuilder(n7);
            n8 = n4;
            n7 = 0;
            int n15 = 0;
            Object object = null;
            while (n8 > 0) {
                Object object2;
                int n16 = 8;
                if (n7 == 0) {
                    n15 = 65536;
                    if (n4 < n15) {
                        object = n3;
                        object2 = new Object[n14];
                        object2[0] = object;
                        object = String.format("%04X:", object2);
                        stringBuilder.append((String)object);
                    } else {
                        object = n3;
                        object2 = new Object[n14];
                        object2[0] = object;
                        object = String.format("%08X:", object2);
                        stringBuilder.append((String)object);
                    }
                    n15 = n3;
                } else if (n7 == n16) {
                    object2 = " -";
                    stringBuilder.append((String)object2);
                }
                char c2 = byArray[n3] & 0xFF;
                object2 = (int)c2;
                Object object3 = new Object[n14];
                object3[0] = object2;
                object2 = String.format(" %02X", object3);
                stringBuilder.append((String)object2);
                if (bl2 && ((n7 += n14) == n10 || (n8 += -1) == 0)) {
                    char c3;
                    c2 = 16 - n7;
                    if (c2 > '\u0000') {
                        object3 = null;
                        for (c3 = '\u0000'; c3 < c2; c3 += n14) {
                            String string2 = "   ";
                            stringBuilder.append(string2);
                        }
                    }
                    object3 = "  ";
                    if (c2 >= n16) {
                        stringBuilder.append((String)object3);
                    }
                    stringBuilder.append((String)object3);
                    for (n16 = 0; n16 < n7; n16 += n14) {
                        c2 = n15 + n16;
                        c3 = ' ';
                        if ((c2 = (char)((char)byArray[c2])) < c3 || c2 > (c3 = '~')) {
                            c2 = '.';
                        }
                        stringBuilder.append(c2);
                    }
                }
                if (n7 == n10 || n8 == 0) {
                    stringBuilder.append('\n');
                    n7 = 0;
                }
                n3 += n14;
            }
            return stringBuilder.toString();
        }
        return null;
    }
}

