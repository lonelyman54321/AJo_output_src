/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.controller;

import com.jio.retargeting.controller.ConfigController;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class a
implements Runnable {
    public final /* synthetic */ ConfigController a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Ref$ObjectRef e;

    public /* synthetic */ a(ConfigController configController, String string2, String string3, long l2, Ref$ObjectRef ref$ObjectRef) {
        this.a = configController;
        this.b = string2;
        this.c = string3;
        this.d = l2;
        this.e = ref$ObjectRef;
    }

    public final void run() {
        long l2 = this.d;
        Ref$ObjectRef ref$ObjectRef = this.e;
        ConfigController configController = this.a;
        String string2 = this.b;
        String string3 = this.c;
        ConfigController.a(configController, string2, string3, l2, ref$ObjectRef);
    }
}

