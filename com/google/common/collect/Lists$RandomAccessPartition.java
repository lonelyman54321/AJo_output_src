/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Lists$Partition;
import java.util.List;
import java.util.RandomAccess;

class Lists$RandomAccessPartition
extends Lists$Partition
implements RandomAccess {
    public Lists$RandomAccessPartition(List list, int n3) {
        super(list, n3);
    }
}

