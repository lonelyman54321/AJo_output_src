/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

abstract class fj {
    public abstract int a();

    public abstract long b();

    public abstract String c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract byte[] f();

    public final boolean g() {
        String string2 = this.c();
        if (string2 == null) {
            return false;
        }
        return this.c().endsWith("/");
    }

    public final boolean h() {
        int n3 = this.a();
        return n3 == 0;
    }
}

