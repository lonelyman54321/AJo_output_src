/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

public interface FutureCallback {
    public void onFailure(Throwable var1);

    public void onSuccess(Object var1);
}

