/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.DecodeJob$e;
import com.bumptech.glide.load.engine.f$a;
import com.bumptech.glide.load.engine.f$c;

public final class f$a$a
implements LI0$b {
    public final /* synthetic */ f$a a;

    public f$a$a(f$a f$a) {
        this.a = f$a;
    }

    public final Object a() {
        Object object = this.a;
        DecodeJob$e decodeJob$e = ((f$a)object).a;
        object = ((f$a)object).b;
        decodeJob$e = (f$c)decodeJob$e;
        DecodeJob decodeJob = new DecodeJob((f$c)decodeJob$e, (LI0$c)object);
        return decodeJob;
    }
}

