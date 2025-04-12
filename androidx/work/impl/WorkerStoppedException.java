/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl;

import java.util.concurrent.CancellationException;

public final class WorkerStoppedException
extends CancellationException {
    public final int a;

    public WorkerStoppedException(int n3) {
        this.a = n3;
    }
}

