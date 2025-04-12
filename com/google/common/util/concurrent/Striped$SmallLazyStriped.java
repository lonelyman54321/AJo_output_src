/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped$PowerOfTwoStriped;
import com.google.common.util.concurrent.Striped$SmallLazyStriped$ArrayReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReferenceArray;

class Striped$SmallLazyStriped
extends Striped$PowerOfTwoStriped {
    final AtomicReferenceArray locks;
    final ReferenceQueue queue;
    final int size;
    final Supplier supplier;

    public Striped$SmallLazyStriped(int n3, Supplier supplier) {
        super(n3);
        AtomicReferenceArray atomicReferenceArray;
        ReferenceQueue referenceQueue;
        this.queue = referenceQueue = new ReferenceQueue();
        n3 = this.mask;
        int n4 = -1;
        n3 = n3 == n4 ? -1 >>> 1 : ++n3;
        this.size = n3;
        this.locks = atomicReferenceArray = new AtomicReferenceArray(n3);
        this.supplier = supplier;
    }

    private void drainQueue() {
        Striped$SmallLazyStriped$ArrayReference striped$SmallLazyStriped$ArrayReference;
        while ((striped$SmallLazyStriped$ArrayReference = this.queue.poll()) != null) {
            Object var4_4;
            boolean bl2;
            striped$SmallLazyStriped$ArrayReference = striped$SmallLazyStriped$ArrayReference;
            AtomicReferenceArray atomicReferenceArray = this.locks;
            int n3 = striped$SmallLazyStriped$ArrayReference.index;
            do {
                var4_4 = null;
            } while (!(bl2 = atomicReferenceArray.compareAndSet(n3, striped$SmallLazyStriped$ArrayReference, null)) && (var4_4 = atomicReferenceArray.get(n3)) == striped$SmallLazyStriped$ArrayReference);
        }
    }

    public Object getAt(int n3) {
        int n4 = this.size;
        int n7 = -1 >>> 1;
        if (n4 != n7) {
            n4 = this.size();
            Preconditions.checkElementIndex(n3, n4);
        }
        Striped$SmallLazyStriped$ArrayReference striped$SmallLazyStriped$ArrayReference = (Striped$SmallLazyStriped$ArrayReference)this.locks.get(n3);
        n7 = 0;
        Object object = striped$SmallLazyStriped$ArrayReference == null ? null : (Object)striped$SmallLazyStriped$ArrayReference.get();
        if (object != null) {
            return object;
        }
        object = this.supplier.get();
        Object object2 = this.queue;
        Striped$SmallLazyStriped$ArrayReference striped$SmallLazyStriped$ArrayReference2 = new Striped$SmallLazyStriped$ArrayReference(object, n3, (ReferenceQueue)object2);
        do {
            Object e2;
            object2 = this.locks;
            do {
                boolean bl2;
                if (!(bl2 = ((AtomicReferenceArray)object2).compareAndSet(n3, striped$SmallLazyStriped$ArrayReference, striped$SmallLazyStriped$ArrayReference2))) continue;
                this.drainQueue();
                return object;
            } while ((e2 = ((AtomicReferenceArray)object2).get(n3)) == striped$SmallLazyStriped$ArrayReference);
        } while ((object2 = (striped$SmallLazyStriped$ArrayReference = (Striped$SmallLazyStriped$ArrayReference)this.locks.get(n3)) == null ? null : striped$SmallLazyStriped$ArrayReference.get()) == null);
        return object2;
    }

    public int size() {
        return this.size;
    }
}

