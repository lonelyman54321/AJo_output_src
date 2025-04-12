/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine.executor;

import com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory$1;
import java.util.concurrent.ThreadFactory;

public final class GlideExecutor$DefaultPriorityThreadFactory
implements ThreadFactory {
    public final Thread newThread(Runnable runnable2) {
        GlideExecutor$DefaultPriorityThreadFactory$1 glideExecutor$DefaultPriorityThreadFactory$1 = new Thread(runnable2);
        return glideExecutor$DefaultPriorityThreadFactory$1;
    }
}

