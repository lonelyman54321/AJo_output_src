/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.internal.instrument.crashshield;

public final class CrashShieldHandler$scheduleCrashInDebug$1
implements Runnable {
    public final void run() {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        bl2 = false;
        RuntimeException runtimeException = null;
        try {
            throw null;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
    }
}

