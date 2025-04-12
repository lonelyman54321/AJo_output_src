/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 */
package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode;
import com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory;

class GlideExecutor$DefaultThreadFactory$1
implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ GlideExecutor$DefaultThreadFactory b;

    public GlideExecutor$DefaultThreadFactory$1(GlideExecutor$DefaultThreadFactory glideExecutor$DefaultThreadFactory, Runnable runnable2) {
        this.b = glideExecutor$DefaultThreadFactory;
        this.a = runnable2;
    }

    public final void run() {
        Object object;
        Object object2 = this.b;
        boolean bl2 = ((GlideExecutor$DefaultThreadFactory)object2).d;
        if (bl2) {
            object = new StrictMode.ThreadPolicy.Builder();
            object = object.detectNetwork().penaltyDeath().build();
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)object);
        }
        object = this.a;
        try {
            object.run();
        }
        catch (Throwable throwable) {
            object2 = ((GlideExecutor$DefaultThreadFactory)object2).c;
            object2.a(throwable);
        }
    }
}

