/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.ssai;

import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.ssai.p;
import kotlin.jvm.internal.Intrinsics;

public final class m
implements Runnable {
    public final /* synthetic */ p a;
    public final /* synthetic */ String b;

    public /* synthetic */ m(p p2, String string2) {
        this.a = p2;
        this.b = string2;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        JioReelListener jioReelListener = ((p)object).b;
        object = this.b;
        jioReelListener.onStreamReady((String)object);
    }
}

