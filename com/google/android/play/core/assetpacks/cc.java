/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

final class cc {
    public static int a(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        return (byArray[++n3] & 0xFF) << 8 | n4;
    }

    public static int b(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = byArray[n7] & 0xFF;
        int n8 = n3 + 2;
        n8 = byArray[n8] & 0xFF;
        int n10 = byArray[n3 += 3] & 0xFF;
        n3 = n4 << 24;
        n4 = n7 << 16;
        n3 |= n4;
        n4 = n8 << 8;
        return n10 | (n3 |= n4);
    }

    public static long c(byte[] byArray, int n3) {
        int n4 = n3 + 2;
        n3 = cc.a(byArray, n3);
        return (long)(cc.a(byArray, n4) << 16 | n3) & 0xFFFFFFFFL;
    }
}

