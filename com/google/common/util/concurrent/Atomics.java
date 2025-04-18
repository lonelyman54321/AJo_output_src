/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class Atomics {
    private Atomics() {
    }

    public static AtomicReference newReference() {
        AtomicReference atomicReference = new AtomicReference();
        return atomicReference;
    }

    public static AtomicReference newReference(Object object) {
        AtomicReference<Object> atomicReference = new AtomicReference<Object>(object);
        return atomicReference;
    }

    public static AtomicReferenceArray newReferenceArray(int n3) {
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(n3);
        return atomicReferenceArray;
    }

    public static AtomicReferenceArray newReferenceArray(Object[] objectArray) {
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<Object>(objectArray);
        return atomicReferenceArray;
    }
}

