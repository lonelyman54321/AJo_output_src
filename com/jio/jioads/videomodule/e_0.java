/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.tracker.JioEventTracker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.videomodule.E
 */
public final class e_0
extends Lambda
implements Function0 {
    public static final e_0 c;

    static {
        e_0 e_02;
        c = e_02 = new Lambda(0);
    }

    public final Object invoke() {
        JioEventTracker jioEventTracker = new JioEventTracker();
        return jioEventTracker;
    }
}

