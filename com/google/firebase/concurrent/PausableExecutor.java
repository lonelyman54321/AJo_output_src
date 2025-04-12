/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

public interface PausableExecutor
extends Executor {
    public boolean isPaused();

    public void pause();

    public void resume();
}

