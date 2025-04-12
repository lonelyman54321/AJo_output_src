/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

final class zzccd
extends ScheduledThreadPoolExecutor {
    public zzccd(int n3, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}

