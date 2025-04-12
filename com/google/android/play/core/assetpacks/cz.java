/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

final class cz
extends RuntimeException {
    final int a;

    public cz(String string2) {
        super(string2);
        this.a = -1;
    }

    public cz(String string2, int n3) {
        super(string2);
        this.a = n3;
    }

    public cz(String string2, Exception exception) {
        super(string2, exception);
        this.a = -1;
    }

    public cz(String string2, Exception exception, int n3) {
        super(string2, exception);
        this.a = n3;
    }
}

