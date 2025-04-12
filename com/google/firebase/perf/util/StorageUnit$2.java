/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.util;

import com.google.firebase.perf.util.StorageUnit;

final class StorageUnit$2
extends StorageUnit {
    public StorageUnit$2(long l2) {
    }

    public long convert(long l2, StorageUnit storageUnit) {
        return storageUnit.toGigabytes(l2);
    }
}

