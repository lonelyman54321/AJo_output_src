/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitcompat;

import java.util.concurrent.ThreadFactory;

final class zzc
implements ThreadFactory {
    public final Thread newThread(Runnable runnable2) {
        Thread thread2 = new Thread(runnable2, "SplitCompatBackgroundThread");
        return thread2;
    }
}

