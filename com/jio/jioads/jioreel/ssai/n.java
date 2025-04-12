/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.ssai;

import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.network.d;
import com.jio.jioads.network.f;
import kotlin.jvm.internal.Intrinsics;

public final class n
implements Runnable {
    public final /* synthetic */ p a;
    public final /* synthetic */ f b;

    public /* synthetic */ n(p p2, f f5) {
        this.a = p2;
        this.b = f5;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$it");
        JioReelListener jioReelListener = ((p)object).b;
        object2 = (d)object2;
        object = ((d)object2).a;
        object2 = ((d)object2).b;
        jioReelListener.onAdError((String)object, (String)object2);
    }
}

