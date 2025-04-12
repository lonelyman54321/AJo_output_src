/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.util;

import com.google.firebase.perf.util.StorageUnit;

final class StorageUnit$1
extends StorageUnit {
    public StorageUnit$1(long l2) {
    }

    public long convert(long l2, StorageUnit storageUnit) {
        return storageUnit.toTerabytes(l2);
    }
}

