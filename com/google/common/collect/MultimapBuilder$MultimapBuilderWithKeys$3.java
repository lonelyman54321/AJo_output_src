/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MultimapBuilder$HashSetSupplier;
import com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys;
import com.google.common.collect.MultimapBuilder$SetMultimapBuilder;
import com.google.common.collect.Multimaps;
import com.google.common.collect.SetMultimap;
import java.util.Map;

class MultimapBuilder$MultimapBuilderWithKeys$3
extends MultimapBuilder$SetMultimapBuilder {
    final /* synthetic */ MultimapBuilder$MultimapBuilderWithKeys this$0;
    final /* synthetic */ int val$expectedValuesPerKey;

    public MultimapBuilder$MultimapBuilderWithKeys$3(MultimapBuilder$MultimapBuilderWithKeys multimapBuilder$MultimapBuilderWithKeys, int n3) {
        this.this$0 = multimapBuilder$MultimapBuilderWithKeys;
        this.val$expectedValuesPerKey = n3;
    }

    public SetMultimap build() {
        Map map2 = this.this$0.createMap();
        int n3 = this.val$expectedValuesPerKey;
        MultimapBuilder$HashSetSupplier multimapBuilder$HashSetSupplier = new MultimapBuilder$HashSetSupplier(n3);
        return Multimaps.newSetMultimap(map2, multimapBuilder$HashSetSupplier);
    }
}

