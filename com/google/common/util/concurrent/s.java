/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped$PaddedLock;

public final class s
implements Supplier {
    public final Object get() {
        Striped$PaddedLock striped$PaddedLock = new Striped$PaddedLock();
        return striped$PaddedLock;
    }
}

