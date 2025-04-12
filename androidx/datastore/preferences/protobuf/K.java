/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.K$b;
import androidx.datastore.preferences.protobuf.K$d;

public final class K {
    public static final K$b a;

    static {
        boolean bl2 = nw3.f;
        K$b k$b = bl2 && (bl2 = nw3.e) && !(bl2 = Ye.a()) ? new Object() : new Object();
        a = k$b;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(byte[] object, int n3, int n4) {
        int n7;
        void var1_2;
        int n8 = var1_2 + -1;
        n8 = object[n8];
        if ((by2 -= var1_2) != 0) {
            byte by2;
            byte by4 = 1;
            if (by2 != by4) {
                byte by5 = 2;
                if (by2 == by5) {
                    by2 = object[var1_2];
                    n7 = object[var1_2 += by4];
                    return K.d(n8, by2, n7);
                }
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            n7 = object[var1_2];
            return K.c(n8, n7);
        }
        n7 = -12;
        if (n8 <= n7) return n8;
        return -1;
    }

    public static int b(CharSequence object) {
        int n3;
        int n4;
        int n7;
        int n8 = object.length();
        int n10 = 0;
        for (n7 = 0; n7 < n8 && (n4 = (int)object.charAt(n7)) < (n3 = 128); ++n7) {
        }
        n4 = n8;
        while (n7 < n8) {
            int n14;
            n3 = object.charAt(n7);
            if (n3 < (n14 = 2048)) {
                n3 = 127 - n3 >>> 31;
                n4 += n3;
                ++n7;
                continue;
            }
            n3 = object.length();
            while (n7 < n3) {
                int n15 = object.charAt(n7);
                if (n15 < n14) {
                    n15 = 127 - n15 >>> 31;
                    n10 += n15;
                } else {
                    n10 += 2;
                    int n16 = 55296;
                    if (n16 <= n15 && n15 <= (n16 = 57343)) {
                        n15 = Character.codePointAt((CharSequence)object, n7);
                        if (n15 >= (n16 = 65536)) {
                            ++n7;
                        } else {
                            object = new K$d(n7, n3);
                            throw object;
                        }
                    }
                }
                ++n7;
            }
            n4 += n10;
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

    public static int c(int n3, int n4) {
        int n7 = -12;
        n3 = n3 <= n7 && n4 <= (n7 = -65) ? (n3 ^= (n4 <<= 8)) : -1;
        return n3;
    }

    public static int d(int n3, int n4, int n7) {
        int n8 = -12;
        if (n3 <= n8 && n4 <= (n8 = -65) && n7 <= n8) {
            n3 ^= (n4 <<= 8);
            n4 = n7 << 16;
            n3 ^= n4;
        } else {
            n3 = -1;
        }
        return n3;
    }
}

