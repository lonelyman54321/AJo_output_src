/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

import com.squareup.otto.Bus;

class Bus$2
extends ThreadLocal {
    final /* synthetic */ Bus this$0;

    public Bus$2(Bus bus) {
        this.this$0 = bus;
    }

    public Boolean initialValue() {
        return Boolean.FALSE;
    }
}

