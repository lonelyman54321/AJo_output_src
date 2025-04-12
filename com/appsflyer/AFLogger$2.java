/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFLogger$2
extends Lambda
implements Function0 {
    public static final AFLogger$2 getRevenue;

    static {
        AFLogger$2 aFLogger$2;
        getRevenue = aFLogger$2 = new AFLogger$2();
    }

    public AFLogger$2() {
        super(0);
    }

    public final ExecutorService getMediationNetwork() {
        return Executors.newSingleThreadExecutor();
    }

    public final /* synthetic */ Object invoke() {
        return this.getMediationNetwork();
    }
}

