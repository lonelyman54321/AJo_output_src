/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractIdleService$DelegateService;

public final class d
implements Runnable {
    public final /* synthetic */ AbstractIdleService$DelegateService a;

    public /* synthetic */ d(AbstractIdleService$DelegateService abstractIdleService$DelegateService) {
        this.a = abstractIdleService$DelegateService;
    }

    public final void run() {
        AbstractIdleService$DelegateService.b(this.a);
    }
}

