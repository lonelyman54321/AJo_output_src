/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.FinalizableReference;
import com.google.common.base.FinalizableReferenceQueue;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public abstract class FinalizablePhantomReference
extends PhantomReference
implements FinalizableReference {
    public FinalizablePhantomReference(Object object, FinalizableReferenceQueue finalizableReferenceQueue) {
        ReferenceQueue referenceQueue = finalizableReferenceQueue.queue;
        super(object, referenceQueue);
        finalizableReferenceQueue.cleanUp();
    }
}

