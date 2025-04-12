/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.variables.callbacks;

public abstract class VariablesChangedCallback
implements Runnable {
    public abstract void a();

    public final void run() {
        this.a();
    }
}

