/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractIdleService$DelegateService;

public final class c
implements Runnable {
    public final /* synthetic */ AbstractIdleService$DelegateService a;

    public /* synthetic */ c(AbstractIdleService$DelegateService delegateService) {
        this.a = delegateService;
    }

    public final void run() {
        AbstractIdleService$DelegateService.a(this.a);
    }
}

