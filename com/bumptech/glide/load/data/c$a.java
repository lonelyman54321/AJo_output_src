/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.data.a$a;
import com.bumptech.glide.load.data.c;
import java.io.InputStream;

public final class c$a
implements a$a {
    public final Kp a;

    public c$a(Kp kp) {
        this.a = kp;
    }

    public final Class a() {
        return InputStream.class;
    }

    public final a b(Object object) {
        object = (InputStream)object;
        Kp kp = this.a;
        c c2 = new c((InputStream)object, kp);
        return c2;
    }
}

