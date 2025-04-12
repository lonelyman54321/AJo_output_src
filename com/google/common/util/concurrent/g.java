/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate;

public final class g
implements Runnable {
    public final /* synthetic */ AbstractScheduledService$ServiceDelegate a;

    public /* synthetic */ g(AbstractScheduledService$ServiceDelegate abstractScheduledService$ServiceDelegate) {
        this.a = abstractScheduledService$ServiceDelegate;
    }

    public final void run() {
        AbstractScheduledService$ServiceDelegate.c(this.a);
    }
}

