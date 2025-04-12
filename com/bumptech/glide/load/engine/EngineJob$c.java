/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class EngineJob$c
implements Iterable {
    public final List a;

    public EngineJob$c(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }
}

