/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.utils;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.functions.Function0;

public final class DelayRunKt$delayRun$1$1
extends TimerTask {
    final /* synthetic */ Timer $it;
    final /* synthetic */ Function0 $run;

    public DelayRunKt$delayRun$1$1(Function0 function0, Timer timer) {
        this.$run = function0;
        this.$it = timer;
    }

    public void run() {
        this.$run.invoke();
        this.$it.cancel();
    }
}

