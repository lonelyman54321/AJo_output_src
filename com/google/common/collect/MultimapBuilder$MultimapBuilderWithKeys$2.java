/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Supplier;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder$LinkedListSupplier;
import com.google.common.collect.MultimapBuilder$ListMultimapBuilder;
import com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys;
import com.google.common.collect.Multimaps;
import java.util.Map;

class MultimapBuilder$MultimapBuilderWithKeys$2
extends MultimapBuilder$ListMultimapBuilder {
    final /* synthetic */ MultimapBuilder$MultimapBuilderWithKeys this$0;

    public MultimapBuilder$MultimapBuilderWithKeys$2(MultimapBuilder$MultimapBuilderWithKeys multimapBuilder$MultimapBuilderWithKeys) {
        this.this$0 = multimapBuilder$MultimapBuilderWithKeys;
    }

    public ListMultimap build() {
        Map map2 = this.this$0.createMap();
        Supplier supplier = MultimapBuilder$LinkedListSupplier.instance();
        return Multimaps.newListMultimap(map2, supplier);
    }
}

