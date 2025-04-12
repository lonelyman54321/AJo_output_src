/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.controller;

import com.jio.retargeting.controller.ConfigController;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class c
implements com.jio.jioads.util.c {
    public final /* synthetic */ String a;
    public final /* synthetic */ ConfigController b;

    public c(String string2, ConfigController configController) {
        this.a = string2;
        this.b = configController;
    }

    public final void a() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        String string2 = this.a;
        ConfigController configController = this.b;
        jk1_2 jk1_22 = new jk1_2(string2, configController);
        executorService.submit(jk1_22);
    }
}

