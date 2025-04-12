/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys;
import com.google.common.collect.MultimapBuilder$SortedSetMultimapBuilder;
import com.google.common.collect.MultimapBuilder$TreeSetSupplier;
import com.google.common.collect.Multimaps;
import com.google.common.collect.SortedSetMultimap;
import java.util.Comparator;
import java.util.Map;

class MultimapBuilder$MultimapBuilderWithKeys$5
extends MultimapBuilder$SortedSetMultimapBuilder {
    final /* synthetic */ MultimapBuilder$MultimapBuilderWithKeys this$0;
    final /* synthetic */ Comparator val$comparator;

    public MultimapBuilder$MultimapBuilderWithKeys$5(MultimapBuilder$MultimapBuilderWithKeys multimapBuilder$MultimapBuilderWithKeys, Comparator comparator) {
        this.this$0 = multimapBuilder$MultimapBuilderWithKeys;
        this.val$comparator = comparator;
    }

    public SortedSetMultimap build() {
        Map map2 = this.this$0.createMap();
        Comparator comparator = this.val$comparator;
        MultimapBuilder$TreeSetSupplier multimapBuilder$TreeSetSupplier = new MultimapBuilder$TreeSetSupplier(comparator);
        return Multimaps.newSortedSetMultimap(map2, multimapBuilder$TreeSetSupplier);
    }
}

