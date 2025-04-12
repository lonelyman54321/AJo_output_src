/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

public final class n
implements ThreadFactory {
    public final Thread newThread(Runnable runnable2) {
        Thread thread2 = new Thread(runnable2, "UpdateListenerExecutor");
        return thread2;
    }
}

