/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bv;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.eh;
import com.google.android.play.core.assetpacks.fj;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

final class ch
extends FilterInputStream {
    private final eh a;
    private byte[] b;
    private long c;
    private boolean d;
    private boolean e;

    public ch(InputStream object) {
        super((InputStream)object);
        this.a = object = new eh();
        object = new byte[4096];
        this.b = (byte[])object;
        this.d = false;
        this.e = false;
    }

    private final int e(byte[] byArray, int n3, int n4) {
        int n7 = super.read(byArray, n3, n4);
        return Math.max(0, n7);
    }

    private final boolean f(int n3) {
        int n4;
        byte[] byArray;
        int n7;
        Object object = this.b;
        int n8 = this.e((byte[])object, 0, n3);
        if (n8 != n3 && (n7 = this.e(byArray = this.b, n8, n4 = n3 - n8)) != n4) {
            eh eh2 = this.a;
            byArray = this.b;
            eh2.b(byArray, 0, n8);
            return false;
        }
        object = this.a;
        byArray = this.b;
        object.b(byArray, 0, n3);
        return true;
    }

    public final long a() {
        return this.c;
    }

    /*
     * WARNING - void declaration
     */
    public final fj b() {
        Object object;
        int n4;
        Object object2;
        int n3;
        long l2 = this.c;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 > 0) {
            do {
                object2 = this.b;
                n4 = ((byte[])object2).length;
                boolean n32 = false;
                object = null;
            } while ((n3 = this.read((byte[])object2, 0, n4)) != (n4 = -1));
        }
        if ((n3 = this.d) == 0 && (n3 = this.e) == 0) {
            long l7;
            n3 = this.f(30);
            n4 = 1;
            if (n3 == 0) {
                this.d = n4;
                return this.a.c();
            }
            object2 = this.a.c();
            boolean bl2 = ((fj)object2).d();
            if (bl2) {
                this.e = n4;
                return object2;
            }
            l3 = ((fj)object2).b();
            long l8 = l3 - (l7 = 0xFFFFFFFFL);
            n3 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
            if (n3 != 0) {
                long l12;
                int n7;
                long l14;
                object2 = this.a;
                n3 = ((eh)object2).a() + -30;
                long l15 = n3;
                long l16 = l15 - (l14 = (long)(n7 = ((byte[])(object = this.b)).length));
                Object object4 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                if (object4 > 0) {
                    void var8_9;
                    long l17;
                    while ((object4 = (l17 = (l14 = (long)(var8_9 += var8_9)) - l15) == 0L ? 0 : (l17 < 0L ? -1 : 1)) < 0) {
                    }
                    byte[] byArray = this.b;
                    this.b = object = Arrays.copyOf(byArray, (int)var8_9);
                }
                if ((n3 = (int)(this.f(n3) ? 1 : 0)) == 0) {
                    this.d = n4;
                    return this.a.c();
                }
                object2 = this.a.c();
                this.c = l12 = ((fj)object2).b();
                return object2;
            }
            object2 = new cz("Files bigger than 4GiB are not supported.");
            throw object2;
        }
        object2 = new bv;
        object = object2;
        object2 = new bv(null, -1, -1, false, false, null);
        return object2;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean d() {
        return this.d;
    }

    public final int read(byte[] byArray) {
        int n3 = byArray.length;
        return this.read(byArray, 0, n3);
    }

    public final int read(byte[] byArray, int n3, int n4) {
        boolean bl2;
        long l2 = this.c;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0 && !(bl2 = this.d)) {
            l3 = n4;
            n4 = (int)Math.min(l2, l3);
            int n7 = this.e(byArray, n3, n4);
            long l7 = this.c;
            l2 = n7;
            this.c = l7 -= l2;
            if (n7 == 0) {
                this.d = true;
                n7 = 0;
                byArray = null;
            }
            return n7;
        }
        return -1;
    }
}

