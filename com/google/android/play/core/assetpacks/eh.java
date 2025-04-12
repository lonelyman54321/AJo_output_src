/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bv;
import com.google.android.play.core.assetpacks.cc;
import com.google.android.play.core.assetpacks.fj;
import java.util.Arrays;

final class eh {
    private byte[] a;
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private String i;

    public eh() {
        byte[] byArray = new byte[4096];
        this.a = byArray;
        this.d();
    }

    private final int e(int n3, byte[] byArray, int n4, int n7) {
        int n8 = this.b;
        if (n8 < n3) {
            int n10;
            n8 = n3 - n8;
            n7 = Math.min(n7, n8);
            byte[] byArray2 = this.a;
            int n14 = this.b;
            System.arraycopy(byArray, n4, byArray2, n14, n7);
            this.b = n10 = this.b + n7;
            if (n10 < n3) {
                return -1;
            }
            return n7;
        }
        return 0;
    }

    public final int a() {
        return this.f;
    }

    public final int b(byte[] object, int n3, int n4) {
        int n7;
        int n8 = 30;
        int n10 = this.e(n8, (byte[])object, n3, n4);
        if (n10 != (n7 = -1)) {
            int n14;
            int n15;
            long l2 = this.c;
            long l3 = -1;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                byte[] byArray = this.a;
                int n16 = 0;
                byte[] byArray2 = null;
                this.c = l3 = cc.c(byArray, 0);
                long l7 = 67324752L;
                long l8 = l3 - l7;
                n15 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                if (n15 == 0) {
                    this.h = false;
                    this.d = l2 = cc.c(this.a, 18);
                    this.g = n15 = cc.a(this.a, 8);
                    this.e = n15 = cc.a(this.a, 26);
                    n15 = cc.a(this.a, 28);
                    this.f = n16 = this.e + n8 + n15;
                    byArray = this.a;
                    n15 = byArray.length;
                    if (n15 < n16) {
                        while ((n15 += n15) < n16) {
                        }
                        byArray2 = this.a;
                        this.a = byArray = Arrays.copyOf(byArray2, n15);
                    }
                } else {
                    n15 = 1;
                    this.h = n15;
                }
            }
            if ((n14 = this.e(n15 = this.f, (byte[])object, n3 += n10, n4 -= n10)) == n7) {
                return n7;
            }
            n10 += n14;
            n14 = (int)(this.h ? 1 : 0);
            if (n14 == 0 && (object = (Object)this.i) == null) {
                object = new String;
                byte[] byArray = this.a;
                n4 = this.e;
                object(byArray, n8, n4);
                this.i = object;
            }
            return n10;
        }
        return n7;
    }

    public final fj c() {
        int n3 = this.b;
        int n4 = this.f;
        if (n3 < n4) {
            String string2 = this.i;
            long l2 = this.d;
            int n7 = this.g;
            byte[] byArray = Arrays.copyOf(this.a, n3);
            boolean bl2 = this.h;
            bv bv2 = new bv(string2, l2, n7, true, bl2, byArray);
            return bv2;
        }
        String string3 = this.i;
        long l3 = this.d;
        int n8 = this.g;
        byte[] byArray = Arrays.copyOf(this.a, n4);
        n3 = (int)(this.h ? 1 : 0);
        bv bv4 = new bv(string3, l3, n8, false, n3 != 0, byArray);
        this.d();
        return bv4;
    }

    public final void d() {
        long l2;
        int n3;
        this.b = 0;
        this.e = n3 = -1;
        this.c = l2 = (long)-1;
        this.h = false;
        this.f = 30;
        this.d = l2;
        this.g = n3;
        this.i = null;
    }
}

