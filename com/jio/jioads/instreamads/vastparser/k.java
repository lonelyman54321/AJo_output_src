/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser;

import com.jio.jioads.instreamads.vastparser.n;
import kotlin.jvm.internal.Intrinsics;

public final class k
implements Runnable {
    public final /* synthetic */ n a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ k(n n3, String string2, String string3) {
        this.a = n3;
        this.b = string2;
        this.c = string3;
    }

    public final void run() {
        n n3 = this.a;
        Intrinsics.checkNotNullParameter(n3, "this$0");
        Intrinsics.checkNotNullParameter(this.c, "$ccb");
        String string2 = this.b;
        n3.s(string2);
    }
}

