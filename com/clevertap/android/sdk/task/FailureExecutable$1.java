/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.task;

import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.task.FailureExecutable;

class FailureExecutable$1
implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ FailureExecutable b;

    public FailureExecutable$1(FailureExecutable failureExecutable, Object object) {
        this.b = failureExecutable;
        this.a = object;
    }

    public final void run() {
        this.b.b.getClass();
        Exception cfr_ignored_0 = (Exception)this.a;
        a$a.INFO.intValue();
    }
}

