/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.a;
import java.io.InputStream;

public final class c
implements a {
    public final hG2 a;

    public c(InputStream inputStream, Kp kp) {
        hG2 hG22;
        this.a = hG22 = new hG2(inputStream, kp);
        hG22.mark(0x500000);
    }

    public final Object a() {
        hG2 hG22 = this.a;
        hG22.reset();
        return hG22;
    }

    public final void b() {
        this.a.release();
    }
}

