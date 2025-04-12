/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.utils;

import com.affise.attribution.utils.DelayRunKt$delayRun$1$1;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class DelayRunKt {
    public static final void delayRun(long l2, Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "run");
        Timer timer = new Timer();
        DelayRunKt$delayRun$1$1 delayRunKt$delayRun$1$1 = new DelayRunKt$delayRun$1$1(function0, timer);
        timer.schedule((TimerTask)delayRunKt$delayRun$1$1, l2);
    }
}

