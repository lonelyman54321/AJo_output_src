/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.engine.f$b;
import com.bumptech.glide.load.engine.g$a;

public final class f$b$a
implements LI0$b {
    public final /* synthetic */ f$b a;

    public f$b$a(f$b f$b) {
        this.a = f$b;
    }

    public final Object a() {
        EngineJob engineJob;
        Object object = this.a;
        GlideExecutor glideExecutor = ((f$b)object).a;
        Rz0 rz0 = ((f$b)object).e;
        g$a g$a = ((f$b)object).f;
        GlideExecutor glideExecutor2 = ((f$b)object).b;
        GlideExecutor glideExecutor3 = ((f$b)object).c;
        GlideExecutor glideExecutor4 = ((f$b)object).d;
        LI0$c lI0$c = ((f$b)object).g;
        object = engineJob;
        engineJob = new EngineJob(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, rz0, g$a, lI0$c);
        return engineJob;
    }
}

