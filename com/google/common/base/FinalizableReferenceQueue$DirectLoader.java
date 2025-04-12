/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.FinalizableReferenceQueue$FinalizerLoader;
import com.google.common.base.internal.Finalizer;

class FinalizableReferenceQueue$DirectLoader
implements FinalizableReferenceQueue$FinalizerLoader {
    public Class loadFinalizer() {
        Class<Finalizer> clazz = Finalizer.class;
        try {}
        catch (ClassNotFoundException classNotFoundException) {
            AssertionError assertionError = new AssertionError((Object)classNotFoundException);
            throw assertionError;
        }
        return clazz;
    }
}

