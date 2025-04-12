/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache$EntryFactory;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.LocalCache$StrongEntry;
import com.google.common.cache.ReferenceEntry;

final class LocalCache$EntryFactory$1
extends LocalCache$EntryFactory {
    public ReferenceEntry newEntry(LocalCache$Segment object, Object object2, int n3, ReferenceEntry referenceEntry) {
        object = new LocalCache$StrongEntry(object2, n3, referenceEntry);
        return object;
    }
}

