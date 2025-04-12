/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Preconditions;

public final class Utf8 {
    private Utf8() {
    }

    public static int encodedLength(CharSequence object) {
        int n3;
        int n4;
        int n7;
        int n8 = object.length();
        for (n7 = 0; n7 < n8 && (n4 = (int)object.charAt(n7)) < (n3 = 128); ++n7) {
        }
        n4 = n8;
        while (n7 < n8) {
            int n10;
            n3 = object.charAt(n7);
            if (n3 < (n10 = 2048)) {
                n3 = 127 - n3 >>> 31;
                n4 += n3;
                ++n7;
                continue;
            }
            int n14 = Utf8.encodedLengthGeneral((CharSequence)object, n7);
            n4 += n14;
            break;
        }
        if (n4 >= n8) {
            return n4;
        }
        CharSequence charSequence = new StringBuilder("UTF-8 length does not fit in int: ");
        long l2 = (long)n4 + 0x100000000L;
        charSequence.append(l2);
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    private static int encodedLengthGeneral(CharSequence object, int n3) {
        int n4 = object.length();
        int n7 = 0;
        while (n3 < n4) {
            int n8;
            int n10 = object.charAt(n3);
            if (n10 < (n8 = 2048)) {
                n10 = 127 - n10 >>> 31;
                n7 += n10;
            } else {
                n7 += 2;
                n8 = 55296;
                if (n8 <= n10 && n10 <= (n8 = 57343)) {
                    n8 = Character.codePointAt((CharSequence)object, n3);
                    if (n8 != n10) {
                        ++n3;
                    } else {
                        String string2 = Utf8.unpairedSurrogateMsg(n3);
                        object = new IllegalArgumentException(string2);
                        throw object;
                    }
                }
            }
            ++n3;
        }
        return n7;
    }

    public static boolean isWellFormed(byte[] byArray) {
        int n3 = byArray.length;
        return Utf8.isWellFormed(byArray, 0, n3);
    }

    public static boolean isWellFormed(byte[] byArray, int n3, int n4) {
        int n7 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n4 += n3, n7);
        while (n3 < n4) {
            n7 = byArray[n3];
            if (n7 < 0) {
                return Utf8.isWellFormedSlowPath(byArray, n3, n4);
            }
            ++n3;
        }
        return true;
    }

    private static boolean isWellFormedSlowPath(byte[] byArray, int n3, int n4) {
        while (n3 < n4) {
            int n7 = n3 + 1;
            int n8 = byArray[n3];
            if (n8 < 0) {
                int n10 = -32;
                int n14 = -65;
                if (n8 < n10) {
                    if (n7 == n4) {
                        return false;
                    }
                    n10 = -62;
                    if (n8 >= n10) {
                        n3 += 2;
                        if ((n7 = byArray[n7]) <= n14) continue;
                    }
                    return false;
                }
                int n15 = -16;
                if (n8 < n15) {
                    n15 = n3 + 2;
                    if (n15 >= n4) {
                        return false;
                    }
                    if ((n7 = byArray[n7]) <= n14) {
                        int n16 = -96;
                        if (!(n8 == n10 && n7 < n16 || n8 == (n10 = -19) && n16 <= n7)) {
                            n3 += 3;
                            n7 = byArray[n15];
                            if (n7 <= n14) continue;
                        }
                    }
                    return false;
                }
                n10 = n3 + 3;
                if (n10 >= n4) {
                    return false;
                }
                n10 = n3 + 2;
                if ((n7 = byArray[n7]) <= n14 && (n7 = n7 + 112 + (n8 <<= 28) >> 30) == 0) {
                    n7 = n3 + 3;
                    n8 = byArray[n10];
                    if (n8 <= n14) {
                        n3 += 4;
                        if ((n7 = byArray[n7]) <= n14) continue;
                    }
                }
                return false;
            }
            n3 = n7;
        }
        return true;
    }

    private static String unpairedSurrogateMsg(int n3) {
        return hj0_0.a(n3, "Unpaired surrogate at index ");
    }
}

