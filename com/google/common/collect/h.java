/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.RegularImmutableTable;
import com.google.common.collect.Table$Cell;
import java.util.Comparator;

public final class h
implements Comparator {
    public final /* synthetic */ Comparator a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ h(Comparator comparator, Comparator comparator2) {
        this.a = comparator;
        this.b = comparator2;
    }

    public final int compare(Object object, Object object2) {
        object = (Table$Cell)object;
        object2 = (Table$Cell)object2;
        Comparator comparator = this.a;
        Comparator comparator2 = this.b;
        return RegularImmutableTable.a(comparator, comparator2, (Table$Cell)object, (Table$Cell)object2);
    }
}

