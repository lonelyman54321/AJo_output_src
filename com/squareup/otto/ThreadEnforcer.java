/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer$1;
import com.squareup.otto.ThreadEnforcer$2;

public interface ThreadEnforcer {
    public static final ThreadEnforcer ANY;
    public static final ThreadEnforcer MAIN;

    static {
        ThreadEnforcer threadEnforcer = new ThreadEnforcer$1();
        ANY = threadEnforcer;
        threadEnforcer = new ThreadEnforcer$2();
        MAIN = threadEnforcer;
    }

    public void enforce(Bus var1);
}

