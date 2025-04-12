/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.work.Worker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Worker$b
extends Lambda
implements Function0 {
    public final /* synthetic */ Worker c;

    public Worker$b(Worker worker) {
        this.c = worker;
        super(0);
    }

    public final Object invoke() {
        return this.c.doWork();
    }
}

