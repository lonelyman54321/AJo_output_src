/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.dv;
import java.io.InputStream;

final class co
extends dv {
    final int a;
    final long b;
    final String c;
    final String d;
    final int e;
    final int f;
    final int g;
    final long h;
    final int i;
    final InputStream j;

    public co(int n3, String string2, int n4, long l2, String string3, String string4, int n7, int n8, int n10, long l3, int n14, InputStream inputStream) {
        super(n3, string2);
        this.a = n4;
        this.b = l2;
        this.c = string3;
        this.d = string4;
        this.e = n7;
        this.f = n8;
        this.g = n10;
        this.h = l3;
        this.i = n14;
        this.j = inputStream;
    }

    public final boolean a() {
        int n3 = this.f;
        int n4 = 1;
        int n7 = this.g;
        if ((n3 += n4) == n7) {
            return n4 != 0;
        }
        return false;
    }
}

