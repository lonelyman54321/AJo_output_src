/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggo;
import java.util.concurrent.TimeoutException;

final class zzggp
extends TimeoutException {
    public /* synthetic */ zzggp(String string2, zzggo zzggo2) {
        super(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            StackTraceElement[] stackTraceElementArray = null;
            stackTraceElementArray = new StackTraceElement[]{};
            this.setStackTrace(stackTraceElementArray);
            return this;
        }
    }
}

