/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFLogger$7
extends Lambda
implements Function0 {
    public static final AFLogger$7 getMonetizationNetwork;

    static {
        AFLogger$7 aFLogger$7;
        getMonetizationNetwork = aFLogger$7 = new AFLogger$7();
    }

    public AFLogger$7() {
        super(0);
    }

    public final Set getCurrencyIso4217Code() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        return Collections.synchronizedSet(linkedHashSet);
    }

    public final /* synthetic */ Object invoke() {
        return this.getCurrencyIso4217Code();
    }
}

