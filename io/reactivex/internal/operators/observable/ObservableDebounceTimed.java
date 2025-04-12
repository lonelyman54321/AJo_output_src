/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed$a;
import java.util.concurrent.TimeUnit;

public final class ObservableDebounceTimed
extends i1_0 {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;

    public ObservableDebounceTimed(x62_0 x62_02, TimeUnit timeUnit, Scheduler scheduler) {
        super(x62_02);
        this.b = 500L;
        this.c = timeUnit;
        this.d = scheduler;
    }

    public final void f(e62_0 e62_02) {
        e03_0 e03_02 = new e03_0(e62_02);
        Scheduler$Worker scheduler$Worker = this.d.a();
        long l2 = this.b;
        TimeUnit timeUnit = this.c;
        ObservableDebounceTimed$a observableDebounceTimed$a = new ObservableDebounceTimed$a(e03_02, l2, timeUnit, scheduler$Worker);
        this.a.c(observableDebounceTimed$a);
    }
}

