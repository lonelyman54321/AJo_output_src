/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Synchronized$SynchronizedList;
import java.util.List;
import java.util.RandomAccess;

class Synchronized$SynchronizedRandomAccessList
extends Synchronized$SynchronizedList
implements RandomAccess {
    private static final long serialVersionUID;

    public Synchronized$SynchronizedRandomAccessList(List list, Object object) {
        super(list, object);
    }
}

