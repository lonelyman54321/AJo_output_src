/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.task;

import com.clevertap.android.sdk.task.FailureExecutable$1;
import java.util.concurrent.Executor;

public final class FailureExecutable
extends ee0_0 {
    public final li_2 b;

    public FailureExecutable(Executor executor, li_2 li_22) {
        super(executor);
        this.b = li_22;
    }

    public final void a(Object object) {
        FailureExecutable$1 failureExecutable$1 = new FailureExecutable$1(this, object);
        this.a.execute(failureExecutable$1);
    }
}

