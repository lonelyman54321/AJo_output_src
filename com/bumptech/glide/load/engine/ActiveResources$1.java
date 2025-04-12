/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.ActiveResources$1$1;
import java.util.concurrent.ThreadFactory;

public final class ActiveResources$1
implements ThreadFactory {
    public final Thread newThread(Runnable runnable2) {
        ActiveResources$1$1 activeResources$1$1 = new ActiveResources$1$1(runnable2);
        Thread thread2 = new Thread((Runnable)activeResources$1$1, "glide-active-resources");
        return thread2;
    }
}

