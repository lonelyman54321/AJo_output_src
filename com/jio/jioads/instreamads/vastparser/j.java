/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser;

import com.jio.jioads.instreamads.vastparser.model.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j
extends Lambda
implements Function0 {
    public final /* synthetic */ com.jio.jioads.instreamads.vastparser.n c;

    public j(com.jio.jioads.instreamads.vastparser.n n3) {
        this.c = n3;
        super(0);
    }

    public final Object invoke() {
        n n3 = new n();
        String string2 = this.c.b.P();
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        n3.a = string2;
        return n3;
    }
}

