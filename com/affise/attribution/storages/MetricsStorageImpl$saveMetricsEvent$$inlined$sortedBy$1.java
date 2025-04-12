/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.storages;

import java.io.File;
import java.util.Comparator;

public final class MetricsStorageImpl$saveMetricsEvent$$inlined$sortedBy$1
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = ((File)object).lastModified();
        object2 = ((File)object2).lastModified();
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

