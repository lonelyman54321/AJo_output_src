/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;

interface SortedIterable
extends Iterable {
    public Comparator comparator();

    public Iterator iterator();
}

