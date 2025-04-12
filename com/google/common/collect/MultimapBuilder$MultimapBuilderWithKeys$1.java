/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder$ArrayListSupplier;
import com.google.common.collect.MultimapBuilder$ListMultimapBuilder;
import com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys;
import com.google.common.collect.Multimaps;
import java.util.Map;

class MultimapBuilder$MultimapBuilderWithKeys$1
extends MultimapBuilder$ListMultimapBuilder {
    final /* synthetic */ MultimapBuilder$MultimapBuilderWithKeys this$0;
    final /* synthetic */ int val$expectedValuesPerKey;

    public MultimapBuilder$MultimapBuilderWithKeys$1(MultimapBuilder$MultimapBuilderWithKeys multimapBuilder$MultimapBuilderWithKeys, int n3) {
        this.this$0 = multimapBuilder$MultimapBuilderWithKeys;
        this.val$expectedValuesPerKey = n3;
    }

    public ListMultimap build() {
        Map map2 = this.this$0.createMap();
        int n3 = this.val$expectedValuesPerKey;
        MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier(n3);
        return Multimaps.newListMultimap(map2, multimapBuilder$ArrayListSupplier);
    }
}

