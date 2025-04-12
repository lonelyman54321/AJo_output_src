/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped$WeakSafeReadWriteLock;

public final class r
implements Supplier {
    public final Object get() {
        Striped$WeakSafeReadWriteLock striped$WeakSafeReadWriteLock = new Striped$WeakSafeReadWriteLock();
        return striped$WeakSafeReadWriteLock;
    }
}

