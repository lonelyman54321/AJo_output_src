/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Optional$1$1;
import java.util.Iterator;

class Optional$1
implements Iterable {
    final /* synthetic */ Iterable val$optionals;

    public Optional$1(Iterable iterable) {
        this.val$optionals = iterable;
    }

    public Iterator iterator() {
        Optional$1$1 optional$1$1 = new Optional$1$1(this);
        return optional$1$1;
    }
}

