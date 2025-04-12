/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP;

    static {
        m10 m102 = new Object();
        NOOP = m102;
    }

    public List processRegistrar(ComponentRegistrar var1);
}

