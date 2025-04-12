/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.audio;

import com.jio.jioads.tracker.JioEventTracker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b
extends Lambda
implements Function0 {
    public static final b c;

    static {
        b b2;
        c = b2 = new Lambda(0);
    }

    public final Object invoke() {
        JioEventTracker jioEventTracker = new JioEventTracker();
        return jioEventTracker;
    }
}

