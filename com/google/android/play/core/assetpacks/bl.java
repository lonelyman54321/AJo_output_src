/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

public final class bl {
    public static boolean a(int n3) {
        int n4;
        int n7 = 1;
        if (n3 != n7 && n3 != (n4 = 7) && n3 != (n4 = 2) && n3 != (n4 = 9) && n3 != (n4 = 3)) {
            return false;
        }
        return n7;
    }

    public static boolean b(int n3) {
        int n4 = 2;
        return n3 == n4 || n3 == (n4 = 7) || n3 == (n4 = 3);
        {
        }
    }

    public static boolean c(int n3, int n4) {
        int n7;
        int n8 = 1;
        int n10 = 5;
        if (n3 == n10) {
            if (n4 == n10) {
                n3 = 5;
            } else {
                return n8 != 0;
            }
        }
        if (n3 == (n7 = 6)) {
            if (n4 == n7 || n4 == n10) {
                n3 = 6;
            } else {
                return n8 != 0;
            }
        }
        if (n3 == (n10 = 4) && n4 != n10) {
            return n8 != 0;
        }
        n10 = 3;
        n7 = 8;
        int n14 = 2;
        if (n3 == n10 && (n4 == n14 || n4 == (n10 = 7) || n4 == n8 || n4 == n7)) {
            return n8 != 0;
        }
        if (n3 == n14 && (n4 == n8 || n4 == n7)) {
            return n8 != 0;
        }
        return false;
    }

    public static boolean d(int n3) {
        int n4 = 5;
        return n3 == n4 || n3 == (n4 = 6) || n3 == (n4 = 4);
        {
        }
    }
}

